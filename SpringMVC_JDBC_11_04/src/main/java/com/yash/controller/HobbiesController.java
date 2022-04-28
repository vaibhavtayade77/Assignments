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

import com.yash.dao.HobbiesDAO;
import com.yash.model.Hobbies;
import com.yash.model.User;
@Controller
public class HobbiesController {
	@Autowired
	HobbiesDAO hobbiesdao;
	
	@RequestMapping("/addH")
	public String m2() {
		return "addhobbies";
	}
	
	@RequestMapping(value = "/showallhobbies")
	public ModelAndView hlist() {
		List<Hobbies> ulist = hobbiesdao.getAllHobbies();

		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);

		objmv.setViewName("hobbieslist");
		return objmv;
	}
	@RequestMapping(value = "/SubmitH", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Hobbies objuser) {
		ModelAndView objmv = new ModelAndView();

		if (hobbiesdao.saveHobbies(objuser) == 1) {

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
	@GetMapping("/deletehobbies")
	public String delauth(@RequestParam String id, Model m) {
		hobbiesdao.deletehobbies(id);
		return "redirect:showallhobbies";
	}
	

}

