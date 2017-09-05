package com.qhit.lh.gr3.yzs.t6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.yzs.t6.servcie.UserService;
import com.qhit.lh.gr3.yzs.t6.servcie.impl.UserServiceImpl;
import com.qhit.lh.gr3.yzs.t6.bean.Roles;
import com.qhit.lh.gr3.yzs.t6.bean.Userinfo;

public class RolesTest {
	private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Roles roles = new Roles();
		roles.setRosesName("主席");
		roles.setRosesMemo("党委");
		
		Userinfo userinfo = (Userinfo) userService.getObjectById(Userinfo.class, 1);
		roles.getUserinfos().add(userinfo);
		userService.add(roles);
	}
	@Test
	public void delect(){
		Userinfo userinfo = (Userinfo) userService.getObjectById(Userinfo.class, 2);
		userService.delect(userinfo);
	}
	@Test
	public void update(){
		Roles roles = (Roles) userService.getObjectById(Roles.class, 2);
		roles.setRosesMemo("党政委");
	    userService.update(roles);
	}
	@Test
	public void query(){
		Roles roles = (Roles) userService.getObjectById(Roles.class, 2);
		for(Userinfo userinfo : roles.getUserinfos() ){
			System.out.println(roles.getRosesName()+"+"+userinfo.getUserName());
		}
		
	}

}
