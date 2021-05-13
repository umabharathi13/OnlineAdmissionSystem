package com.cg.onlineadmissionsyst.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.Admission;
@Service
public interface IAdmissionService {
	Admission save(Admission admission);
	List<Admission> viewAll();
	
}