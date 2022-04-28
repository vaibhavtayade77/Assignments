package com.yash;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.Model.Customer;
import com.yash.Model.Item;

import com.yash.dao.CustomerDAO;
import com.yash.dao.ItemDAO;
@Controller
public class ItemController {
	@Autowired
	ItemDAO itemdao;
	 @RequestMapping("/addI")
	 public String itemaddpage() {
		 return "addItems";
	 }
	 @RequestMapping("/itemad")
		public String UserRegSubmit(HttpServletRequest req, Model m)
		{
		Item i1 = new Item();
		
		 if(itemdao.saveitem(i1)==1) {
			 m.addAttribute("msg","Item");
					return "custaddmsg";
					}
				else {
					return "error";
				}
			}
	 @GetMapping("/viewallitem")
		public String showItem(Model m)
		{
			List<Item> ilist = new ArrayList<Item>();
			ilist=itemdao.getAllItem();
			m.addAttribute("ilist", ilist);
			return "itemlist";
		}
}
