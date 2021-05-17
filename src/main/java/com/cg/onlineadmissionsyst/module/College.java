package com.cg.onlineadmissionsyst.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class College {
	
	@Id
	private int collegeRegId;
	private String collegeName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="college_id")  
	private List<Course> course = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="addr_id") 
	private Address collegeAddress;	
	
    //private ArrayList<Program> programList;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	private University university;
	
	public College(){}
	public College(int collegeRegId, String collegeName, List<Course> course) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.course = course;
	}
	public College(int collegeRegId, String collegeName, List<Course> course, Address collegeAddress,
			University university) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
		this.course = course;
		this.collegeAddress = collegeAddress;
		this.university = university;
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
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Address getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	@Override
	public String toString() {
		return "College [collegeRegId=" + collegeRegId + ", collegeName=" + collegeName + ", course=" + course
				+ ", collegeAddress=" + collegeAddress + ", university=" + university + "]";
	}
	

	
	

}
