<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
  ${msg}
	<form  method="post">
		用户名：<input type="text" name="username"><br>
		密    码：<input type="password" name="password"><br>
		<button type="button" name="login" onclick="submitForm('LoginServlet');" >登录</button><button type="button"name="register"value="注册" onclick="submitForm('RegisterServlet');">注册</button>
	</form>
	<script type="text/javascript">
	 
function submitForm(actionType){
document.forms[0].action="./"+actionType;  
document.forms[0].submit();}
</script> 
	

</body>
</html>
