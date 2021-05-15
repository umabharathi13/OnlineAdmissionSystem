package com.cg.onlineadmissionsyst.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.College;

@Service
public interface ICollegeService {

	College save(College college);

	List<College> findAll();

}
