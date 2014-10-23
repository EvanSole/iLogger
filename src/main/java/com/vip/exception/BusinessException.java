package com.vip.exception;

public class BusinessException extends BaseException {

	private static final long serialVersionUID = -8674854656563930979L;
	
	public BusinessException(Throwable cause,String msgCode,String... msgParams) {
		super(cause,ExceptionFactory.BUSINESS_EXCEPTION, msgCode, msgParams);
	}

	public BusinessException(String msgCode,String... msgParams) {
		super(msgCode, msgParams);
	}

}
