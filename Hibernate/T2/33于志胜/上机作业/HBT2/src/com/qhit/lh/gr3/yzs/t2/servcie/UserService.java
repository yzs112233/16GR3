package com.qhit.lh.gr3.yzs.t2.servcie;

import java.util.List;

public interface UserService {
	
	/**
	 * ��
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * ɾ
	 * @param obj
	 */
	public void delect(Object obj);
	/**
	 * ��
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * ��
	 * @param obj
	 */
	public List<Object> getAll(String fromObject);


}
