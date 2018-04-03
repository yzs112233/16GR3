/**
 * 
 */
package com.qhit.lh.gr3.yzs.exam.common.service;

import com.qhit.lh.gr3.yzs.exam.common.bean.User;

/**
 * @author admin
 * 2017年12月27日
 */
public interface UserService {

	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
