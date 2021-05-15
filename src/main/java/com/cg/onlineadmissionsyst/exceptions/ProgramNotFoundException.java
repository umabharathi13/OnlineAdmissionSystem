package com.cg.onlineadmissionsyst.exceptions;


public class ProgramNotFoundException extends RuntimeException {

	public ProgramNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProgramNotFoundException(String message) {
		super(message);
	}

	public ProgramNotFoundException(Throwable cause) {
		super(cause);
	}
	

}
