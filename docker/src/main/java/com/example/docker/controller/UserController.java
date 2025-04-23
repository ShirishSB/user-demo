package com.example.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.entity.User;
import com.example.docker.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

}
