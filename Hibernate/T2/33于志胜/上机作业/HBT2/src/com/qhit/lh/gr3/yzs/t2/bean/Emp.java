package com.qhit.lh.gr3.yzs.t2.bean;

public class Emp {
	private int eid;
	private String empName;
	private String empSex;
	private int deptid;
	
	private User user;

	public Emp(int eid, String empName, String empSex, int deptid, User user) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.deptid = deptid;
		this.user = user;
	}
	

	public Emp(int eid, String empName, String empSex, int deptid) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.deptid = deptid;
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", empName=" + empName + ", empSex="
				+ empSex + ", deptid=" + deptid + ", user=" + user + "]";
	}


}
