<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>登录</title>
	<script language="javascript">
function login() {
            form1.action='login';
            form1.submit();
    }
    function regis() {
        
            form1.action='regis';
            form1.submit();
        
    }
</script>
	
</head>
<body bgcolor="#71CABF">
<s:form action="" method="post" theme="simple" name="form1">
	<table>
		<caption>用户登录</caption>
		<tr>
			<td>登录名<s:textfield name="user.username" size="20"/></td>
		</tr>
		<tr>
			<td>密&nbsp;&nbsp;码<s:password name="user.password" size="21"/></td>
		</tr>
		<tr>
			<td>
				<input type="button"  value="登录"  onclick="login()" />
				<input type="button"  value="注册"  onclick="regis()" />
			</td>
		</tr>
		<!-- 验证失败信息或错误信息在这里显示 -->
		<tr>
			<td>
				<font color="red"><s:fielderror/><s:property value="message"/></font>
			</td>
		</tr>
		
		
	</table>
</s:form>
</body>
</html>
