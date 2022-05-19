package com.tc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Hello Awengers! Good afternoon !!!";
	}

    @GetMapping("/name")
	public String getName() {
		return "Hello ???";
	}

}