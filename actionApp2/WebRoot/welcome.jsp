<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
	<title>欢迎页面</title>
</head>
<body>
	<table bgcolor="#71CABF" align="center">
		<tr>
		<s:set name="user" value="#session.user"></s:set>	
		<ul><li>欢迎您：<font color="red"><s:property value="#user.username"/></font></li></ul>
		</tr>
		<tr>
			<ul><li>服务器访问次数：<font color="red"><s:property value="#request.welcome"/></font></li></ul>
		</tr>
		<tr>
		<ul><li>服务器访问次数：<font color="red"><s:property value="#application.count"/></font></li></ul>
		</tr>
	</table>
</body>
</html>
