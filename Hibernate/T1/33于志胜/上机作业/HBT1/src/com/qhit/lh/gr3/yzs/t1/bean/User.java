package com.qhit.lh.gr3.yzs.t1.bean;

public class User {
	private int userId;
	private String uname;
	private String upwd;
	private String educat;
	private String sex;
	public User(int userId, String uname, String upwd, String educat, String sex) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.upwd = upwd;
		this.educat = educat;
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getEducat() {
		return educat;
	}
	public void setEducat(String educat) {
		this.educat = educat;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", upwd=" + upwd
				+ ", educat=" + educat + ", sex=" + sex + "]";
	}
	
	
	
}