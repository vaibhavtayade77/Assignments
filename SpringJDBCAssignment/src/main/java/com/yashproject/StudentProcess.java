package com.yashproject;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yashproject.dao.StudentDAO;
import com.yashproject.model.Student;

public class StudentProcess {

	public static void main(String[] args) {

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO objed = (StudentDAO) objAC.getBean("sdao");
		Student objE = new Student();

		Scanner sc = new Scanner(System.in);
		String fn = "";
		String ln = "";
		String fn2 = "";
		String mn = "";
		String cn = "";
		String s = "";
		String ps=" ";
		String dob = "";
		String dos = "";
		String gd=" " ;
		String a1 = "";
		String a2 = "";
		int cid;
		String pp=" ";
		String em = "";

		do {
			System.out.println("select the process (1.Save , 2.Update , 3. Delete)");
			int operation = sc.nextInt();

			int ex;
			int sid;
			switch (operation) {

			case 1:

				System.out.println("you choose save method ");
				String s1 = sc.nextLine();
				System.out.println("Enter Firstname");
				fn = sc.nextLine();
				System.out.println("Enter Lastname");
				ln = sc.nextLine();
				System.out.println("Enter Fathername");
				fn2 = sc.nextLine();
				System.out.println("Enter Mothername");
				mn = sc.nextLine();
				System.out.println("Enter Classname");
				cn = sc.nextLine();
				System.out.println("Enter Section");
				s = sc.nextLine();
				System.out.println("Enter Phoneno_student");
				ps = sc.nextLine();
				System.out.println("Enter date of birth");
				dob = sc.nextLine();
				System.out.println("Enter Date Of Submission");
				dos = sc.nextLine();
				System.out.println("Enter Gender");
				gd = sc.nextLine();
				System.out.println("Enter Add1");
				a1 = sc.nextLine();
				System.out.println("Enter Add2");
				a2 = sc.nextLine();
				System.out.println("Enter Cityid");
				cid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Phoneno_parent");
				pp = sc.nextLine();
				System.out.println("Enter Email_parent");
				em = sc.nextLine();

				objE.setFirstname(fn);
				objE.setLastname(ln);
				objE.setFathername(fn2);
				objE.setMothername(mn);
				objE.setClassname(cn);
				objE.setSection(s);
				objE.setPhoneno_student(ps);
				objE.setDob(dob);
				objE.setDateofsubmission(dos);
				objE.setGender(gd);
				objE.setAdd1(a1);
				objE.setAdd2(a2);
				objE.setCityid(cid);
				objE.setPhoneno_parent(pp);
				objE.setEmail_parent(em);

				System.out.println("Total record saved:- " + objed.saveStud(objE));
				
				System.out.println(objed.updateStud(objE));
				
				
				System.out.println("want to do more 1 for yes 0 for no");
				ex = sc.nextInt();

				if (ex == 0)
					break;
				break;

			case 2:
				System.out.println("you choose update method ");
				String s2 = sc.nextLine();
				System.out.println("Enter Sid");
				sid=sc.nextInt();
				System.out.println("Enter Firstname");
				fn = sc.nextLine();
				System.out.println("Enter Lastname");
				ln = sc.nextLine();
				System.out.println("Enter Fathername");
				fn2 = sc.nextLine();
				System.out.println("Enter Mothername");
				mn = sc.nextLine();
				System.out.println("Enter Classname");
				cn = sc.nextLine();
				System.out.println("Enter Section");
				s = sc.nextLine();
				System.out.println("Enter Phoneno_student");
				ps = sc.nextLine();
				System.out.println("Enter date of birth");
				dob = sc.nextLine();
				System.out.println("Enter Date Of Submission");
				dos = sc.nextLine();
				System.out.println("Enter Gender");
				gd = sc.nextLine();
				System.out.println("Enter Add1");
				a1 = sc.nextLine();
				System.out.println("Enter Add2");
				a2 = sc.nextLine();
				System.out.println("Enter Cityid");
				cid = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Phoneno_parent");
				pp = sc.nextLine();
				System.out.println("Enter Email_parent");
				em = sc.nextLine();
                
				
				objE.setSid(sid);
				objE.setFirstname(fn);
				objE.setLastname(ln);
				objE.setFathername(fn2);
				objE.setMothername(mn);
				objE.setClassname(cn);
				objE.setSection(s);
				objE.setPhoneno_student(ps);
				objE.setDob(dob);
				objE.setDateofsubmission(dos);
				objE.setGender(gd);
				objE.setAdd1(a1);
				objE.setAdd2(a2);
				objE.setCityid(cid);
				objE.setPhoneno_parent(pp);
				objE.setEmail_parent(em);


				System.out.println("Total Record updated:- " + objed.updateStud(objE));

				break;

			case 3:

				System.out.println("you choose delete method");

				System.out.println("enter the row you want to delete");
				sid = sc.nextInt();
				
				System.out.println("row deleted successfully " +objed.deleteStud(sid));

				break;

			default:
			case 4:
				System.out.println("exit");
			}

		} while (false);
	}
}
