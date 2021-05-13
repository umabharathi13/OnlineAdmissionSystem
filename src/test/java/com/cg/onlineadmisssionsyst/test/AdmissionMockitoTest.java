package com.cg.onlineadmisssionsyst.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.onlineadmissionsyst.module.Address;
import com.cg.onlineadmissionsyst.module.Admission;
import com.cg.onlineadmissionsyst.module.Document;
import com.cg.onlineadmissionsyst.repository.IAdmissionRepository;
import com.cg.onlineadmissionsyst.service.AdmissionServiesImpl;


@ExtendWith(SpringExtension.class)
class AdmissionMockitoTest {
	@InjectMocks
	AdmissionServiesImpl ass;
	
	@MockBean
	IAdmissionRepository ar;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	
	void testAdd(){
		Admission a=new Admission(2,"approved","uae@gmail.com","2020");
		Mockito.when(ar.save(a)).thenReturn(a);
		Admission admission=ass.save(a);
		assertEquals(2,admission.getApplicationId());
	}
	
	@Test
	void viewAll() {
		Admission a1=new Admission(1,"pending","usa@gmail.com","2020");
		Admission a2=new Admission(2,"approved","uae@gmail.com","2020");
		List<Admission>l=new ArrayList<>();
		l.add(a1);
		l.add(a2);
		Mockito.when(ass.viewAll()).thenReturn(l);
		List<Admission>admissionlist=ass.viewAll();
		assertEquals(2,admissionlist.size());
	}
}
