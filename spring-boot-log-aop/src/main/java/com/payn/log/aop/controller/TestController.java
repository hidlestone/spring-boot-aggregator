package com.payn.log.aop.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: payn
 * @date: 2020/9/15 20:47
 */
@RestController
public class TestController {

	/**
	 * 测试方法
	 */
	@GetMapping("/test")
	public Dict test(String who) {
		return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
	}
}
