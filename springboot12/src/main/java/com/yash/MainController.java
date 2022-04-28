package com.yash;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.dao.AuthorDAO;
import com.yash.dao.BooktitleDAO;
import com.yash.dao.PublisherDAO;


import com.yash.model.Author;
import com.yash.model.Booktitle;
import com.yash.model.Publisher;

@Controller
public class MainController {
	

	@Autowired
	AuthorDAO authordao;

	@Autowired
	BooktitleDAO bookdao;

	@Autowired
	PublisherDAO pubdao;

	@RequestMapping("/")
	public String index() {
		// System.out.println("hello how are you ");
		return "index";
	}

	@RequestMapping("/signup")
	public String m2() {
		return "signup";
	}

	@RequestMapping("/updateauth")
	public String updateauth(@ModelAttribute("objuser") Author objuser) {
		if (authordao.updateauth(objuser) == 1) {
			return "redirect:showalluser";
		} else {
			return "index";
		}

	}
	@GetMapping("/editauth")
	public String editbook(@RequestParam String id, Model m) {
		Author objuser = new Author();
		m.addAttribute("objuser", objuser);
		return "editauthor_view";
		}

	@GetMapping("/delauth")
	public String delauth(@RequestParam String id, Model m) {
		authordao.deleteauth(id);
		return "redirect:showalluser";
	}

	
	@RequestMapping("/updatebt")
	public String updateauth(@ModelAttribute("objuser") Booktitle objuser) {
		if (bookdao.updatebook(objuser) == 1) {
			return "redirect:showalluser1";
		} else {
			return "index";
		}

	}
	@GetMapping("/editbt")
	public String editauther(@RequestParam String id, Model m) {
		Booktitle objuser = new Booktitle();
		m.addAttribute("objuser", objuser);
		return "editbooktitle_view";
		}
	@GetMapping("/delbt")
	public String delbt(@RequestParam String id, Model m) {
		bookdao.deletebt(id);
		return "redirect:showalluser1";
	}

	
	@RequestMapping("/updatepub")
	public String updatepublisher(@ModelAttribute("objuser") Publisher objuser) {
		if (pubdao.updatepub(objuser) == 1) {
			return "redirect:showalluser2";
		} else {
			return "index";
		}

	}
	@GetMapping("/editpub")
	public String editpub(@RequestParam String id, Model m) {
		Publisher objuser = new Publisher();
		m.addAttribute("objuser", objuser);
		return "editpublisher_view";
		}
	@GetMapping("/delpub")
	public String delpub(@RequestParam String id, Model m) {
		pubdao.deletepub(id);
		return "redirect:showalluser2";
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Author objuser) {
		ModelAndView objmv = new ModelAndView();

		if (authordao.addAuthor(objuser) == 1) {

			objmv.setViewName("usersuccess");
			objmv.addObject("user", objuser);

			return objmv;
		} else {
			objmv.setViewName("signup");
			return objmv;
		}
	}

	@RequestMapping(value = "/showalluser")
	public ModelAndView authorlist() {
		List<Author> ulist = authordao.getAllAuthor();

		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);

		objmv.setViewName("authorlist");
		return objmv;
	}

	@RequestMapping("/signup1")
	public String b1() {
		return "signup1";
	}

	@RequestMapping(value = "/saveuser1", method = RequestMethod.POST)
	public ModelAndView saveBooktitle(@ModelAttribute Booktitle objuser) {
		ModelAndView objmv = new ModelAndView();

		if (bookdao.addBooktitle(objuser) == 1) {

			objmv.setViewName("usersuccess1");
			objmv.addObject("user", objuser);

			return objmv;
		} else {
			objmv.setViewName("signup1");
			return objmv;
		}
	}

	@RequestMapping(value = "/showalluser1")
	public ModelAndView booklist() {
		List<Booktitle> ulist = bookdao.getAllBooktitle();

		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);

		objmv.setViewName("booktitlelist");
		return objmv;
	}

	@RequestMapping("/signup2")
	public String p2() {
		return "signup2";
	}

	@RequestMapping(value = "/saveuser2", method = RequestMethod.POST)
	public ModelAndView savePublisher(@ModelAttribute Publisher objuser) {
		ModelAndView objmv = new ModelAndView();

		if (pubdao.addPublisher(objuser) == 1) {

			objmv.setViewName("usersuccess2");
			objmv.addObject("user", objuser);

			return objmv;
		} else {
			objmv.setViewName("signup2");
			return objmv;
		}
	}

	@RequestMapping(value = "/showalluser2")
	public ModelAndView publisherlist() {
		List<Publisher> ulist = pubdao.getAllPublisher();

		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);

		objmv.setViewName("publisherlist");
		return objmv;
	}

}
