package com.yash.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Client {
	
	int cid;
	
	@NonNull
	@Pattern(regexp="^[a-zA-Z0-9 ]{5,15}$",message="name can only contain alphabets and digits and minimum length is 5")
	String cname;
	
	@Size(min=7, max = 14, message="password should be between 7 to 14 in length")
	String password;
	
	@NotEmpty
	@Email(message = "please enter valid email")
	String email;
	
	@NotEmpty(message="please enter address for communication")
	String cityaddress;
	
	@Pattern(regexp="^[6-9][0-9]{9}$",message="please start no with 6 ,7, 8 or 9 exact digit 10")
	String contactno;
	public Client() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCityaddress() {
		return cityaddress;
	}
	public void setCityaddress(String cityaddress) {
		this.cityaddress = cityaddress;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	

}
