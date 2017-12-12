package com.ltf.interceptor;


import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {

		@Override
		public String intercept(ActionInvocation arg0) throws Exception {
			//获得action上下文
			String actionName=arg0.getProxy().getActionName();
	        if("login".equals(actionName)){
	            return arg0.invoke();
	                    
	        }
			ActionContext ctx=arg0.getInvocationContext();
			Map session=ctx.getSession();
			String username=(String) session.get("username");
			if("admin".equals(username)){
				return arg0.invoke();
			}
			return "login";
		}

}
