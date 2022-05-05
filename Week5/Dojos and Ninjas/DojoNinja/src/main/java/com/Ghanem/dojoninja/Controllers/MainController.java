package com.Ghanem.dojoninja.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.Ghanem.dojoninja.Models.Dojo;
import com.Ghanem.dojoninja.Models.Ninja;
import com.Ghanem.dojoninja.Service.DojoService;
import com.Ghanem.dojoninja.Service.NinjaService;



@Controller
public class MainController {
	@Autowired
	private DojoService dojos;
	@Autowired
	private NinjaService ninjas;
	
	
	@GetMapping("/")
	  public String newDojo(@ModelAttribute("newdojo") Dojo dojo, Model model ) {
		 model.addAttribute("allDojos", dojos.allDojos());
	        return "index.jsp";
	    }
	@PostMapping("/dojo/new")
    public String createdojo(@Valid @ModelAttribute("newdojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	dojos.createDojo(dojo);
            return "redirect:/";
        }

	}
	@GetMapping("/ninja/new")
    public String createninja(@Valid @ModelAttribute("newninja") Ninja ninja, BindingResult result, Model model ) {
		model.addAttribute("allDojos", dojos.allDojos());
		
           return "newninja.jsp";
          
	}
	
	@PostMapping("/ninja/new")
    public String createninjas(@Valid @ModelAttribute("newninja") Ninja ninja, BindingResult result, Model model ) {
		model.addAttribute("allDojos", dojos.allDojos());
		 if (result.hasErrors()) {
           return "newninja.jsp";
        }else {
        	ninjas.createNinja(ninja);
            return "redirect:/";
        }
	}
	   @GetMapping("/showdojo/{id}")
	   public String showdojo(@PathVariable("id") Long id, Model model) {
		   
		   model.addAttribute("findDojo", dojos.findDojo(id));
		return "show.jsp";
		}
	   
	   @GetMapping("/showninja/{id}")
	   public String showninja(@PathVariable("id") Long id, Model model) {
		   model.addAttribute("findninja", ninjas.findNinja(id));
		return "show.jsp";
		}
}
