package com.qhit.lh.gr3.yzs.t6.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.yzs.t6.dao.BaseDao;
import com.qhit.lh.gr3.yzs.t6.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������
		Transaction ts = session.beginTransaction();
		//ִ��
		session.save(obj);
		//�ύ����
		ts.commit();
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delect(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
				Session session = HibernateSessionFactory.getSession();
				//��������
				Transaction ts = session.beginTransaction();
				//ִ��
				session.delete(obj);
				//�ύ����
				ts.commit();
				//�ͷ���Դ
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������
		Transaction ts = session.beginTransaction();
		//ִ��
		session.update(obj);
		//�ύ����
		ts.commit();
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> getAll(String fromObject) {
		//��ȡsession����
				Session session = HibernateSessionFactory.getSession();
				//��������
				Transaction ts = session.beginTransaction();
				//ִ��
				Query query = session.createQuery(fromObject);
				List<Object> list = query.list();
				//�ύ����
				ts.commit();
				//�ͷ���Դ
				HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������
		Transaction ts = session.beginTransaction();
		//ִ��
		Object obj = session.get(clazz, id);
		//�ύ����
		ts.commit();
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();
		return obj;
	}

}
