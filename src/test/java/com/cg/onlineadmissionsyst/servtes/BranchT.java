package com.cg.onlineadmissionsyst.servtes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.Branch;
import com.cg.onlineadmissionsyst.service.IBranchService;

@SpringBootTest
class BranchT {
	
	@Autowired
	IBranchService brser;

	@Test
	@Disabled
	void testfindAll() {
		List<Branch> b= brser.findAll();
		for(Branch b1:b) {
			System.out.println(b1);
		}
		assertEquals(14,b.size());
	}
	@Test
	@Disabled
	void testFindBranchById() {
		Branch b=brser.getByBId(106);
		assertEquals("PHY",b.getBranchName());
	}
	@Test
	@Disabled
	void testCreateBranch() {
		Branch branch=new Branch(113,"Info Tech","IT");
		Branch b = brser.save(branch);
		assertEquals(113,b.getBranchId());
	}
	@Test
	@Disabled
	void updateBranchTest() {
		Branch b=new Branch();
		b.setBranchId(109);
		b.setBranchName("Phy");
		b.setBranchDescription("Physics");
		Branch b1=brser.update(b);
		assertEquals(109,b1.getBranchId());
	}
	@Test
	@Disabled
	void deleteBranchIdTest() {
		brser.deleteByBranchId(106);
		System.out.println("deleted");
	}
	@Test
	@Disabled
	void getdetByNameTest() {
		Branch b=brser.findByName("EEE");
		assertEquals("EEE",b.getBranchName());
	}
	@Test
    @Disabled
	void deleteBranchNameTest() {
	    brser.deleteBranchByBranchName("CSE");
		System.out.println("deleted");
		
	}

}
