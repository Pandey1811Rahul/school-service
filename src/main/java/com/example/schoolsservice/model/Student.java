package com.example.schoolsservice.model;

public class Student {

	private String name;
	private String dob;
	private static String schoolName="XYZ";
	public Student() {
		super();
	}
	public Student(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

	

}
