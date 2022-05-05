package com.Ghanem.dojoninja.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.Ghanem.dojoninja.Models.Dojo;




public interface DojoRepo extends CrudRepository<Dojo, Long> {
//	/ this method retrieves all the books from the database
    List<Dojo> findAll();


	

}
