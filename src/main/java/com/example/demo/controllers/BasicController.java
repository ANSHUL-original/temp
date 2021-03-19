package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/adduserpage")
	public String adduserPage() {
		return "adduserpage";
	}
}
