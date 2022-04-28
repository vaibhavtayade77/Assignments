package com.yashproject.model;

public class Student {

	int sid;
	String firstname;
	String lastname;
	String fathername;
	String mothername;
	String classname;
	String section;
	String phoneno_student;
	String dob;
	String dateofsubmission;
	String gender;
	String add1;
	String add2;
	int cityid;
	String phoneno_parent;
	String email_parent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String firstname, String lastname, String fathername, String mothername, String classname,
			String section, String phoneno_student, String dob, String dateofsubmission, String gender, String add1,
			String add2, int cityid, String phoneno_parent, String email_parent) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.classname = classname;
		this.section = section;
		this.phoneno_student = phoneno_student;
		this.dob = dob;
		this.dateofsubmission = dateofsubmission;
		this.gender = gender;
		this.add1 = add1;
		this.add2 = add2;
		this.cityid = cityid;
		this.phoneno_parent = phoneno_parent;
		this.email_parent = email_parent;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getPhoneno_student() {
		return phoneno_student;
	}
	public void setPhoneno_student(String phoneno_student) {
		this.phoneno_student = phoneno_student;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDateofsubmission() {
		return dateofsubmission;
	}
	public void setDateofsubmission(String dateofsubmission) {
		this.dateofsubmission = dateofsubmission;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getPhoneno_parent() {
		return phoneno_parent;
	}
	public void setPhoneno_parent(String phoneno_parent) {
		this.phoneno_parent = phoneno_parent;
	}
	public String getEmail_parent() {
		return email_parent;
	}
	public void setEmail_parent(String email_parent) {
		this.email_parent = email_parent;
	}
}
