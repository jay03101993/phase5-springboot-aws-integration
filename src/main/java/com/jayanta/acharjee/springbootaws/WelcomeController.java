package com.jayanta.acharjee.springbootaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	  String a = null;

	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome to spring boot aws project";
		
	}
}
