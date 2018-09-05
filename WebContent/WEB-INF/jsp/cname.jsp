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
<form  name="form1" id="form1" method="post">
		<h4 align="center" style="color:black">书籍信息</h4>
		<table align="center" border="0" >
		<tr>
		<td>书名</td>
		<td>书价格</td>
		<td>类型</td>
		<td>数量</td>
		<td>书的描述</td>
		<td>操作</td>
		</tr>
		<c:forEach var="name" items="${name}">
			<tr>
			<td><a name = "cname" href = "${pageContext.request.contextPath}/book">${name.cname}</a></td>
			<td>${name.cprice}</td>
			<td>${name.ctype}</td>
			<td>${name.cnumber}</td>
			<td>${name.cif}</td>
			<td>  <input type="checkbox" name="ids" value="${name.cid}" /></td>
			</tr>
			</c:forEach>
		</table>   
	</form>
  </body>
</html>
