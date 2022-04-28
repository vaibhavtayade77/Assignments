package com.yash.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.dao.ClientDAO;

@Controller
public class MainController {
	@Autowired
	ClientDAO clientdao;

	@RequestMapping(value = "/")
	public String first() {
		return "index";
	}

	@GetMapping("/login")
	public String userLogin() {
		return "clientlogin";
	}

	@GetMapping("/signup")
	public String userReg(Model m) {
		Client objclient = new Client();
		m.addAttribute("objclient", objclient);
		return "signup";
	}

	@PostMapping("/SignUpSubmit")
	public String UserRegSubmit(@Valid @ModelAttribute("objclient") Client objclient, BindingResult objBR) {
		if (objBR.hasErrors())
			return "signup";
		else {
			if (clientdao.saveClient(objclient) == 1)
				return "signup_success";
			else
				return "index";

		}
	}

	@GetMapping("/viewalluser")
	public String showClients(Model m) {
		List<Client> clientlist = new ArrayList<Client>();
		clientlist = clientdao.getAllEmp();
		m.addAttribute("clientlist", clientlist);
		return "clientlist";
	}



	@RequestMapping("/update")
	public String updatec(@ModelAttribute("objuser") Client objuser) {
		if (clientdao.update(objuser) == 1) {
			return "redirect:viewalluser";
		} else {
			return "index";
		}

	}

	@GetMapping("/edit")
	public String editc(@RequestParam String id, Model m) {
		Client objuser = new Client();
		m.addAttribute("objuser", objuser);
		return "edit_view";
	}

@GetMapping("/delete")
public String delc(@RequestParam String id, Model m) {
	clientdao.delete(id);
	return "redirect:viewalluser";
}}
