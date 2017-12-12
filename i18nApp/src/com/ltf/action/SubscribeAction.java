package com.ltf.action;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SubscribeAction  extends ActionSupport{
	private String msg=null;
	private String email="";
	
	public String subscribe() throws Exception {
			Date date=new Date();
		if(!email.contains("@")){
			this.setMsg("订阅失败");
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("email", email);
			request.put("date", date);
			return ERROR;
		}else{
			this.setMsg("订阅成功");
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("email", email);
			request.put("date", date);
			return SUCCESS;
		}
	}
	
	public String checkLocale() throws Exception {
		
		return SUCCESS;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
