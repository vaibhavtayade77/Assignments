package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.dao.UserhobbiesDAO;
import com.yash.model.Hobbies;
import com.yash.model.User;
import com.yash.model.Userhobbies;
@Controller
public class UserhobbiesController {
	
@Autowired
UserhobbiesDAO userhobbiesdao;


	@RequestMapping("/addUH")
	public String m2() {
		return "adduserhobbies";
	}
	
	@RequestMapping(value = "/showalluserhobbies")
	public ModelAndView ulist() {
		List<Userhobbies> ulist = userhobbiesdao.getAllUserhobbies();

		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);

		objmv.setViewName("userhobbieslist");
		return objmv;
	}
	@RequestMapping(value = "/SubmitUH", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Userhobbies objuser) {
		ModelAndView objmv = new ModelAndView();

		if (userhobbiesdao.saveUserhobbies(objuser) == 1) {

			objmv.setViewName("usersuccess");
			objmv.addObject("user", objuser);

			return objmv;
		} else {
			objmv.setViewName("signup");
			return objmv;
		}}

//	@RequestMapping("/updateuser")
//	public String updateauth(@ModelAttribute("objuser") User objuser) {
//		if (userdao.updateuser(objuser) == 1) {
//			return "redirect:showalluser";
//		} else {
//			return "index";
//		}
//
//	}
//	@GetMapping("/editauth")
//	public String editbook(@RequestParam String id, Model m) {
//		Author objuser = new Author();
//		m.addAttribute("objuser", objuser);
//		return "editauthor_view";
//		}
//
	@GetMapping("/deleteuserh")
	public String delauth(@RequestParam String id, Model m) {
		userhobbiesdao.deletehobbies(id);
		return "redirect:showalluserhobbies";
	}
	

}


