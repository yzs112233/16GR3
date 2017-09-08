package com.qhit.lh.gr3.yzs.t2.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * Ôö
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * É¾
	 * @param obj
	 */
	public void delect(Object obj);
	/**
	 * ¸Ä
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * ²é
	 * @param obj
	 */
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Class clazz,int id);

}
