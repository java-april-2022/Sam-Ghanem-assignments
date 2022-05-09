package com.Ghanem.login.Service;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.Ghanem.login.Models.LoginUser;
import com.Ghanem.login.Models.User;
import com.Ghanem.login.Repo.UserRepo;

@Service
public class UserService {
	// adding the book repository as a dependency
	private UserRepo UserRepository;

	public UserService(UserRepo x) {
		this.UserRepository = x;
	}

	// returns all the books
	public List<User> allUsers() {
		return UserRepository.findAll();
	}
// this is for the find all 

	// creates a book
	public User RegUser(User b, BindingResult result) {
		Optional<User> sam = UserRepository.findByEmail(b.getEmail());
		if (sam.isPresent()) {

			result.rejectValue("Email", "Matches", "This email is already in use plz try again!!!");
		}
		if (!b.getPassword().equals(b.getConpassword())) {
			result.rejectValue("Password", "Matches", "This password does not match up plz try again");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			String hashed = BCrypt.hashpw(b.getPassword(), BCrypt.gensalt());
			b.setPassword(hashed);

			return UserRepository.save(b) ;
		}
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		

		// TO-DO - Reject values:
		Optional<User> login = UserRepository.findByEmail(newLoginObject.getEmail());
//		System.out.println("*******");
//		System.out.println(login);
//		System.out.println("*******");
		if (!login.isPresent()) {
			result.rejectValue("email", "Unique", "These Emails do not match up plz try again");
			return null;

		}
		User sam = login.get();

		if (!BCrypt.checkpw(newLoginObject.getPassword(), sam.getPassword())) {
			result.rejectValue("password", "Matches", "This password does not match up plz try again");
			

		}
		if (result.hasErrors()) {
			return null;
		} else {

			return sam;

		}
		// Find user in the DB by email
		// Reject if NOT present

		// Reject if BCrypt password match fails

		// Return null if result has errors
		// Otherwise, return the user object

	}

	// retrieves a book
	public User findUser(Long id) {
		Optional<User> LoginUser = UserRepository.findById(id);
		if (LoginUser.isPresent()) {
			return LoginUser.get();
		} else {
			return null;
		}
	}

	public void deleteUser(Long id) {
		UserRepository.deleteById(id);

	}

}
