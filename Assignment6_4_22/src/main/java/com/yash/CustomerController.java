package com.yash;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.Model.Customer;
import com.yash.dao.CustomerDAO;



@Controller
public class CustomerController {
	@Autowired
	CustomerDAO custdao;
	
	 @RequestMapping("/custad")
		public String UserRegSubmit(HttpServletRequest req, Model m)
		{
		 
		Customer c = new Customer();
		
			
		 if(custdao.saveCust(c)==1) {
			 m.addAttribute("msg","Customer");
					return "custaddmsg";
		 }
				else
					return "error";
				
			}
		}

