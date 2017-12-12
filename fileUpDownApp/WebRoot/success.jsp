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
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  <body>
  用户名:<s:property value="username"/><br/>
  用户名:<s:property value="zhuanye"/><br/>
  用户名:<s:property value="nianji"/><br/>
   您所上传的图片是:<img src="<s:property value="#request.path"/>" width="200px" height="200px"><br/>
  您所上传的简历是:<a href=""><s:property value="uploadFileName[1]"/></a>
  </body>
</html>
