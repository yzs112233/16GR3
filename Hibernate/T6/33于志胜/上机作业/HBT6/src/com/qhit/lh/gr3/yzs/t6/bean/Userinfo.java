package com.qhit.lh.gr3.yzs.t6.bean;

import java.util.HashSet;
import java.util.Set;

public class Userinfo {
	
	private int userId;
	private String userName;
	private String password;
	
	private Set<Roles> Roless = new HashSet<>();

	public Userinfo(int userId, String userName, String password,
			Set<Roles> roless) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		Roless = roless;
	}

	public Userinfo(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Roles> getRoless() {
		return Roless;
	}

	public void setRoless(Set<Roles> roless) {
		Roless = roless;
	}

	@Override
	public String toString() {
		return "Userinfo [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", Roless=" + Roless + "]";
	}
	
	

}
