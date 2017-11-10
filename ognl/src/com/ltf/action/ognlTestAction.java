package com.ltf.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ltf.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ognlTestAction extends ActionSupport {
	private List<Student> stuList=new ArrayList<Student>();
	public String execute() throws Exception{
		stuList.add(new Student("0901", "张驰", "男", "21", "北京"));
		stuList.add(new Student("0902", "李伟", "男", "20", "四川"));
		stuList.add(new Student("0903", "王可", "女", "18", "广东"));
		stuList.add(new Student("0904", "赵冰", "女", "19", "四川"));
		stuList.add(new Student("0905", "谢玫", "女", "21", "湖南"));
		stuList.add(new Student("0906", "胡新", "男", "19", "四川"));
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("stuList", stuList);
		return SUCCESS;
	}
}
