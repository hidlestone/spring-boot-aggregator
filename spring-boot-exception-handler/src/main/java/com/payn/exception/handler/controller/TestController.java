package com.payn.exception.handler.controller;

import com.payn.exception.handler.constant.Status;
import com.payn.exception.handler.exception.JsonException;
import com.payn.exception.handler.exception.PageException;
import com.payn.exception.handler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: payn
 * @date: 2020/9/15 21:19
 */
@Controller
public class TestController {

	@GetMapping("/json")
	@ResponseBody
	public ApiResponse jsonException() {
		throw new JsonException(Status.UNKNOWN_ERROR);
//		return ApiResponse.ofSuccess(null);
	}

	@GetMapping("/page")
	public ModelAndView pageException() {
		throw new PageException(Status.UNKNOWN_ERROR);
	}
}
