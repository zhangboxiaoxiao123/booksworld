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
		<h4 align="center" style="color:black">地址显示</h4>
		<table align="center" border="1" >
		<tr>
		<td>地址id</td>
		<td>收货人姓名</td>
		<td>收货人地址</td>
		<td>操作</td>
		</tr>
		<c:forEach var="address" items="${al}">
			<tr>
			<td>${address.aid}</td>
			<td>${address.aname}</td>
			<td>${address.eadress}</td>
			<td>  <input type="checkbox" name="ids" value="${address.uid}" /></td>
			</tr>
			</c:forEach>
		</table>
                       <input type="button" value="删除" class="align-right" onclick="document.form1.action='${pageContext.request.contextPath}/deleteAddress;document.form1.submit();">
                   <input type="button" value="添加" class="align-right" onclick="document.form1.action='${pageContext.request.contextPath}/addressadd;document.form1.submit();">
                   <input type="button" value="修改" class="align-right" onclick="document.form1.action='${pageContext.request.contextPath}/addressupdate';document.form1.submit();">
	</form>
  </body>
</html>
