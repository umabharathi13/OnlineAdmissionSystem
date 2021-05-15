package com.cg.onlineadmisssionsyst.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.onlineadmissionsyst.module.Application;
import com.cg.onlineadmissionsyst.repository.IApplicationRepository;
import com.cg.onlineadmissionsyst.service.ApplicationServiceImpl;


@ExtendWith(SpringExtension.class)
class ApplicationMockitoTest {
	
	@InjectMocks
	ApplicationServiceImpl appService;
	
	@MockBean
	IApplicationRepository appRepo;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
//	@Disabled
	void testAddApplication() {
		LocalDate app1=LocalDate.of(1999,10,25);
		LocalDate app2=LocalDate.of(2020,10,26);		
			
		Application application = new Application(30,"Leanord",app1,"B.E",85,"Engineer","leanord@gmail.com","Accepted",app2,"Good");
		
		Mockito.when(appRepo.save(application)).thenReturn(application);
		
		Application app = appService.addApplication(application);
		
		assertEquals(30, app.getApplicationId());
		
	}
	
	@Test
//	@Disabled
	void testviewAllApplicationDetails() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Accepted", app2, "Good");
		Application application1 = new Application(32, "Lucifer", app1, "B.E", 76, "Engineer", "lucifer@gmail.com",
				"Rejected", app2, "Bad");

		List<Application> applicationList = new ArrayList<>();
		applicationList.add(application);
		applicationList.add(application1);

		Mockito.when(appRepo.findAll()).thenReturn(applicationList);

		List<Application> app = appService.viewAllApplicationDetails();

		assertEquals(2, app.size());

	}
	
	@Test
//	@Disabled
	void testGetApplicationById() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Accepted", app2, "Good");
		
		Mockito.when(appRepo.findById(31)).thenReturn(Optional.of(application));
		
		Application app = appService.getApplicationById(31);
		
		assertEquals(31, app.getApplicationId());
		
	}
	
	@Test
//	@Disabled
	void testFindByEmailId() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application1 = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Accepted", app2, "Good");
		
		Mockito.when(appRepo.findByEmailId("decker@gmail.com")).thenReturn(application1);
		
		Application app = appService.findByEmailId("decker@gmail.com");
		assertEquals("decker@gmail.com",app.getEmailId());
				
	}
	
	@Test
//	@Disabled
	void testFindByApplicationStatus() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application1 = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Rejected", app2, "Good");
		Application application2 = new Application(32, "Lucifer", app1, "B.E", 76, "Engineer", "lucifer@gmail.com",
				"Rejected", app2, "Bad");
		Application application3 = new Application(33, "Daniel", app1, "B.E", 66, "Engineer", "daniel@gmail.com",
				"Rejected", app2, "Bad");
		
		List<Application> applicationList=new ArrayList<>();
		applicationList.add(application1);
		applicationList.add(application2);
		applicationList.add(application3);
		
		Mockito.when(appRepo.findByApplicationStatus("Rejected")).thenReturn(applicationList);	
		List<Application> app = appService.findByApplicationStatus("Rejected");
	//	System.out.println(app);
		assertEquals(3, app.size());
		
	}	
	
	@Test
//	@Disabled
	void testUpdateApplicationStatus() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Accepted", app2, "Good");
		application.setApplicationId(31);
		application.setApplicationStatus("Rejected");
		Mockito.when(appRepo.findById(31)).thenReturn(Optional.of(application));
		Mockito.when(appRepo.save(application)).thenReturn(application);
		
		Application view = appService.updateApplicationStatus(31, application);
		
		assertEquals("Rejected", view.getApplicationStatus());	
		
	}
	
	@Test
//	@Disabled
	void testDeleteApplicationById() {
	LocalDate app1 = LocalDate.of(1999, 10, 25);
	LocalDate app2 = LocalDate.of(2020, 10, 26);
	Application application = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
			"Accepted", app2, "Good");
	Mockito.when(appRepo.findById(31)).thenReturn(Optional.of(application));
	appRepo.deleteById(31);
	Application view = appService.deleteApplicationById(31);
	assertEquals(31,view.getApplicationId());
	
	}
	
	@Test
//	@Disabled
	void testDeleteApplicationByEmailIdId() {
		LocalDate app1 = LocalDate.of(1999, 10, 25);
		LocalDate app2 = LocalDate.of(2020, 10, 26);
		Application application = new Application(31, "Decker", app1, "B.E", 86, "Engineer", "decker@gmail.com",
				"Accepted", app2, "Good");
		Mockito.when(appRepo.findByEmailId("decker@gmail.com")).thenReturn(application);
		appRepo.deleteApplicationByEmailId(null);
		
	}
	
	
}
