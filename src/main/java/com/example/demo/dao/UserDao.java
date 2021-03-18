package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserDao {

	@Autowired
	private UserRepo userRepo;
	
	public void addUserDao(User user) {
		userRepo.save(user);
	}
	public User getUserById(int id) {
		return userRepo.findById(id).get();
	}
	public List<User> getAllUsers(){
		return (List<User>) userRepo.findAll();
	}
	public void updateUser(User user) {
		userRepo.save(user);
	}
	public void delete(int id) {
		userRepo.deleteById(id);
	}
	public List<Object []> findFunction1() {
		System.out.println("find fun1");
		return userRepo.findFunction1();
	}
	public List<Object []> findFunction2() {
		System.out.println("find fun2");
		return userRepo.findFunction2();
	}
	public List<Object []> findFunction3() {
		System.out.println("find fun3");
		return userRepo.findFunction3();
	}
	public List<Object []> findFunction4() {
		System.out.println("find fun4");
		return userRepo.findFunction4();
	}
	public List<User> applyFilterTechDao(String uTech) {
		return userRepo.applyFilterTech(uTech);
	}
	public List<Object> getNameList() {
		return userRepo.getNameList();
	}
	

}
