package com.vip.exception;

public class ServiceException extends BaseException{

	private static final long serialVersionUID = 2417827859153742476L;

	public ServiceException(Throwable cause,String msgCode,String... msgParams) {
		super(cause,ExceptionFactory.SERVICE_EXCEPTION, msgCode, msgParams);
	}

	public ServiceException(String msgCode,String... msgParams) {
		super(msgCode, msgParams);
	}
}
