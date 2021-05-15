package com.cg.onlineadmissionsyst.exceptions;

public class BranchNotFoundException extends RuntimeException {
	public BranchNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
	public BranchNotFoundException(String message) {
		super(message);
	}
	public BranchNotFoundException(Throwable cause) {
		super(cause);
	}

}
