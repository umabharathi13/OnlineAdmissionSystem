package com.cg.onlineadmissionsyst.exceptions;

public class ProgramScheduledNotFoundException extends RuntimeException {

	public ProgramScheduledNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProgramScheduledNotFoundException(String message) {
		super(message);
	}

	public ProgramScheduledNotFoundException(Throwable cause) {
		super(cause);
	}
	

}
