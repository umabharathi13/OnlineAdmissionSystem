package com.cg.onlineadmissionsyst.servtes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.onlineadmissionsyst.module.Program;
import com.cg.onlineadmissionsyst.module.ProgramScheduled;
import com.cg.onlineadmissionsyst.service.IProgramScheduledService;

@SpringBootTest
class ProgramScheduledTest {
	
	@Autowired
	IProgramScheduledService ipgmser;

	@BeforeEach
	void setup() throws Exception {
		System.out.println("setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	@Disabled
	void testaddProgramSchedule() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		Program pgm = new Program(112,"ML","2 years","B.S.C","MAchined learning","12th","Completed");
		psch.setProgram(pgm);
		pgm.setProgramScheduled(psch);	
		ProgramScheduled p = ipgmser.addProgramSchedule(psch);
		System.out.println(p);
		System.out.println("Added Successfully");
		assertEquals(111, p.getScheduleId());
	}
	
	@Test
	@Disabled
	void testviewAllProgramScheduleDetails() {
		List<ProgramScheduled> view = ipgmser.viewAllProgramScheduleDetails();
		for (ProgramScheduled p : view) {
			System.out.println(p);
		}
	}

	@Test
	@Disabled
    void testgetProgramScheduleById() {
		ProgramScheduled view=ipgmser.getProgramScheduleById(112);
		System.out.println(view);
		System.out.println("got");
	    assertEquals(112,view.getScheduleId());
    }

	@Test
	@Disabled
    void testdeleteProgramScheduleById() {
		ProgramScheduled view=ipgmser.deleteProgramScheduleById(111);
		System.out.println(view);
	    System.out.println("removed");
	    assertEquals(111,view.getScheduleId());
	      }

	@Test
	@Disabled
	void testupdateProgramSchedule() {
		ProgramScheduled pgms = new ProgramScheduled();
		pgms.setScheduleId(110);
		pgms.setProgramSchedule("Part time");
		pgms.setStartDate(" 2015-10-12");
		pgms.setEndDate(" 2016-11-15");
		
		ProgramScheduled view=ipgmser.updateProgramSchedule(110,pgms);
		System.out.println(view);
		System.out.println("Program Schedule updated");
		assertEquals(110,view.getScheduleId());
	}

	@Test
	@Disabled
	void testgetProgramScheduleByStartDate() {
		List<ProgramScheduled> view = ipgmser.findByStartDate("2015-03-12");
		for (ProgramScheduled p : view) {
			System.out.println(p);
		}
	}
}
