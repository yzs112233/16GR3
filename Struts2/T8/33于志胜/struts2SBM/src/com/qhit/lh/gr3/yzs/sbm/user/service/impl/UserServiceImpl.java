/**
 * 
 */
package com.qhit.lh.gr3.yzs.sbm.user.service.impl;
import java.util.List;

import com.qhit.lh.gr3.yzs.sbm.user.bean.User;
import com.qhit.lh.gr3.yzs.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.yzs.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.yzs.sbm.user.service.UserService;



/**
 * @author 于志胜
 * TODO
 * 2017年12月7日
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.jay.sbm.user.service.UserService#getAll()
	 */
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
