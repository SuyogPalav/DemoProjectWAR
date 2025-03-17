package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<List<String>> user() {
		List<List<String>> userList = List.of(List.of("Suyog", "Peda", "Rohini"),
				List.of("Software Developer", "React Developer", "PHP Developer"));
		return userList;
	}

}
