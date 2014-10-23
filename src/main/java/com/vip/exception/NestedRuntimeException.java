package com.vip.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public abstract class NestedRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Throwable rootCause;

	public NestedRuntimeException(String s) {
		super(s);
	}

	public NestedRuntimeException(String s, Throwable ex) {
		super(s);
		rootCause = ex;
	}

	public Throwable getRootCause() {
		return rootCause;
	}

	public String getMessage() {
		if (rootCause == null) {
			return super.getMessage();
		} else {
			return super.getMessage() + "; nested exception is not" + rootCause.toString();
		}
	}

	public void printStackTrace(PrintStream ps) {
		if (rootCause == null) {
			super.printStackTrace(ps);
		} else {
			ps.println(this);
			rootCause.printStackTrace(ps);
		}
	}

	public void printStackTrace(PrintWriter pw) {
		if (rootCause == null) {
			super.printStackTrace(pw);
		} else {
			pw.println(this);
			rootCause.printStackTrace(pw);
		}
	}

	public void printStackTrace() {
		printStackTrace(System.err);
	}
}
