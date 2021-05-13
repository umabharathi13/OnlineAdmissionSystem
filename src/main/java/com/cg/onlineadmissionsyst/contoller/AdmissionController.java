package com.cg.onlineadmissionsyst.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineadmissionsyst.module.Admission;
import com.cg.onlineadmissionsyst.service.IAdmissionService;

@RestController
public class AdmissionController {
	
	
	
	@Autowired
	IAdmissionService admi;
	// WRITE
			@PostMapping("/admission")
			public Admission addAdmission(@RequestBody Admission admission) {
				return admi.save(admission);
			}
			@GetMapping("/admission")
			public List<Admission> viewAllAdmissionDetails() {
				return admi.viewAll();
}
}
