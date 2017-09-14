package com.yzs.t6.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yzs.t6.bean.User;

public class UserAction extends ActionSupport {
	private User user;
	
	public void validate() {
		if("".equals(user.getUname())) {
			super.addFieldError("user.uname",getText("uname.empty"));
			}
		if("".equals(user.getUpwd())) {
			super.addFieldError("user.upwd",getText("password.empty"));
		}
	}
	public String login() {
		
		System.out.println("loginUser");
		return "loginSuccess";
		
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
