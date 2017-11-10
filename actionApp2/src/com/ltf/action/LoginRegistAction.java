package com.ltf.action;
import java.util.Map;

import com.ltf.dao.UserDao;
import com.ltf.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginRegistAction extends ActionSupport{
	private User user;
	private String message;
	//处理用户请求的 execute 方法
	public String login() throws Exception{
		//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
		UserDao userDao=new UserDao();
		System.out.println(user.getUsername()+","+user.getPassword());
		User u = userDao.checkLogin(user.getUsername(), user.getPassword());
		if(u!=null){												//如果登录成功
			Map session = ActionContext.getContext().getSession();	//获得会话，用来保存当前登录用户的信息
			session.put("user", u);								//把获取的对象保存在 Session 中
			Map request =(Map)ActionContext.getContext().get("request");
			request.put("welcome", "登录成功");
			Map application = ActionContext.getContext().getApplication();	
			if(application.get("count")==null){
				application.put("count", 1);
			}
			else{
				 int count=Integer.parseInt(application.get("count").toString());
			        application.put("count", count+1);
			}
			return SUCCESS;											//验证成功返回字符串SUCCESS，此时 Session 中已经有用户对象
		}else{
			return ERROR;											//验证失败返回字符串ERROR
		}
	}
	
	public String regis() throws Exception{
		//该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
		UserDao userDao=new UserDao();
		System.out.println(user.getUsername()+","+user.getPassword());
		boolean i=userDao.Regis(user.getUsername(), user.getPassword());
		if(i){												//如果登录成功
			Map session = ActionContext.getContext().getSession();	//获得会话，用来保存当前登录用户的信息
			session.put("user", user);			//把获取的对象保存在 Session 中
			Map request =(Map)ActionContext.getContext().get("request");
			request.put("welcome", "注册成功");
			Map application = ActionContext.getContext().getApplication();	
			if(application.get("count")==null){
				application.put("count", 1);
			}
			else{
				 int count=Integer.parseInt(application.get("count").toString());
			        application.put("count", count+1);
			}
			return SUCCESS;											//验证成功返回字符串SUCCESS，此时 Session 中已经有用户对象
		}else{
			return ERROR;											//验证失败返回字符串ERROR
		}
	}
	//验证登录名和密码是否为空
	public void validate() {
		if(user.getUsername()==null||user.getUsername().equals("")){
			this.addFieldError("username", "用户名不能为空！");
		}else if(user.getPassword()==null||user.getPassword().equals("")){
			this.addFieldError("password", "密码不能为空！");
		}
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
