package com.cg.onlineadmissionsyst.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.Address;

	// Spring Data JPA
@Repository
	public interface IAddressRepository extends JpaRepository<Address, Integer > {
	
	Address findBycity(String city);

	}



