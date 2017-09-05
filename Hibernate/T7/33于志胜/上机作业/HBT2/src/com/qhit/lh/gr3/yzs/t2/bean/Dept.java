package com.qhit.lh.gr3.yzs.t2.bean;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private int deptId;
	private String deptname;
	private String address;
	
	private Set<Emp> emps = new HashSet<>();
	
	
	public Dept(int deptId, String deptname, String address) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
		this.address = address;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptname=" + deptname
				+ ", address=" + address + ", emps=" + emps + "]";
	}

}
