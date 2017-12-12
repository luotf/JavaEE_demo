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
    
    <title>SUCCESS</title>
	
  </head>
  
  <body>
  <s:i18n name="mess">
  <s:text name="email1"></s:text>&nbsp;&nbsp;
  <s:property value="email"/>&nbsp;&nbsp;&nbsp;<s:property value="msg"/>
  <br>
  <s:text name="time"></s:text>&nbsp;&nbsp;<s:date name="#request.date" format="yyyy年MM月dd日"/>
   </s:i18n>
  </body>
</html>
