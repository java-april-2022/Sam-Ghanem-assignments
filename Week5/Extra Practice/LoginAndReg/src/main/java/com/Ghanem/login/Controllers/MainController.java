package com.Ghanem.login.Controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ghanem.login.Models.LoginUser;
import com.Ghanem.login.Models.User;
import com.Ghanem.login.Service.UserService;

//.. don't forget to inlcude all your imports! ..

@Controller
public class MainController {

	@Autowired
	private UserService user;

	// Add once service is implemented:
	// @Autowired
	// private UserService userServ;

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!
		User thisuser = user.RegUser(newUser, result);
		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		
		session.setAttribute("saveid", thisuser.getId());
		
		return "redirect:/home";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		
		User thisuser = user.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		
		session.setAttribute("saveid", thisuser.getId());
		return "redirect:/home";
	}

	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
		User thisuser = user.findUser((Long)session.getAttribute("saveid"));
		model.addAttribute("user", thisuser);
		return "dashboard.jsp";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.setAttribute("logout", null);

		return "redirect:/";
	}

}