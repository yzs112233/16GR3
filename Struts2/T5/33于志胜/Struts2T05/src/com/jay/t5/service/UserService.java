package com.jay.t5.service;

import java.util.List;

import com.jay.t5.bean.User;

public interface UserService {
	/**
	 * 查
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	public int deleteUser(User user);
	/**
	 * 改
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
	public List<User> getAllUser();
	
	/**
	 * @param user
	 * @return
	 * 根据id查用户
	 * @throws Exception 
	 */
	public User getUserById(User user) throws Exception;
	
}

	


