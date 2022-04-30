package com.Ghanem.SaveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ghanem.SaveTravels.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long> {
	
	    // this method retrieves all the books from the database
	    List<Expense> findAll();
	   
}
