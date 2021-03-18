package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UserDao;

@Controller
public class TestController {

	@Autowired
	public UserDao userDao;
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
