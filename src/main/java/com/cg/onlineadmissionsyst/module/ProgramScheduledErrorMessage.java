package com.cg.onlineadmissionsyst.module;

public class ProgramScheduledErrorMessage {
	private int status;
	private String message;
	private long timeStamp;
	
	public ProgramScheduledErrorMessage() {}
	
	public ProgramScheduledErrorMessage(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public String toString() {
		return "ProgramScheduledErrorMessage [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp
				+ "]";
	}
	
	
}
