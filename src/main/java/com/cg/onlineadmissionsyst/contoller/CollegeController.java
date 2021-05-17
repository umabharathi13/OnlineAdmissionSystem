package com.cg.onlineadmissionsyst.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineadmissionsyst.module.College;
import com.cg.onlineadmissionsyst.module.Course;
import com.cg.onlineadmissionsyst.service.ICollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	ICollegeService coser;
	
	@PostMapping("/college")
	public College addCollege(@RequestBody College college) {
		return coser.save(college);
	}
	
	@GetMapping("/college")
	public List<College> findAllCourse() {
		return coser.findAll();
	}
}
