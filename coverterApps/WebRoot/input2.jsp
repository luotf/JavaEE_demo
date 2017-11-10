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
   <s:form action="converter2" >
<s:textfield name="isbn" size="20" label="请输入"></s:textfield>
<s:textfield name="isbn" size="20" label="请输入"></s:textfield> 
<s:textfield name="isbn" size="20" label="请输入"></s:textfield>  
<s:submit value="提交"></s:submit>
   </s:form>
  </body>
</html>
