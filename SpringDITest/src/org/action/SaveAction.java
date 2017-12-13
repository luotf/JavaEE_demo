package org.action;

import org.serviceimpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vo.User;


import com.opensymphony.xwork2.ActionSupport;

public class SaveAction  extends ActionSupport{
	private UserServiceImpl userService=null;
	private User user=null;
	
	public String execute(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	  		  userservice= (UserServiceImpl ) ctx.getBean("UserServiceImpl");


		return SUCCESS;
	}
	
	
	public UserServiceImpl getUserService() {
		return userService;
	}


	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
