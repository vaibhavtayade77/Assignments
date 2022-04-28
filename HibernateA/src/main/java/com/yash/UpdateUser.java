package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateUser {
	
	public static void main(String[] args) {
		
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDAO udao = (UserDAO) objAC.getBean("userdao");
		User objE = new User();
		objE.setFirstname("swapnil");
		objE.setLastname("mayekar");
		objE.setAdd1("shri nagar");
		objE.setAdd2("sangam square");
		objE.setDob("26 nov 2000");
		objE.setEmail("srm@gmail.com");
		objE.setPassword("swapnil456");
		objE.setCity("latur");
		objE.setMobile("7410506792");
		objE.setUserid(2);
		udao.updateUser(objE);
	}

}
