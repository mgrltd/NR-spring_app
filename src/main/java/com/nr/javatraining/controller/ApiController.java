package com.nr.javatraining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nr")
public class ApiController {
	
	@GetMapping()
	public String welcome() {
		return "well come to NR JAVA Training";
	}
	
	@GetMapping("/info")
	public String info() {
		return "NR JAVA Training:  ";
	}

}
