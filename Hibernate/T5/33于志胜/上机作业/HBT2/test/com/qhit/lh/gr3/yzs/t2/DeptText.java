package com.qhit.lh.gr3.yzs.t2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.yzs.t2.bean.Dept;
import com.qhit.lh.gr3.yzs.t2.bean.Emp;
import com.qhit.lh.gr3.yzs.t2.servcie.UserService;
import com.qhit.lh.gr3.yzs.t2.servcie.impl.UserServiceImpl;

public class DeptText {
private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Dept dept = new Dept();
		dept.setDeptname("财政部");
		dept.setAddress("漯河");
		
		Emp yzs = new Emp();
		yzs.setEmpName("uom");
		yzs.setEmpSex("男");
		
		
		dept.getEmps().add(yzs);
		
		userService.add(dept);
	}
	@Test
	public void delect(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1002);
		userService.delect(dept);
		
	}
	@Test
	public void update(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1001);
		dept.setDeptname("经济部");
		userService.update(dept);
	}
	@Test
	public void query(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1001);
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDeptname()+":"+emp.getEmpName());
		}
		
	}

}
