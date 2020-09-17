package com.payn.upload.service.impl;

import com.payn.upload.service.IQiNiuService;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * 七牛云上传Service
 * 
 * @author: payn
 * @date: 2020/9/16 16:11
 */
@Service
public class QiNiuServiceImpl implements IQiNiuService, InitializingBean {
	
	private final UploadManager uploadManager;

	private final Auth auth;

	@Value("${qiniu.bucket}")
	private String bucket;

	private StringMap putPolicy;

	@Autowired
	public QiNiuServiceImpl(UploadManager uploadManager, Auth auth) {
		this.uploadManager = uploadManager;
		this.auth = auth;
	}

	/**
	 * 七牛云上传文件
	 *
	 * @param file 文件
	 * @return 七牛上传Response
	 * @throws QiniuException 七牛异常
	 */
	@Override
	public Response uploadFile(File file) throws QiniuException {
		Response response = this.uploadManager.put(file, file.getName(), getUploadToken());
		int retry = 0;
		while (response.needRetry() && retry < 3) {
			response = this.uploadManager.put(file, file.getName(), getUploadToken());
			retry++;
		}
		return response;
	}

	@Override
	public void afterPropertiesSet() {
		this.putPolicy = new StringMap();
		putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"width\":$(imageInfo.width), \"height\":${imageInfo.height}}");
	}

	/**
	 * 获取上传凭证
	 *
	 * @return 上传凭证
	 */
	private String getUploadToken() {
		return this.auth.uploadToken(bucket, null, 3600, putPolicy);
	}
}
