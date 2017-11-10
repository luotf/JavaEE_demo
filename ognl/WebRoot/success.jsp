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
    
    <title>My JSP 'success.jsp' starting page</title>
    

  </head>
  
  <body>
   获取籍贯是四川的所有学生姓名:
 	<s:property value="#request.stuList.{?#this.snative=='四川'}.{name}"/><br>
  获取年龄小于20的第一个学生的姓名:
  	<s:property value="#request.stuList.{^#this.age<20}.{name}"/><br>
  获取最后一个女同学的姓名:
    <s:property value="#request.stuList.{$#this.sex=='"女"'}.{name}"/><br>
   获取所有年龄为18的学生籍贯：
   <s:property value="#request.stuList.{?#this.age==18}.{snative}"/><br>
   获取名为“李四”的学生的学号：
   <s:property value="#request.stuList.{?#this.name=='李四'}.{no}"/><br>
  </body>
  E值:
  <s:property value="@java.lang.Math@E"/>
  <s:property value="@classpath@JAVA_HOME"/>
</html>
