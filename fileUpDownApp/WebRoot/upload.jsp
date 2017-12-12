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
   <s:form action="upload" enctype="multipart/form-data" method="post">
   <s:textarea name="username" label="用户名"></s:textarea>
   <s:select list="#{1:'软件工程',2:'数字媒体',3:'计算机科学与技术' }" label="专业" name="zhuanye"></s:select>
   <s:select list="#{1:'2015级',2:'2016级',3:'2017级' }" label="年级" name="nianji"></s:select>
   <s:file label="头像" name="upload" ></s:file>
   <s:file label="简历" name="upload" ></s:file>
   <s:submit value="提交"></s:submit>
   </s:form>
  </body>
</html>
