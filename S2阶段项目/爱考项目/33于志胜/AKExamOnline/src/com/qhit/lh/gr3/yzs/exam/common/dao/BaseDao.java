/**
 * 
 */
package com.qhit.lh.gr3.yzs.exam.common.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.yzs.exam.common.utils.HibernateSessionFactory;

/**
 * @author admin
 * 2017年12月27日
 */
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
