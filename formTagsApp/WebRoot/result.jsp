<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	
	
  </head>
  
  <body>
  
  	<font size="20px">选择的省份为：</font>
  	<font color="red" size="20px"><s:property value="#request.n"/></font><br>
  	<font size="20px">选择的城市为：</font>
  	<font color="red" size="20px"><s:property value="#request.dn"/></font><br>
 	<font size="20px">选择书名的作者为：</font>
 	<font color="red" size="20px"><s:property value="#request.book"/></font>
   
  </body>
</html>
