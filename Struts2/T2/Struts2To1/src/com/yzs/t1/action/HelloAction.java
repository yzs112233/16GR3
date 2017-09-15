package com.yzs.t1.action;

import com.opensymphony.xwork2.Action;

public final class HelloAction implements Action {
	private String content;
	private String uname;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		content="ÄúºÃ£¬"+uname;
		return Action.SUCCESS;
	}
	
	
	
	
}
	
