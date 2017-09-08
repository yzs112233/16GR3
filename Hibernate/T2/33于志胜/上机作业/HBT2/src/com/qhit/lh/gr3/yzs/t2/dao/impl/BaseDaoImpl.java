package com.qhit.lh.gr3.yzs.t2.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.yzs.t2.dao.BaseDao;
import com.qhit.lh.gr3.yzs.t2.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.save(obj);
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delect(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//开启事务
				Transaction ts = session.beginTransaction();
				//执行
				session.delete(obj);
				//提交事物
				ts.commit();
				//释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.update(obj);
		//提交事物
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> getAll(String fromObject) {
		//获取session对象
				Session session = HibernateSessionFactory.getSession();
				//开启事务
				Transaction ts = session.beginTransaction();
				//执行
				Query query = session.createQuery(fromObject);
				List<Object> list = query.list();
				//提交事物
				ts.commit();
				//释放资源
				HibernateSessionFactory.closeSession();
		return list;
	}

}
