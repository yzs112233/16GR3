package com.yzs.t1.action;

import com.opensymphony.xwork2.Action;

public class HellowordAction implements Action {//实现Action接口
	private String content="我是于志胜";//保存回应结果数据
	@Override
	//响应用户请求，业务处理方法
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return Action.SUCCESS;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		}
}
