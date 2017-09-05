package com.qhit.lh.gr3.yzs.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.yzs.t2.bean.Dept;
import com.qhit.lh.gr3.yzs.t2.bean.Emp;
import com.qhit.lh.gr3.yzs.t2.servcie.UserService;
import com.qhit.lh.gr3.yzs.t2.servcie.impl.UserServiceImpl;
import com.qhit.lh.gr3.yzs.t2.utils.HibernateSessionFactory;

public class DeptText {
private UserService userService = new UserServiceImpl();
	@Test
	public void add() {
		Dept dept = new Dept();
		dept.setDeptname("财政部");
		dept.setAddress("漯河");
		
		Emp yzs = new Emp();
		yzs.setEmpName("uom");
		yzs.setEmpSex("男");
		
		
		dept.getEmps().add(yzs);
		
		userService.add(dept);
	}
	@Test
	public void delect(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1002);
		userService.delect(dept);
		
	}
	@Test
	public void update(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1001);
		dept.setDeptname("经济部");
		userService.update(dept);
	}
	@Test
	public void query(){
		Dept dept = (Dept) userService.getObjectById(Dept.class, 1001);
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDeptname()+":"+emp.getEmpName());
		}
		
	}
	
	@Test
	public void getDeptInfo(){
		
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		
		ProjectionList proList = Projections.projectionList()
		.add(Projections.groupProperty("deptId"))
		.add(Projections.groupProperty("deptname"))
		.add(Projections.groupProperty("address"));
		
		criteria.setProjection(proList);
		
		List<Object[]> list = criteria.list();
		
		for(Object[] obj : list){
			
			System.out.println(""+obj[0]+obj[1]+obj[2]);
			
		}
	}

}
