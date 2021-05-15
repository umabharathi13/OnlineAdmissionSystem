package com.cg.onlineadmissionsyst.service;


import java.util.List;


import com.cg.onlineadmissionsyst.module.ProgramScheduled;

public interface IProgramScheduledService {

	ProgramScheduled addProgramSchedule(ProgramScheduled programScheduled);
	List<ProgramScheduled> viewAllProgramScheduleDetails();
	ProgramScheduled getProgramScheduleById(int scheduleId);
    ProgramScheduled deleteProgramScheduleById(int scheduleId);
    ProgramScheduled updateProgramSchedule(int scheduledId,ProgramScheduled programSchedule);
    List<ProgramScheduled> findByStartDate(String startDate);	
 
    
   
	//public  ArrayList<ProgramScheduled>getProgramScheduleByCollegeName(String collegeName);

}
