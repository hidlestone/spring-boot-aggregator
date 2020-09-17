package com.payn.upload.service;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;

public interface IQiNiuService {

	/**
	 * 七牛云上传文件
	 */
	Response uploadFile(File file) throws QiniuException;
}
