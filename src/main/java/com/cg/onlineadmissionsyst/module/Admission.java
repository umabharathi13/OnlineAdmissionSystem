package com.cg.onlineadmissionsyst.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admission {
	@Id
	private int applicationId;
	private String emailId;
	private String admissionStatus;//Confirm after payment done;
	private String year;
	public Admission(int applicationId,String admissionStatus,String emailId,String year) {
		super();
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.admissionStatus = admissionStatus;
		this.year = year;
	}
	public Admission() {
		super();
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Admission [emailId=" + emailId + ", applicationId=" + applicationId + ", admissionStatus="
				+ admissionStatus + ", year=" + year + "]";
	}

}

