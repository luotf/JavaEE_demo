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
   <s:form action="bookAction">
   		<s:textarea name="bookName" label="书名"></s:textarea>
   		<s:textarea name="author" label="作者"></s:textarea>
   		<s:textarea name="bookNo" label="书号"></s:textarea>
   		<s:textarea name="publisher" label="出版社"></s:textarea>
   		<s:textarea name="publishDate" label="出版日期"></s:textarea>
   		<s:textarea name="bookPrice" label="价格"></s:textarea>
   		<s:textarea name="bookSum" label="库存数量"></s:textarea>
   		<s:submit value="提交"></s:submit>
   </s:form>
  </body>
</html>
