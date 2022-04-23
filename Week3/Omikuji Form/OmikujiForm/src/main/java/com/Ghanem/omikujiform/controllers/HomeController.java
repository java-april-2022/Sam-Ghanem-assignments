package com.Ghanem.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/show")
	public String show(HttpSession session, Model model) {
		
		String result = (String) session.getAttribute("result");
		model.addAttribute(result, result);
		return "show.jsp";
	}
	@PostMapping("/show_results")
	public String submit(
			@RequestParam("number") int number,
			@RequestParam("city") String city, 
			@RequestParam("name") String name,
			@RequestParam("job") String job,
			@RequestParam("animal") String animal,
			@RequestParam("nice") String nice,
			HttpSession session
			) {
		String result = String.format("In %s years,you will live in %s with %s as your roommate , "
				+ "%s. The next time you see a %s,"
				+ " you will have good luck."
				+ " Also, %s.", number,city,name,job,animal,nice);
		
		session.setAttribute("result", result);
		return "redirect:/show";
		
	}

}
