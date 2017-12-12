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
  <s:i18n name="mess">
   <s:form action="SubscribeAction" method="post">
			<h3><s:text name="subscribePage"></s:text></h3>
			<s:textfield name="email" key="inputEmail"></s:textfield>
			<s:submit value="%{getText('submit')}"></s:submit>
		</s:form>
	<s:text name="language"></s:text>
	<a href="subscribe1?request_locale=zh_CN"><s:text name="Simplified Chinese"></s:text></a>
	<a href="subscribe1?request_locale=zh_HK"><s:text name="Traditional Chinese"></s:text></a>
 </s:i18n>
  </body>
</html>
