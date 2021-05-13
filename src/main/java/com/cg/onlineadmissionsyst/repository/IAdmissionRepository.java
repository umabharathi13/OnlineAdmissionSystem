package com.cg.onlineadmissionsyst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.Admission;


@Repository

	public interface IAdmissionRepository extends JpaRepository<Admission, Integer > 
	{

	Admission findByapplicationId(int applicationId);

}
