/**
 * 
 */
package com.qhit.sbm.user.dao;

import com.qhit.sbm.user.bean.User;

/**
 * @author admin
 * 2017��11��13��
 */
public interface UserDao {
	
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
	 * ��¼�����ݷ���
	 */
	public User doLogin(String userName, String userPassword);
}

