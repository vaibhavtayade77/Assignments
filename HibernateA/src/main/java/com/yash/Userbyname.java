package com.yash;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Userbyname {
	public static void main(String[] args) {

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDAO udao = (UserDAO) objAC.getBean("userdao");

		User objE = new User();
		int ch;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter 1 for find by email and 2 for find by user name and 3 for find by mobile no");
			ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				String f;
				System.out.println("Enter email");
				f = sc.nextLine();
				List<User> email = udao.getEmpByname(f);
				for (User v : email) {
					if (f.equals(v.getEmail())) {

						System.out.println(v.getFirstname() + "-" + v.getLastname() + "-" + v.getAdd1() + "-"
								+ v.getAdd2() + "-" + v.getDob() + "-" + v.getEmail() + "-" + v.getPassword() + "-"
								+ v.getCity() + "-" + v.getMobile());
					}
				}
				break;

			case 2:
				String f1;
				System.out.println("Enter First name ");
				f1 = sc.nextLine();
				List<User> ur = udao.getEmpByname(f1);
				for (User e : ur) {

					if (f1.equals(e.getFirstname())) {

						System.out.println(e.getUserid()+"-"+e.getFirstname() + "-" + e.getLastname() + "-" + e.getAdd1() + "-"
								+ e.getAdd2() + "-" + e.getDob() + "-" + e.getEmail() + "-" + e.getPassword() + "-"
								+ e.getCity() + "-" + e.getMobile());

					}}
					break;
					
			case 3:
				String f2;
				System.out.println("Enter valid mobile number");
				f2=sc.nextLine();
				List<User> mn=udao.getEmpByname(f2);
				for(User m:mn) {
					
					if(f2.equals(m.getMobile())) {
						System.out.println(m.getUserid()+"-"+m.getFirstname() + "-" + m.getLastname() + "-" + m.getAdd1() + "-"
								+ m.getAdd2() + "-" + m.getDob() + "-" + m.getEmail() + "-" + m.getPassword() + "-"
								+ m.getCity() + "-" + m.getMobile());
						
					}

				}
				break;
			default:
			case 4:
				System.out.println("exit");
			}
			

		}
	}
}

//		List<User> e=udao.getEmpByname("sujit");
//		for(User v:e) {
//			if(e.equals(v.getFirstname())) {
//		
//		
//		
//		System.out.println( v.getFirstname() + "/t" + v.getLastname() + "/t" + v.getAdd1()
//					+ "/t" + v.getAdd2() + "/t" + v.getDob() + "/t" + v.getEmail() + "/t" + v.getPassword() + "/t"
//					+ v.getCity() + "/t" + v.getMobile());

//		Criteria cr = (Criteria) udao.getByFirstname("sujit");
//
//		//User e = (User) cr.add(Restrictions.like("firstName", "sujit%"));
//
//		// User e =  ((UserDAO) cr).getByFirstname("sujit");
