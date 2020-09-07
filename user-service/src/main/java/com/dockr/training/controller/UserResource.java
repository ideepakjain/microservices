package com.dockr.training.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dockr.training.dao.UserRepository;
import com.dockr.training.exception.UserNotFoundException;
import com.dockr.training.model.User;

@RestController
public class UserResource {

	@Autowired
	private UserRepository repository;

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable("id") int id) {

		Optional<User> user = repository.findById(id);
		if (!user.isPresent())
			throw new UserNotFoundException("id-" + id);

		return user.get();
	}

}
