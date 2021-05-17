package com.cg.onlineadmissionsyst.exceptions;

public class CollegeNotFoundException extends RuntimeException{
	
	public CollegeNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
	public CollegeNotFoundException(String message) {
		super(message);
	}
	public CollegeNotFoundException(Throwable cause) {
		super(cause);
	}
	public String getMessage() {
		return null;
	}


}
