package com.lee.security.SecurityTest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lee.security.SecurityTest.model.User;
import com.lee.security.SecurityTest.repo.UserRepository;

@Service
public class LeeUserDetailsService implements UserDetailsService{

	
	@Autowired
	UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repo.findByUsername(username);
		user.orElseThrow(()-> new UsernameNotFoundException("User name: " + username + " not found"));
		return user.map(LeeDetails::new).get();
		}

}