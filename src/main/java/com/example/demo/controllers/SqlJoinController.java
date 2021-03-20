package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;

@Controller
public class SqlJoinController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping("/findfun1")
	public ModelAndView findfun1() {
		ModelAndView mv=new ModelAndView();
		List<Object []> list=userDao.findFunction1();
		mv.addObject("list", list);
		mv.setViewName("showfindfun1");
		System.out.println("test");
		System.out.println("test2");
		return mv;
	}
	@RequestMapping("/findfun2")
	public ModelAndView findfun2() {
		ModelAndView mv=new ModelAndView();
		List<Object []> list=userDao.findFunction2();
		mv.addObject("list", list);
		mv.setViewName("showfindfun2");
		return mv;
	}
	@RequestMapping("/findfun3")
	public ModelAndView findfun3() {
		ModelAndView mv=new ModelAndView();
		List<Object []> list=userDao.findFunction3();
		mv.addObject("list", list);
		mv.setViewName("showfindfun3");
		return mv;
	}
	@RequestMapping("/findfun4")
	public ModelAndView findfun4() {
		ModelAndView mv=new ModelAndView();
		List<Object []> list=userDao.findFunction4();
		mv.addObject("list", list);
		mv.setViewName("showfindfun4");
		return mv;
	}
}
