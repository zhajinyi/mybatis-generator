package com.zjy.generator.utils;

import lombok.Data;

/**
 * 自定义异常
 *
 * @author zhajinyi
 * @date 2019年06月17日 上午10:27:52
 */
@Data
public class Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public Exception(String msg) {
		super(msg);
		this.msg = msg;
	}

	Exception(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public Exception(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public Exception(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}
}
