package com.lee.security.SecurityTest.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lee.security.SecurityTest.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUsername(String username);
	
}