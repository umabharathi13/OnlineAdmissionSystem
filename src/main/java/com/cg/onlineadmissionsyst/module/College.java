package com.cg.onlineadmissionsyst.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	private int collegeRegId;
	private String collegeName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="college_id")  
	private List<Course> course = new ArrayList<>();
	
	//private Address collegeAddress;	
    //private ArrayList<Program> programList;
	//private University universityName;
	
	public College(){}
	public College(int collegeRegId, String collegeName, List<Course> course) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.course = course;
	}
	public int getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(int collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "College [collegeRegId=" + collegeRegId + ", collegeName=" + collegeName + ", course=" + course + "]";
	}
	
	

}
