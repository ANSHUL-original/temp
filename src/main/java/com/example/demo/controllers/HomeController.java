package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;
			
	@PostMapping("/adduser")
	public String addUserMethod(@RequestBody User userData) {
		System.out.println("addUser method");
		userDao.addUserDao(userData);
		return "home";
		
	}
	@RequestMapping("/showAll")
	public ModelAndView showAllMethod() {
		ModelAndView mv=new ModelAndView();
		List<User> list=userDao.getAllUsers();
		mv.addObject("list", list);
		mv.setViewName("alluserdata");
		return mv;
	}
	
	@RequestMapping("/deleteuser/{uid}")
	public String deleteUsermethod(@PathVariable int uid) {
		userDao.delete(uid);
		System.out.println("deleted");
		return "alluserdata";
	}
	
	
	@PostMapping("/updateuser/{uid}")
	public ModelAndView updateUserShowMethod(@PathVariable("uid") int uid) {
		System.err.println("update by id");
		ModelAndView mv=new ModelAndView();
		User user=userDao.getUserById(uid);
		mv.addObject("user", user);
		mv.setViewName("updateUserPage");
		return mv;
	}
	
	@RequestMapping(value="/updateUser")
	public String updateUser(User user) {
		userDao.addUserDao(user);
		return "alluserdata";
	}

	@PostMapping("/filterFun/{uTech}")
	@ResponseBody
	public ModelAndView getRquestMapping(@PathVariable String uTech){
		System.out.println("inside controller");
		ModelAndView mv=new ModelAndView();
		List<User> list=userDao.applyFilterTechDao(uTech);
		List<Object> namelist=userDao.getNameList();
		mv.addObject("namelist",namelist);
		mv.addObject("list",list);
		mv.setViewName("alluserdata");
		return mv;
	}

}
