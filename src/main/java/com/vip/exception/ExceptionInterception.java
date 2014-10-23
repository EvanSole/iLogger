package com.vip.exception;

import org.aopalliance.intercept.Interceptor;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

public class ExceptionInterception implements Interceptor {
	
	private static final Logger _log = (Logger) LogFactory.getLog(ExceptionInterception.class);

	public static final String EXCEPTION = "exception";
	
}
