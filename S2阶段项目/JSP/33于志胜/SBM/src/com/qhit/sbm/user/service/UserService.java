/**
 * 
 */
package com.qhit.sbm.user.service;

import com.qhit.sbm.user.bean.User;


/**
 * @author admin
 * 2017��11��13��
 */
public interface UserService {
	
	/**
	 * @param user
	 * @return
	 * ����û�
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param passWord
	 * @return
	 * ��¼��ҵ��
	 */
	public User doLogin(String userName, String userPassword);
}

