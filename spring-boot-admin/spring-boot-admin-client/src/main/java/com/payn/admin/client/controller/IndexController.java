package com.payn.admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author: payn
 * @date: 2020/9/15 17:44
 */
@RestController
public class IndexController {

	@GetMapping(value = {"", "/"})
	public String index() {
		return "This is a Spring Boot Admin Client.";
	}
	
}
