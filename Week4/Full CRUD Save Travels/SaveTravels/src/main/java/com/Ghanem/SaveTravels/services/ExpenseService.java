package com.Ghanem.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Ghanem.SaveTravels.models.Expense;
import com.Ghanem.SaveTravels.repositories.ExpenseRepo;
@Service
public class ExpenseService  {
	
	    // adding the book repository as a dependency
	    private final ExpenseRepo ExpenseRepository;
	    
	    public ExpenseService(ExpenseRepo x) {
	        this.ExpenseRepository = x;
	    }
	    // returns all the books
	    public List<Expense> allExpense() {
	        return ExpenseRepository.findAll();
	    }
	    // creates a book
	    public Expense createExpense(Expense b) {
	        return ExpenseRepository.save(b);
	    }
	    // retrieves a book
	    public Expense findExpense(Long id) {
	        Optional<Expense> optionalExpense =  ExpenseRepository.findById(id);
	        if(optionalExpense.isPresent()) {
	            return optionalExpense.get();
	        } else {
	            return null;
	        }
	    }
	    public void deleteExpense(Long id) {
	    	ExpenseRepository.deleteById(id);
			
	    	
	    }
}
