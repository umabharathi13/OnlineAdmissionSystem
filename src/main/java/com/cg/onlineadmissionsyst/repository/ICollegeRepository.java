package com.cg.onlineadmissionsyst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.College;

@Repository
public interface ICollegeRepository extends JpaRepository<College,Integer> {
	

}
