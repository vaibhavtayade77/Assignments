package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoHbmU {
	public static void main(String s[])
	{
			ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
			UserDAO udao = (UserDAO) objAC.getBean("userdao");
			User objE = new User();
			objE.setFirstname("harshal");
			objE.setLastname("jadhav");
			objE.setAdd1("ram nagar");
			objE.setAdd2("sangam square");
			objE.setDob("26 nov 1990");
			objE.setEmail("hj@gmail.com");
			objE.setPassword("harshal456");
			objE.setCity("nagar");
			objE.setMobile("7410506792");
			udao.saveUser(objE);
			
			
			
					
			
	}
}



