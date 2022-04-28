package com.yash.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.UniqueElements;

public class User {
	
	int userid;
	String fname;
	String lname;
	
	@NotEmpty
	@UniqueElements
	@Email(message = "please enter valid email")
	String email;
	String password;
	String gender;
	String dob;
	String dor;
	String sec_question;
	String sec_answer;
	public User() {
		
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public String getSec_question() {
		return sec_question;
	}
	public void setSec_question(String sec_question) {
		this.sec_question = sec_question;
	}
	public String getSec_answer() {
		return sec_answer;
	}
	public void setSec_answer(String sec_answer) {
		this.sec_answer = sec_answer;
	}
	

}
