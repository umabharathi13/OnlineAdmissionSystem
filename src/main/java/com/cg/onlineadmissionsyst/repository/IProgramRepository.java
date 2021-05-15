package com.cg.onlineadmissionsyst.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.Program;


@Repository
public interface IProgramRepository extends JpaRepository<Program,Integer> {
	
	
	List<Program> findByProgramName(String programName);
	List<Program> findByProgramEligibility(String programEligibility);
	
	@Query("select p from Program p where p.programName=:n")
	public Program getProgramByName(@Param("n") String programName);
	
	@Query(value = "delete from Program where program_name=:program_name",nativeQuery=true)
	List<Program> deleteProgramByProgramName(@Param("program_name") String programName);
	
}
