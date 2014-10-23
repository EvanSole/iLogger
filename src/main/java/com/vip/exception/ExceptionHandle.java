package com.vip.exception;



public class ExceptionHandle extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 类的全路径名称
	 */
	private String className;
	/**
	 * 抛出异常处的方法名称
	 */
	private String methodName;
	/**
	 * 抛出异常方法所在的位置,行数
	 */
	private long line;
	/**
	 * 异常信息组装
	 */
	private String exceptionMessage;
	/**
	 * 堆栈信息
	 */
	private String stackTraceMsg;

	protected ExceptionHandle() {
  }

	@Override
	public String getMessage() {
		return this.getExceptionMessage();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public long getLine() {
		return line;
	}

	public void setLine(long line) {
		this.line = line;
	}


	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getStackTraceMsg() {
		return stackTraceMsg;
	}

	public void setStackTraceMsg(String stackTraceMsg) {
		this.stackTraceMsg = stackTraceMsg;
	}
}
