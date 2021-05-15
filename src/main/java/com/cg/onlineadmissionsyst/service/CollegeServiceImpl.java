package com.cg.onlineadmissionsyst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.College;
import com.cg.onlineadmissionsyst.repository.ICollegeRepository;

@Service
public class CollegeServiceImpl implements ICollegeService {
	
	@Autowired
	ICollegeRepository corep;

	@Override
	public College save(College college) {
		return corep.save(college);
	}

	@Override
	public List<College> findAll() {
		return corep.findAll();
	}

}
