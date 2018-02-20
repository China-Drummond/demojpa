package com.example.drummond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.drummond.model.User;
import com.example.drummond.repository.UserRepository;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@PostMapping
	public User modifyUser(@RequestBody User user) {
		
		return userRepo.save(user);
	}
}
