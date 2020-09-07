package com.dockr.training.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dockr.training.model.User;

//@FeignClient(name = "user-service", url = "${USER_SERVICE_URI:http://localhost:8081}")
public interface UserServiceProxy {

	//@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable("id") int id);
	
}
