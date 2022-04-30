package com.Ghanem.SaveTravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ghanem.SaveTravels.models.Expense;
import com.Ghanem.SaveTravels.services.ExpenseService;

@Controller
public class MainController {
@Autowired	
private ExpenseService Tuna;
	

	 @GetMapping("/")
	    public String newExpense(@ModelAttribute("newexpense") Expense expense, Model model ) {
		 model.addAttribute("allexpense", Tuna.allExpense());
	        return "index.jsp";
	    }
	   @PostMapping("/new")
	    public String create(@Valid @ModelAttribute("newexpense") Expense expense, BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	Tuna.createExpense(expense);
	            return "redirect:/";
	        }
   		}
	   @GetMapping("/edit/{id}")
	   public String edit(@PathVariable("id") Long id, Model model ) {
		   
		   model.addAttribute("expense", Tuna.findExpense(id));
		return "edit.jsp";
		   
	   }
	   @DeleteMapping("/delete/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        Tuna.deleteExpense(id);
	        return "redirect:/";
	    }
	   @GetMapping("/show/{id}")
	   public String show(@PathVariable("id") Long id, Model model) {
		   model.addAttribute("expense", Tuna.findExpense(id));
		return "show.jsp";
		}
	   

}
