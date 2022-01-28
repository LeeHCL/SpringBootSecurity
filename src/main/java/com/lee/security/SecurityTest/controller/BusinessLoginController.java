package com.lee.security.SecurityTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessLoginController {
	
	@GetMapping("/")
	public String display() {
		return "<h1 style='color:blue'><marquee behavior=alternate>Welcome Default</h1>";
	}
	
	@GetMapping("/user")
	public String displayUser() {
		return "<h1 style='color:orange'><marquee behavior=alternate>Welcome End User</h1>";
	}
	
	@GetMapping("/admin")
	public String displayAdmin() {
		return "<h1 style='color:red'><marquee behavior=alternate>Welcome Admin</h1>";
	}

}
