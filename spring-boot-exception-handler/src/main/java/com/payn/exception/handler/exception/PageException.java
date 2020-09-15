package com.payn.exception.handler.exception;

import com.payn.exception.handler.constant.Status;

/**
 * @author: payn
 * @date: 2020/9/15 21:14
 */
public class PageException extends BaseException {

	public PageException(Status status) {
		super(status);
	}

	public PageException(Integer code, String message) {
		super(code, message);
	}
}
