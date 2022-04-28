package com.yash.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yash.dao.AdminDAO;
import com.yash.model.Admin;


@Controller
public class AdminController {
	@Autowired
	AdminDAO admindao;
	
	
	
	
	@GetMapping("/login")
	public String userReg(Model m)
	{
		Admin objuser = new Admin();
		m.addAttribute("objuser", objuser);
		return "adminlogin";
	}
	
	@PostMapping("/SignUpSubmit")
	public String UserRegSubmit(@Valid @ModelAttribute("objuser") Admin objuser, BindingResult objBR)
	{
		if(objBR.hasErrors())
		  return "signup";
		else
		{
			if(admindao.saveAdmin(objuser)==1)
				return "fillpage";
			else
				return "index";
			
		}

	}}
