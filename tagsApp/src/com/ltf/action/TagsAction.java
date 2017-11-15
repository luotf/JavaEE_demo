package com.ltf.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ltf.bean.Person;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TagsAction extends ActionSupport {
	private String name;
	
	public String execute() throws Exception{
		/*HttpServletRequest request=ServletActionContext.getRequest();
		String name=(String)request.getAttribute("birthday");*/
		System.out.println("name:"+name);
		
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
