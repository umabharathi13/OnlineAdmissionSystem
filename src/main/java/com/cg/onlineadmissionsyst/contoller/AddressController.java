package com.cg.onlineadmissionsyst.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineadmissionsyst.exceptions.AddressNotFoundException;
import com.cg.onlineadmissionsyst.module.Address;
import com.cg.onlineadmissionsyst.service.IAddressService;
@RestController
public class AddressController {
	

		@Autowired
		IAddressService addService;
		// WRITE
				@PostMapping("/address")
				public Address addAddress(@RequestBody Address address) {
					return addService.save(address);
				}
		
		// READ
				@DeleteMapping("/address/{Id}")
				public Address deleteAddress(@PathVariable("Id") int addressId) {
					if(addService.getAddressById(addressId)==null)
					{
						throw new AddressNotFoundException("Address not found with given id: "+addressId);
					}
					return addService.deleteAddressById(addressId);
				}
		
		
		
		// GET
		@GetMapping("/address/{id}")
		public Address getAddressById(@PathVariable("id") int addressId) {
			if(addService.getAddressById(addressId)==null)
			{
				throw new AddressNotFoundException("Address not found with given id: "+addressId);
			}
			return addService.getAddressById(addressId);
		}
		
		// UPDATE
		// Updating specific property
		@PatchMapping("/address/{String}")
		public Address updateAddress(@PathVariable("String") String country, @RequestBody Address address) {
			if(addService.updateAddress(address)==null)
			{
				throw new AddressNotFoundException("Address not found with given name: "+address);
			}
			return addService.updateAddress(address);
		
		
		}
	}




