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
  
  
   <s:action name="tag" executeResult="true">
    <s:bean name="com.ltf.bean.Person" var="person">
    	<s:param name="name">tom</s:param>
    	<s:param name="birthday">1999-6-1</s:param>
    </s:bean>
   
    </s:action>
   
    <s:property value="#person.name"/>
    <br>
    <s:date name="#person.birthday" format="yyyy年-MM月-dd日"/>
    <br>
     <s:date name="#person.birthday" format="yyyy年-MM月-dd日" nice="true"/>
     <br>
     <s:url action="tag">
     	<s:param name="id">001</s:param>
     </s:url>
     <br>
    <s:include value="success.jsp"></s:include>
 
  </body>
</html>
