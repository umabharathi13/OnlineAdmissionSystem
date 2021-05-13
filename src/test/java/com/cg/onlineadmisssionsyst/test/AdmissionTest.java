package com.cg.onlineadmisssionsyst.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.Address;
import com.cg.onlineadmissionsyst.module.Admission;
import com.cg.onlineadmissionsyst.service.IAdmissionService;


@SpringBootTest
	class AdmissionTest {
	
	
	@Autowired
	IAdmissionService ad;

		@Test
		void addAdmission()
		{
			Admission add=new Admission(1,"pending","usa@gmail.com","2020");
			 Admission a= ad.save(add);
			 assertEquals("2020",a.getYear());
			
		}

		@Test
		@Disabled
		void viewadmissiontest() {
			List<Admission> view = ad.viewAll();
			assertEquals(1,view.size());

			}
		
		}
	
