package com.vip.exception;

import java.io.PrintWriter;
import java.io.StringWriter;


public class ExceptionFactory {
	
	public static long UNKNOWN_EXCEPTION=1;
    public static long BUSINESS_EXCEPTION=2;
    public static long SERVICE_EXCEPTION=3;
    public static long PERSISTENCE_EXCEPTION=4;
	
	public static ExceptionHandle createException(BaseException e){
		StackTraceElement[] stackTraces = e.getStackTrace();
		ExceptionHandle handle = new ExceptionHandle();
		handle.setClassName(stackTraces[0].getClassName());
		handle.setMethodName(stackTraces[0].getMethodName());
		handle.setLine(stackTraces[0].getLineNumber());
		
		String message =MessageResourceFactory.getInstance().createMessageResource().getString(e.getMsgCode(),e.getMsgParams());
		System.out.println("meassge-->"+message);
		handle.setExceptionMessage(message);
		StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
		handle.setStackTraceMsg(stringWriter.getBuffer().toString());
		return handle;
	}
	
}
