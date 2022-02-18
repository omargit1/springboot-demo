package com.heroku.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@GetMapping("/test")
	public ResponseEntity<String> ping() {
		return ResponseEntity.ok("API IS UP");
	}
	
}
