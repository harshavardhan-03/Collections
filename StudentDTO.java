package com.xworkz.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	private String name;
	private String branch;
	private String usn;
	private String year;
	
	StudentDTO() {
		System.out.println("Default Constructor");
	}
	public StudentDTO(String name, String branch, String usn, String year) {
		super();
		this.name = name;
		this.branch = branch;
		this.usn = usn;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", branch=" + branch + ", usn=" + usn + ", year=" + year + "]";
	}
	
	
	
	
}
