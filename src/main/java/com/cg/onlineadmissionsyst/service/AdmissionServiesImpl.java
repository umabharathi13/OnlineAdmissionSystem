package com.cg.onlineadmissionsyst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.Admission;
import com.cg.onlineadmissionsyst.repository.IAdmissionRepository;


@Service
public class AdmissionServiesImpl implements IAdmissionService {
	
	
	@Autowired
	IAdmissionRepository admi;
	
	@Override
	public Admission save(Admission admission) {
		// TODO Auto-generated method stub
		return admi.save(admission);
	}
	
	@Override
	public List<Admission> viewAll() {
		// TODO Auto-generated method stub
		return admi.findAll();
	}
}
