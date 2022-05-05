package com.Ghanem.dojoninja.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Ghanem.dojoninja.Models.Dojo;
import com.Ghanem.dojoninja.Repositories.DojoRepo;
@Service
public class DojoService {

    // adding the book repository as a dependency
    private final DojoRepo DojoRepository;
    
    public DojoService(DojoRepo x) {
        this.DojoRepository = x;
    }
    // returns all the books
    public List<Dojo> allDojos() {
        return DojoRepository.findAll();
    }
    // creates a book
    public Dojo createDojo(Dojo b) {
        return DojoRepository.save(b);
    }
    // retrieves a book
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo =  DojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    public void deleteDojo(Long id) {
    	DojoRepository.deleteById(id);
		
    	
    }

}
