/**
 * 
 */
package com.qhit.lh.gr3.yzs.exam.common.dao;

import com.qhit.lh.gr3.yzs.exam.common.bean.User;

/**
 * @author admin
 * 2017年12月27日
 */
public interface UserDao {
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
