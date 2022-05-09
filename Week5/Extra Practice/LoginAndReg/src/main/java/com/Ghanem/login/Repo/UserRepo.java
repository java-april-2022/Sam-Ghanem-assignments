package com.Ghanem.login.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.Ghanem.login.Models.User;



public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAll();
	Optional<User> findByEmail(String email);

}



