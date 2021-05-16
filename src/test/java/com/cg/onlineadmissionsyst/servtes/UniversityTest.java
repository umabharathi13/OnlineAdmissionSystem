package com.cg.onlineadmissionsyst.servtes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.University;
import com.cg.onlineadmissionsyst.service.IUniversityService;

@SpringBootTest
public class UniversityTest {
		
		@Autowired
		IUniversityService uniser;

		@Test	
		@Disabled
		void testfindAll() {
			List<University> u= uniser.findAll();
			for(University u1:u) {
				System.out.println(u1);
			}
			assertEquals(1,u.size());
		}
		@Test
		@Disabled
		void testFindUniversityById() {
			University u=uniser.getByUniversityId(105);
			assertEquals(105,u.getUniversityId());
		}
		@Test
		@Disabled
		void testCreateUniversity() {
		University university=new University("Jntu",101);
			University u = uniser.save(university);
			assertEquals(101,u.getUniversityId());
		}
		@Test
		@Disabled
		void updateUniversityTest() {
			University u=new University();
			u.setUniversityId(105);
			u.setName("KLU");
			
			University u1=uniser.update(u);
			assertEquals(105,u1.getUniversityId());
		}
		@Test
		@Disabled
		void deleteUniversityTest() {
			uniser.deleteByUniversityId(105);
			System.out.println("deleted");
		}
		

}
