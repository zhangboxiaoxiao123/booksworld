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
  <form action="${pageContext.request.contextPath }/admincommodityupdate" method="post">
		<h4 align="center" style="color:black">商品信息修改</h4>
		<table align="center" border="1" >
			<tr>
				<td>图书名称</td>
				<td><input type="text" name="cname" />
				</td>
			</tr>
			<tr>
				<td>图书价格</td>
				<td><input type="text" name="cprice" />
				</td>
			</tr>
			<tr>
				<td>图书类型</td>
				<td><input type="text" name="ctype" />
				</td>
			</tr>
			<tr>
				<td>图书数量</td>
				<td><input type="text" name="cnumber"  />
				</td>
			</tr>
			<tr>
				<td>图书描述</td>
				<td><input type="text" name="comment" />
				</td>
			</tr>
		</table>
		<p align="center"><input type="submit" value="提交"></p>
	</form>
  </body>
</html>
