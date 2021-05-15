package com.cg.onlineadmissionsyst;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.Application;
import com.cg.onlineadmissionsyst.module.Payment;
import com.cg.onlineadmissionsyst.service.ApplicationServiceImpl;
import com.cg.onlineadmissionsyst.service.IApplicationService;

@SpringBootTest
class ApplicationTest {

	
	@Autowired
	IApplicationService appser;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}
   
	@Test
	@Disabled
	void testaddapplication() {
		LocalDate app1=LocalDate.of(1999,10,25);
		LocalDate app2=LocalDate.of(2020,10,26);		
		
		Application app=new Application();
		app.setApplicationId(35);
		app.setApplicantFullName("Luke");
		app.setEmailId("luke@gmail.com");
		app.setFinalYearPercentage(95);
		app.setApplicantInterviewFeedback("Bad");
		app.setApplicationStatus("Rejected");
		app.setGoals("Engineer");
		app.setHighestQualification("B.E");
		app.setDateOfBirth(app1);
		app.setDateOfInterview(app2);
		
		Application a= appser.addApplication(app);
	    System.out.println(a);
		assertEquals("Luke",a.getApplicantFullName());	
}
	@Test
	@Disabled
	void testviewapplication() {
		List<Application>view=appser.viewAllApplicationDetails();
		for(Application a : view) {
			System.out.println(a);
			
		}

	}	
		
	@Test
	@Disabled
	void testgetApplicationById() {
 		Application view=appser.getApplicationById(2);
 	    System.out.println(view);
 	    assertEquals(2,view.getApplicationId());
 	    assertEquals("Daniel",view.getApplicantFullName());
 	} 
	
	@Test
	@Disabled
	void testgetapplicationbyemail() {
		Application view=appser.findByEmailId("sam@gmail.com");
	    	System.out.println(view);
	    	assertEquals("Sam",view.getApplicantFullName());
	    
	}
	
	@Test
	@Disabled
	void testgetApplicationDetailsByStatus() {
 		List<Application> view=appser.findByApplicationStatus("Accepted");
 	    System.out.println(view);
 	    assertEquals(3,view.size());	
 	}
	
	@Test
	@Disabled
	void testupdateApplicationStatus() {
		Application app = new Application();
		app.setApplicationId(4);
		app.setApplicationStatus("Rejected");
		Application view = appser.updateApplicationStatus(40, app);
		System.out.println(app);
		System.out.println("APPLICATIONSTATUS UPDATED");
		assertEquals(4, view.getApplicationId());
	}
     
	@Test
	@Disabled
	  void testDeleteApplicationById() {
 		Application view=appser.deleteApplicationById(3);
 	    System.out.println("REMOVED BY ID");
 	    assertEquals(3,view.getApplicationId());
 	    assertEquals("Mark",view.getApplicantFullName());

     }
	
    @Test	
    @Disabled
	void testDeleteApplicationByEmail() {
		Application app = new Application();
		Application view = appser.deleteApplicationByEmailId("mark@gmail.com");
		System.out.println("REMOVED BY EMAILID");
		assertEquals("mark@gmail.com", view.getEmailId());
	}
}