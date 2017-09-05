package com.qhit.lh.gr3.yzs.t6.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.gr3.yzs.t6.bean.Userinfo;

public class Roles {
	private int rosesId;
	private String rosesName;
	private String rosesMemo;
	
	private Set<Userinfo> userinfos = new HashSet<>();

	public Roles(int rosesId, String rosesName, String rosesMemo,
			Set<Userinfo> userinfos) {
		super();
		this.rosesId = rosesId;
		this.rosesName = rosesName;
		this.rosesMemo = rosesMemo;
		this.userinfos = userinfos;
	}

	public Roles(int rosesId, String rosesName, String rosesMemo) {
		super();
		this.rosesId = rosesId;
		this.rosesName = rosesName;
		this.rosesMemo = rosesMemo;
	}

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRosesId() {
		return rosesId;
	}

	public void setRosesId(int rosesId) {
		this.rosesId = rosesId;
	}

	public String getRosesName() {
		return rosesName;
	}

	public void setRosesName(String rosesName) {
		this.rosesName = rosesName;
	}

	public String getRosesMemo() {
		return rosesMemo;
	}

	public void setRosesMemo(String rosesMemo) {
		this.rosesMemo = rosesMemo;
	}

	public Set<Userinfo> getUserinfos() {
		return userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}

	@Override
	public String toString() {
		return "Roles [rosesId=" + rosesId + ", rosesName=" + rosesName
				+ ", rosesMemo=" + rosesMemo + ", userinfos=" + userinfos + "]";
	}
	
	

}
