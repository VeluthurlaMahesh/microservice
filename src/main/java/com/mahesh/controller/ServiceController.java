package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {
	
	@GetMapping("/message")
	public String getmessage() {
		return "success";
	}

}
