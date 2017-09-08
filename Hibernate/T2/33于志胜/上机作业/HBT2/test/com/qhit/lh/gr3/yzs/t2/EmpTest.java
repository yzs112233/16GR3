package com.qhit.lh.gr3.yzs.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.yzs.t2.servcie.UserService;
import com.qhit.lh.gr3.yzs.t2.servcie.impl.UserServiceImpl;
import com.qhit.lh.gr3.yzs.t2.bean.Emp;
import com.qhit.lh.gr3.yzs.t2.bean.User;

public class EmpTest {
	private UserService userService = new UserServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("f");
		emp.setDeptid(1);
		
		User user = new User();
		user.setUserName("tom");
		user.setPassword("123456");
		
		emp.setUser(user);
		user.setEmp(emp);
		
		userService.add(emp);
	}
	
	@Test
	public void delect(){
		Emp emp = new Emp();
		emp.setEid(1002);
		userService.delect(emp);
	}
	@Test
	public void update(){
		Emp emp = new Emp();
		emp.setEid(1001);
		emp.setEmpName("tpm");
		emp.setEmpSex("ÄÐ");
		emp.setDeptid(1);
		
		userService.update(emp);
		
	}
	@Test
	public void getAll(){
		List<Object> List = userService.getAll("from Emp");
		for (Object object : List) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	
	

}
