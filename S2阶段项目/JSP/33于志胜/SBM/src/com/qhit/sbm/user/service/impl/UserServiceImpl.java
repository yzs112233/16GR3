/**
 * 
 */
package com.qhit.sbm.user.service.impl;

import com.qhit.sbm.user.bean.User;
import com.qhit.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.sbm.user.service.UserService;

/**
 * @author admin
 * 2017��11��13��
 */
public class UserServiceImpl implements UserService {

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return new UserDaoImpl().addUser(user);
	}

}
