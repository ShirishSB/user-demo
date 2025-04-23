package com.example.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.docker.entity.User;
import com.example.docker.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
