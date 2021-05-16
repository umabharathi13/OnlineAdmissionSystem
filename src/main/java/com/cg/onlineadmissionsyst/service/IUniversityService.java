package com.cg.onlineadmissionsyst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.University;
@Service
public interface IUniversityService {
	University save(University University);

	University deleteByUniversityId(int universityId);

	University getByUniversityId(int universityId);

	List<University> findAll();

	University update(University university);

	
}
