package com.qhit.lh.gr3.yzs.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.yzs.t2.servcie.UserService;
import com.qhit.lh.gr3.yzs.t2.servcie.impl.UserServiceImpl;
import com.qhit.lh.gr3.yzs.t2.bean.Dept;
import com.qhit.lh.gr3.yzs.t2.bean.Emp;
import com.qhit.lh.gr3.yzs.t2.bean.User;

public class EmpTest {
	private UserService userService = new UserServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("iom");
		emp.setEmpSex("f");
		
		
		User user = new User();
		user.setUserName("iom");
		user.setPassword("123456");
		
		emp.setUser(user);
		user.setEmp(emp);
		
		Dept dept = (Dept) userService.getObjectById(Dept.class, 10011);
		emp.setDept(dept);
		userService.add(emp);
	}
	
	@Test
	public void delect(){
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1003);
		userService.delect(emp);
	}
	@Test
	public void update(){
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1003);
		emp.setEmpName("tpm");
		emp.setEmpSex("男");
		User user = emp.getUser();
		user.setUserName("tpm");
		
		emp.setUser(user);
		user.setEmp(emp);
	
		Dept dept = (Dept) userService.getObjectById(Dept.class, 10011);
		emp.setDept(dept);
		emp.setDept(dept);
		userService.add(emp);
	}
	@Test
	public void query(){
		List<Object> List = userService.getAll("from Emp");
		for (Object object : List) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	
	

}
