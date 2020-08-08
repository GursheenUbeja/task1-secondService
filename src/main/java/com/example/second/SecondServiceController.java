package com.example.second;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondServiceController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("Hi..", HttpStatus.OK);
	}

}
