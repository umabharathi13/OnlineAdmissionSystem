package com.cg.onlineadmissionsyst.module;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class ProgramScheduled {
	@Id
	private int scheduleId;
	private String startDate;
	private String endDate;
	private String programSchedule;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="program_id")
	private Program program;
	
	public ProgramScheduled() {}

public ProgramScheduled(int scheduleId, String startDate, String endDate, String programSchedule) {
	super();
	this.scheduleId = scheduleId;
	this.startDate = startDate;
	this.endDate = endDate;
	this.programSchedule = programSchedule;
}

public int getScheduleId() {
	return scheduleId;
}

public void setScheduleId(int scheduleId) {
	this.scheduleId = scheduleId;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public String getProgramSchedule() {
	return programSchedule;
}

public void setProgramSchedule(String programSchedule) {
	this.programSchedule = programSchedule;
}
@JsonManagedReference
public Program getProgram() {
	return program;
}

public void setProgram(Program program) {
	this.program = program;
}

@Override
public String toString() {
	return "ProgramScheduled [scheduleId=" + scheduleId + ", startDate=" + startDate + ", endDate=" + endDate
			+ ", programSchedule=" + programSchedule + "]";
}

}

	