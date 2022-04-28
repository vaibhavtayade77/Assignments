package com.yash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.yash.Model.Admin;
import com.yash.dao.AdminDAO;



@Controller
public class admincontroller {
	@Autowired
	AdminDAO admindao;

	 @RequestMapping("/admlogin")
		public String userReg(Model m) {
			Admin objuser = new Admin();
			m.addAttribute("objuser", objuser);
			return "adminpage";

		}
	 @GetMapping("/addcust")
	public String linkaddcustomer()
	 {
		 return"addcutomer";
	 }
	 
	
}
