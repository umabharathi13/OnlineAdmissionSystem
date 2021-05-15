package com.cg.onlineadmissionsyst.repository;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.ProgramScheduled;

@Repository
public interface IProgramScheduledRepositoy extends JpaRepository<ProgramScheduled,Integer> {

	List<ProgramScheduled> findByStartDate(String startDate);

}
