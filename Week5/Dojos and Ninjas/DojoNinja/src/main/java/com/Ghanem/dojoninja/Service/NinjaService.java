package com.Ghanem.dojoninja.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Ghanem.dojoninja.Models.Dojo;
import com.Ghanem.dojoninja.Models.Ninja;
import com.Ghanem.dojoninja.Repositories.DojoRepo;
import com.Ghanem.dojoninja.Repositories.NinjaRepo;
@Service
public class NinjaService {
    // adding the book repository as a dependency
    private final NinjaRepo NinjaRepository;
    
    public NinjaService(NinjaRepo x) {
        this.NinjaRepository = x;
    }
    // returns all the books
    public List<Ninja> allNinja() {
        return NinjaRepository.findAll();
    }
    // creates a book
    public Ninja createNinja(Ninja b) {
        return NinjaRepository.save(b);
    }
    // retrieves a book
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja =  NinjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    public void deleteNinja(Long id) {
    	NinjaRepository.deleteById(id);
		
    	
    }
    public List<Ninja>findDojoNinjas(Dojo dojo){
		return NinjaRepository.findAllByDojo(dojo);
    	
    }

}
