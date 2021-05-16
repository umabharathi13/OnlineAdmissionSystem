package com.cg.onlineadmissionsyst.module;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.web.bind.annotation.RestController;

@Entity
public class University {
	@Id
private int universityId ;
	
	private String name;
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="college")
	//private College college;
	

	public University() {
		
	}
	public University(String name,int universityId) {
		this.name=name;
		this.universityId=universityId;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", name=" + name + "]";
	}
	 
	

}
