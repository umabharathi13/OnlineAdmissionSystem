package com.cg.onlineadmissionsyst.service;

import java.util.List;

import com.cg.onlineadmissionsyst.module.Application;

public interface IApplicationService {
    
	Application addApplication(Application application);

	List<Application> viewAllApplicationDetails();

	Application getApplicationById(int applicationId);

	Application updateApplicationStatus(int id, Application application);

	Application deleteApplicationById(int applicationId);

	Application findByEmailId(String emailId);

	List<Application> findByApplicationStatus(String applicationStatus);
	

	Application deleteApplicationByEmailId(String emailId);


	



	

}
