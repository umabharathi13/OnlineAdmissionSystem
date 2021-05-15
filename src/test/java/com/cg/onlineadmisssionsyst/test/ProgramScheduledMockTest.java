package com.cg.onlineadmisssionsyst.test;

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

import com.cg.onlineadmissionsyst.module.Program;
import com.cg.onlineadmissionsyst.module.ProgramScheduled;
import com.cg.onlineadmissionsyst.repository.IProgramRepository;
import com.cg.onlineadmissionsyst.repository.IProgramScheduledRepositoy;
import com.cg.onlineadmissionsyst.service.ProgramScheduledService;
import com.cg.onlineadmissionsyst.service.ProgramService;

@ExtendWith(SpringExtension.class)
class ProgramScheduledMockTest {

	@InjectMocks
	ProgramScheduledService pss;
	
	@MockBean
	IProgramScheduledRepositoy ipsrep;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testaddProgramSchedule(){
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		Mockito.when(ipsrep.save(psch)).thenReturn(psch);
		ProgramScheduled programScheduled=pss.addProgramSchedule(psch);
		assertEquals(111,programScheduled.getScheduleId());
	}
	@Test
	void testviewAllProgramScheduleDetails() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		ProgramScheduled psch1=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		List<ProgramScheduled> pgmlist=new ArrayList<>();
		pgmlist.add(psch);
		pgmlist.add(psch1);
		Mockito.when(ipsrep.findAll()).thenReturn(pgmlist);
		List<ProgramScheduled> pgmm=pss.viewAllProgramScheduleDetails();
		assertEquals(2,pgmm.size());
	}
	
	@Test
	void testgetProgramScheduleById() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		Mockito.when(ipsrep.findById(103)).thenReturn(Optional.of(psch));
		assertEquals(111,psch.getScheduleId());
	}
	@Test
	void testdeleteProgramScheduleById() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		Mockito.when(ipsrep.findById(111)).thenReturn(Optional.of(psch));
		ipsrep.deleteById(111);
		assertEquals(111,psch.getScheduleId());
	}
	
	@Test 
	void testupdateProgramSchedule() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		Mockito.when(ipsrep.findById(111)).thenReturn(Optional.of(psch));
		Mockito.when(ipsrep.save(psch)).thenReturn(psch);
		ProgramScheduled programScheduled=pss.updateProgramSchedule(111,psch);
		assertEquals("2017-04-16",programScheduled.getStartDate());
		assertEquals("2017-12-28",programScheduled.getEndDate());
		assertEquals("Part time",programScheduled.getProgramSchedule());
	}
	
	@Test
	void testgetProgramScheduleByStartDate() {
		ProgramScheduled psch=new ProgramScheduled(111,"2017-04-16","2017-12-28","Part time");
		List<ProgramScheduled> pgm1=new ArrayList<>();
		pgm1.add(psch);
		Mockito.when(ipsrep.findByStartDate("2017-04-16")).thenReturn((pgm1));
		List<ProgramScheduled> pg = pss.findByStartDate("2017-04-16");
		assertEquals(1,pg.size());			
	}	
}
