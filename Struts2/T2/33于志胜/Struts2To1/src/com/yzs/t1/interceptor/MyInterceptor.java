package com.yzs.t1.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


@SuppressWarnings("serial")
public class MyInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("我要开始拦截了");
		String result = invocation.invoke();//请求放行，交给下一个拦截器或Action组件
		System.out.println("返回代码:"+ result);
		// TODO Auto-generated method stub
		return result;//返回试图结果代码
	}

}
