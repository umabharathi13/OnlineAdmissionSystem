package com.cg.onlineadmissionsyst.service;

import java.util.List;

import com.cg.onlineadmissionsyst.module.Program;

public interface IProgramService {
	
	 Program addProgram(Program program);
	 List<Program>viewAllProgramDetails();
	 Program getProgramById(int programId);  
	 Program deleteProgramById(int programId);	
	 List<Program>findByProgramName(String programName);
	 List<Program>findByProgramEligibility(String programEligibility);
	 Program updateProgramStatus(int pgmid,Program program);
	 List<Program> deleteProgramByProgramName(String programName);
	 
	 
	/*
    public ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
    */

}
