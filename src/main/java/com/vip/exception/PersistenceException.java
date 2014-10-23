package com.vip.exception;

public class PersistenceException extends BaseException {
	
	private static final long serialVersionUID = -604804738297228L;

	public PersistenceException(Throwable cause,String msgCode,String... msgParams) {
		super(cause,ExceptionFactory.PERSISTENCE_EXCEPTION, msgCode, msgParams);
	}

	public PersistenceException(String msgCode,String... msgParams) {
		super(msgCode, msgParams);
	}
}
