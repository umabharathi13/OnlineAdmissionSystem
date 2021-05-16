package com.cg.onlineadmissionsyst.servtes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.onlineadmissionsyst.module.University;
import com.cg.onlineadmissionsyst.repository.IUniversityRepository;
import com.cg.onlineadmissionsyst.service.UniversityService;

@ExtendWith(SpringExtension.class)
public class UniversityMockito {
		@InjectMocks
		UniversityService urser;
		@MockBean
		IUniversityRepository urrep;
		
		@BeforeEach
		void init() {
			MockitoAnnotations.openMocks(this);
		}

		@Test
		void createTest() {
			University u=new University("jntu",101);
			Mockito.when(((IUniversityRepository) urrep).save(u)).thenReturn(u);
			Object ur=urrep.save(u);
			assertEquals(101,((University) ur).getUniversityId());
			assertEquals("jntu", ((University) ur).getName());
			
		}
		/*@Test
		void viewTest() {
			University u = new University("jntu",101);
			University u1 = new University("jntua",105);
			List<University> urlist = new ArrayList<>();
			urlist.add(u);
			urlist.add(u1);
			//Mockito.when(urrep.viewAllUniversityDetails()).thenReturn(urlist);
			List<University> university = urser.findAll();
			assertEquals(2, university.size());
		}*/
		@Test
		void getByIdTest() {
			University u=new University("jntu",101);
			Mockito.when(urrep.findById(101)).thenReturn(Optional.of(u));
			University u1=urser.getByUniversityId(101);
			
			
		}
		/*@Test
		void deleteTest() {
			University u=new University("jntu",101);
			Mockito.when(urrep.findById(101)).thenReturn(Optional.of(u));
			urrep.deleteUniversityById(101);
			University u1=urser.deleteByUniversityId(101);
		}*/
		@Test
		void updateTest() {
			University u1=new University("jntu",101);;
			Mockito.when(urrep.findById(101)).thenReturn(Optional.of(u1));
			Mockito.when(urrep.save(u1)).thenReturn(u1);
			University u=urser.update(u1);
			assertEquals(101,u1.getUniversityId());
			assertEquals("jntu", u1.getName());
		}
	
		
}	
		




