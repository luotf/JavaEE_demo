package com.ltf.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	//Map request=(Map)ActionContext.getContext().get("request");
	//request.put("email", email);
	public String login() throws Exception {
		if("admin".equals(username)&&"admin".equals(password)){
			Map session=(Map)ActionContext.getContext().getSession();
			session.put("username", username);
			System.out.println("xsaxsa");
			return SUCCESS;
		}
		return INPUT;
	}
	
	public String index() throws Exception {
		
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
