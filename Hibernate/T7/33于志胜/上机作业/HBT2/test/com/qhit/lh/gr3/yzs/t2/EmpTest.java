package com.qhit.lh.gr3.yzs.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.yzs.t2.servcie.UserService;
import com.qhit.lh.gr3.yzs.t2.servcie.impl.UserServiceImpl;
import com.qhit.lh.gr3.yzs.t2.utils.HibernateSessionFactory;
import com.qhit.lh.gr3.yzs.t2.bean.Dept;
import com.qhit.lh.gr3.yzs.t2.bean.Emp;
import com.qhit.lh.gr3.yzs.t2.bean.User;

public class EmpTest {
	private UserService userService = new UserServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("iom");
		emp.setEmpSex("f");
		
		
		User user = new User();
		user.setUserName("iom");
		user.setPassword("123456");
		
		emp.setUser(user);
		user.setEmp(emp);
		
		Dept dept = (Dept) userService.getObjectById(Dept.class, 10011);
		emp.setDept(dept);
		userService.add(emp);
	}
	
	@Test
	public void delect(){
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1003);
		userService.delect(emp);
	}
	@Test
	public void update(){
		Emp emp = (Emp) userService.getObjectById(Emp.class, 1003);
		emp.setEmpName("tpm");
		emp.setEmpSex("男");
		User user = emp.getUser();
		user.setUserName("tpm");
		
		emp.setUser(user);
		user.setEmp(emp);
	
		Dept dept = (Dept) userService.getObjectById(Dept.class, 10011);
		emp.setDept(dept);
		emp.setDept(dept);
		userService.add(emp);
	}
	@Test
	public void query(){
		List<Object> List = userService.getAll("from Emp");
		for (Object object : List) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	@Test
	public void getEmpLikeName(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("empName", "于%"));
		List<Emp> list = criteria.list();
		for (Emp emp : list){
			
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
		
	}
	
	@Test
	public void getEmpByDeptName(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.deptname", "财政部"));
		List<Emp> list = criteria.list();
		for (Emp emp : list){
			
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
		
	}
	
	@Test
	public void Emp1(){
		
		String  hql = "select e from Emp e where e.empName like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setString(0, "%于%");
		
		List<Emp> result = query.list();
		for(Emp e : result){
			System.out.println(e);
			
		}
		
	}
	@Test
	public void Emp2(){
		String hql = "select e.empName,e.empSex from Emp e where e.empName like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setString(0, "%于%");
		
		List<Object[]> result = query.list();
		for(Object[] e : result){
			System.out.println(e[0]+","+ e[1]);
			
		}
		
	}
	@Test
	public void Emp3(){
		String hql = "select new Emp(e.empName,e.empSex) from Emp e where e.empName like ?";	
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setString(0, "%于%");
		
		List<Emp> result = query.list();
		for(Emp e : result){
			System.out.println(e);
			
		}
	}
	
	

	
	

}
