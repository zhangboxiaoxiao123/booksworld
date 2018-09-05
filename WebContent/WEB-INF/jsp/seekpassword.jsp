<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html class="login-bg">
    
    <head>
        <title>慕课商城 - 后台管理</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- bootstrap -->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <link href="assets/css/bootstrap-responsive.css" rel="stylesheet" />
        <link href="assets/css/bootstrap-overrides.css" type="text/css" rel="stylesheet" />
        <!-- global styles -->
        <link rel="stylesheet" type="text/css" href="assets/css/layout.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/elements.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/icons.css" />
        <!-- libraries -->
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css" />
        <!-- this page specific styles -->
        <link rel="stylesheet" href="assets/css/signin.css" type="text/css" media="screen" />
        <!-- open sans font -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
    
    <body>
        <div class="row-fluid login-wrapper">
            <a class="brand" href="index.html"></a>
            <form id="w0"  method="post" role="form" action = "${pageContext.request.contextPath}/login">
                <input type="hidden" name="_csrf" value="YW1ZZHZ4el8TIz4CDkpXNVBVODQODg8KEF04KCMbMikFKggdRAw5LQ==">
                <div class="span4 box">
                    <div class="content-wrap">
                        <h6>慕课商城 - 找回密码</h6>
                        <div class="form-group field-admin-adminuser">
                            <p class="help-block help-block-error"></p>
                            <input type="text" id="uname" class="span12" name="uname" placeholder="管理员账号"></div>
                        <div class="form-group field-admin-adminemail">
                            <p class="help-block help-block-error"></p>
                           <input type="text" id="uemail" class="span12" name="uemail" placeholder="管理员邮箱"></div>
                        <a href="login.html" class="forgot">返回登录</a>
                        <button type="submit" class="btn-glow primary login">发送邮件</button></div>
                </div>
            </form>
        </div>
        <!-- scripts -->
        <script src="assets/admin/js/jquery-latest.js"></script>
        <script src="assets/admin/js/bootstrap.min.js"></script>
        <script src="assets/admin/js/theme.js"></script>
        <!-- pre load bg imgs -->
        <script type="text/javascript">$(function() {
                // bg switcher
                var $btns = $(".bg-switch .bg");
                $btns.click(function(e) {
                    e.preventDefault();
                    $btns.removeClass("active");
                    $(this).addClass("active");
                    var bg = $(this).data("img");

                    $("html").css("background-image", "url('img/bgs/" + bg + "')");
                });

            });</script>
    </body>

</html>