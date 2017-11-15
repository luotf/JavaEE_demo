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
	<s:form action="select">
		<s:set name="ds"
			value="#{'四川':{'成都','广元','西昌'},
  	'江苏':{'南京','无锡','苏州'},
  	'安徽':{'合肥','六安','芜湖'}
  	}">
		</s:set>
		<s:doubleselect list="#ds.keySet()" doubleList="#ds[top]"
			doubleName="dn" name="n" label="请选择城市" labelposition="top">
		</s:doubleselect>
		<s:radio list="#request.mappedBook" label="请选择图书" listKey="value"
			listValue="key" name="book" >
		</s:radio>
		<s:submit value="提交" method="selectCity" cssStyle="font-size:20px"></s:submit>
	</s:form>
</body>
</html>
