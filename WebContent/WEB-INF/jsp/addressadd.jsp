<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  <form action="${pageContext.request.contextPath }/addressadding" method="post">
		<h4 align="center" style="color:black">地址添加</h4>
		<table align="center" border="1" >
			<tr>
				<td>收货人姓名</td>
				<td><input type="text" name="aname" />
				</td>
			</tr>
			<tr>
				<td>收货人地址</td>
				<td><input type="text" name="eaddress" />
				</td>
			</tr>
			
		</table>
		<p align="center"><input type="submit" value="提交"></p>
	</form>
  </body>
</html>
