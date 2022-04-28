package com.yash;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.Model.Category;

import com.yash.dao.CategoryDAO;


public class CategoryController {
	
	@Autowired
	CategoryDAO categorydao;
	 @RequestMapping("/addC")
	 public String itemaddpage() {
		 return "addcategory";

}
	 
	 @RequestMapping("/categoryad")
		public String UserRegSubmit(HttpServletRequest req, Model m)
		{
		 
		 Category c=new Category();
		
		 if(categorydao.saveCategory(c)==1) {
			 m.addAttribute("msg","Customer");
					return "cataddmsg";
		 }
				else
					return "error";
				
			}
		}


