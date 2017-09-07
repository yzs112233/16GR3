package com.qhit.lh.gr3.yzs.t1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.yzs.t1.bean.User;
import com.qhit.lh.gr3.yzs.t1.servcie.UserService;
import com.qhit.lh.gr3.yzs.t1.servcie.impl.UserServiceImpl;

public class UserTest {
private UserService userService = new UserServiceImpl();
	@Test
	public void addUser() {
	User user = new User();
	user.setUname("11");
	user.setUpwd("1111");
	user.setEducat("大专");
	user.setSex("m");
	userService.add(user);
	}
	@Test
	public void delectUser(){
		User user = new User();
		user.setUserId(1001);
		userService.delect(user);
	}
	@Test
	public void update(){
		User user = new User();
		user.setUserId(1002);
		user.setUname("1001");
		user.setUpwd("1111");
		user.setEducat("大专");
		user.setSex("m");
		userService.update(user);
		
	}
	@Test
	public void getAll(){
		List<Object> List = userService.getAll("from User");
		for (Object object : List) {
			User user = (User) object;
			System.out.println(user.toString());
		}
	}
	
	

}
