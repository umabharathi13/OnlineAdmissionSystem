package com.cg.onlineadmissionsyst.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.University;
import com.cg.onlineadmissionsyst.repository.IUniversityRepository;
@Service
public class UniversityService implements IUniversityService {
	@Autowired
	IUniversityRepository unirep;

	@Override
	public University save(University university) {
		return unirep.save(university);
	}
	@Override
	public University deleteByUniversityId(int universityId) {
		Optional<University> uo=unirep.findById(universityId);
		if(!uo.isPresent()) {
		return null;
		}
		unirep.deleteById(universityId);
		return uo.get();
	}

	@Override
	public University getByUniversityId(int universityId) {
		Optional <University> uo = unirep.findById(universityId);
	    if(!uo.isPresent()) {
	    	return null;
	    }
	    return uo.get();
	}
	@Override
	public List<University> findAll() {
		return unirep.findAll();
	}
	@Override
	public University update(University university) {
		Optional<University> u = unirep.findById(university.getUniversityId());
		if(!u.isPresent()) {
			return null;
		}
		
		university.setName(university.getName());
		
		return unirep.save(university);
	}
}
	
