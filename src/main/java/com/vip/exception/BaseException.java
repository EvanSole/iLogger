package com.vip.exception;

public class BaseException extends NestedRuntimeException {


	private static final long serialVersionUID = 8132933074844038366L;
	
	private long type;
    private String msgCode;
    private String[] msgParams;

	
	public BaseException(Throwable cause,long type, String msgCode,String... msgParams){
		 super(msgCode, cause);
		 this.type =type;
		 this.msgCode = msgCode;
		 this.msgParams = msgParams;
    }
	
	public BaseException(String msgCode,String... msgParams) {
		super(msgCode);
		this.msgCode = msgCode;
		this.msgParams = msgParams;
	}
	

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String[] getMsgParams() {
		return msgParams;
	}

	public void setMsgParams(String[] msgParams) {
		this.msgParams = msgParams;
	}

}
