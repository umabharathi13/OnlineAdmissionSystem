package com.cg.onlineadmissionsyst.servtes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.Address;
import com.cg.onlineadmissionsyst.service.AddressServiceImpl;
import com.cg.onlineadmissionsyst.service.IAddressService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@SpringBootTest
class AddressTest {
	  
	@Autowired
	IAddressService as;
	
	@Test
	void addAddress()
	{
		Address addr=new Address(3,"salem","indian","salem","opp busstand","tamilnadu","635108" );
		 Address a= as.save(addr);
		 assertEquals("indian",a.getCountry());
		
	}
	@Test
    void DeleteApplicationByIdTest() {
		Address view=as.deleteAddressById(2);
	    assertEquals(2,view.getAddressId());
    }
	
	@Test
    void updateAddress() {
		Address app= new Address();
		app.setAddressId(2);
		app.setCountry("USA");
		Address view=as.updateAddress(app);
     assertEquals(2,view.getAddressId());
    }
	
	@Test
	void getAddressById() {
		Address view=as.getAddressById(1);
	    assertEquals(1,view.getAddressId());
	
	}
    
}


