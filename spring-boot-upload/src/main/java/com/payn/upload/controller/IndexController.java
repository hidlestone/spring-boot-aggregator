package com.payn.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页Controller
 * 
 * @author: payn
 * @date: 2020/9/16 9:04
 */
@Controller
public class IndexController {

	@GetMapping("")
	public String index() {
		return "index";
	}
}
