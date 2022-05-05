package com.Ghanem.dojoninja.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Ghanem.dojoninja.Models.Dojo;
import com.Ghanem.dojoninja.Models.Ninja;


public interface NinjaRepo extends CrudRepository<Ninja, Long> {
//	/ this method retrieves all the books from the database
    List<Ninja> findAll();
    
	 List<Ninja> findAllByDojo(Dojo dojo);
	

}
