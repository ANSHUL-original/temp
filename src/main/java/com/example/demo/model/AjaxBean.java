package com.example.demo.model;

import java.util.List;

public class AjaxBean {

	private String msg;
	private List<User> userList;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	@Override
	public String toString() {
		return "AjaxBean [msg=" + msg + ", userList=" + userList + "]";
	}
}
