<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
<form  name="form1" id="form1" method="post" action = "${pageContext.request.contextPath}/userrevise">
		<h4 align="center" style="color:black">个人信息显示</h4>
		<table align="center" border="1" >
			               <c:forEach var="user" items="${ul}">
			   <tr><td>用戶名</td><td><input type = "text"  id= "uname"  value= "${user.uname }"></td></tr>
			   <tr><td>用戶密码</td><td><input type = "text"  id= "upwd"  value= "${user.upwd }"></td></tr>
			   <tr><td>地址</td><td><input type = "text"  id= "uadress"  value = "${user.address }"></td></tr>
			   <tr><td>联系方式</td><td><input type = "text"  id= "uphone"  value= "${user.uphone }"></td></tr>
			   <tr><td>性别</td><td><input type = "text"  id= "ugender"  value= "${user.gender }"></td></tr>
			   <tr><td>生日</td><td><input type = "text"  id= "ubirthday" value= "${user.birthday }"></td></tr>
			   <tr><td>邮编</td><td><input type = "text"  id= "uzip"  value= "${user.uzip }"></td></tr>
			              </c:forEach>
		</table>
                         	<input type="submit" value="修改" class="align-right" >
	</form>
  </body>
</html>
