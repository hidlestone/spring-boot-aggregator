package com.payn.exception.handler.exception;

import com.payn.exception.handler.constant.Status;
import lombok.Getter;

/**
 * JSON异常
 *
 * @author: payn
 * @date: 2020/9/15 21:13
 */
@Getter
public class JsonException extends BaseException {

	public JsonException(Status status) {
		super(status);
	}

	public JsonException(Integer code, String message) {
		super(code, message);
	}
}
