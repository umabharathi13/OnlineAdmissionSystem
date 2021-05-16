package com.cg.onlineadmissionsyst.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.University;
@Repository
public interface IUniversityRepository extends JpaRepository<University, Integer >  {
	
}