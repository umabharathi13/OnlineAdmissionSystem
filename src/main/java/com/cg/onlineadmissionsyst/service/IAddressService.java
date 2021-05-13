package com.cg.onlineadmissionsyst.service;

import org.springframework.stereotype.Service;

import com.cg.onlineadmissionsyst.module.Address;
@Service
public interface IAddressService {
	Address save(Address address);
	Address deleteAddressById(int addressId);
	Address getAddressById(int addressId);
	 Address updateAddress(Address add);
		 		
	}

	
	

