package com.qhit.lh.gr3.yzs.t6.servcie;

import java.util.List;

public interface UserService {
	
	/**
	 * 增
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * 删
	 * @param obj
	 */
	public void delect(Object obj);
	/**
	 * 改
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * 查
	 * @param obj
	 */
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Class clazz,int id);


}
