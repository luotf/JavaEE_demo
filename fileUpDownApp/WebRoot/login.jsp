<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>FROM</title>
		
  </head>
  <body>
  <s:form action="login" method="post">
  	<s:textarea name="username" label="用户名"></s:textarea>
  	<s:textarea name="password" label="密码"></s:textarea>
  	<s:submit value="登录"></s:submit>
  </s:form>
  </body>
</html>
