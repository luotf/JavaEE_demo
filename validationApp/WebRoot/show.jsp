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
   书名：<s:property value="bookName"/><br>
   作者：<s:property value="author"/><br>
   书号：<s:property value="bookNo"/><br>
   出版社：<s:property value="publisher"/><br>
   出版日期：<s:property value="publishDate"/><br>
  价格：<s:property value="bookPrice"/><br>
  库存数量：<s:property value="bookSum"/>
  </body>
</html>
