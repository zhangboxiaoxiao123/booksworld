<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>及时行乐-订单管理</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
           <!-- bootstrap -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet" />
    <link href="assets/css/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- libraries -->
    <link href="assets/css/jquery-ui-1.10.2.custom.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/font-awesome.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="assets/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/elements.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/icons.css" />

    <!-- this page specific styles -->
    <link rel="stylesheet" href="assets/admin/css/compiled/index.css" type="text/css" media="screen" />    
    <link href="assets/css/bootstrap-wysihtml5.css" type="text/css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/css/form-showcase.css" type="text/css" media="screen" />
    <!-- open sans font -->

    <!-- lato font -->

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
    
    <body>
        <!-- navbar -->
        <div class="navbar navbar-inverse">
            <div class="navbar-inner">
                <button type="button" class="btn btn-navbar visible-phone" id="menu-toggler">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="brand" href="index.html" style="font-weight:700;font-family:Microsoft Yahei">及时行乐-订单管理</a>
                <ul class="nav pull-right">
                    <li class="hidden-phone">
                        <input class="search" type="text" /></li>
                    <li class="notification-dropdown hidden-phone">
                        <a href="#" class="trigger">
                            <i class="icon-warning-sign"></i>
                            <span class="count">6</span></a>
                        <div class="pop-dialog">
                            <div class="pointer right">
                                <div class="arrow"></div>
                                <div class="arrow_border"></div>
                            </div>
                            <div class="body">
                                <a href="#" class="close-icon">
                                    <i class="icon-remove-sign"></i>
                                </a>
                                <div class="notifications">
                                    <h3>你有 6 个新通知</h3>
                                    <a href="#" class="item">
                                        <i class="icon-signin"></i>新用户注册
                                        <span class="time">
                                            <i class="icon-time"></i>13 分钟前.</span></a>
                                    <a href="#" class="item">
                                        <i class="icon-signin"></i>新用户注册
                                        <span class="time">
                                            <i class="icon-time"></i>18 分钟前.</span></a>
                                    <a href="#" class="item">
                                        <i class="icon-signin"></i>新用户注册
                                        <span class="time">
                                            <i class="icon-time"></i>49 分钟前.</span></a>
                                    <a href="#" class="item">
                                        <i class="icon-download-alt"></i>新订单
                                        <span class="time">
                                            <i class="icon-time"></i>1 天前.</span></a>
                                    <div class="footer">
                                        <a href="#" class="logout">查看所有通知</a></div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="notification-dropdown hidden-phone">
                        <a href="#" class="trigger">
                            <i class="icon-envelope-alt"></i>
                        </a>
                        <div class="pop-dialog">
                            <div class="pointer right">
                                <div class="arrow"></div>
                                <div class="arrow_border"></div>
                            </div>
                            <div class="body">
                                <a href="#" class="close-icon">
                                    <i class="icon-remove-sign"></i>
                                </a>
                                <div class="messages">
                                    <a href="#" class="item">
                                        <img src="/assets/admin/img/contact-img.png" class="display" />
                                        <div class="name">Alejandra Galván</div>
                                        <div class="msg">There are many variations of available, but the majority have suffered alterations.</div>
                                        <span class="time">
                                            <i class="icon-time"></i>13 min.</span>
                                    </a>
                                    <a href="#" class="item">
                                        <img src="/assets/admin/img/contact-img2.png" class="display" />
                                        <div class="name">Alejandra Galván</div>
                                        <div class="msg">There are many variations of available, have suffered alterations.</div>
                                        <span class="time">
                                            <i class="icon-time"></i>26 min.</span>
                                    </a>
                                    <a href="#" class="item last">
                                        <img src="/assets/admin/img/contact-img.png" class="display" />
                                        <div class="name">Alejandra Galván</div>
                                        <div class="msg">There are many variations of available, but the majority have suffered alterations.</div>
                                        <span class="time">
                                            <i class="icon-time"></i>48 min.</span>
                                    </a>
                                    <div class="footer">
                                        <a href="#" class="logout">View all messages</a></div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle hidden-phone" data-toggle="dropdown">账户管理
                            <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/changeemail">个人信息管理</a></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/changeemail">修改密码</a></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/list">订单管理</a></li>
                        </ul>
                    </li>
                    <li class="settings hidden-phone">
                        <a href="personal-info.html" role="button">
                            <i class="icon-cog"></i>
                        </a>
                    </li>
                    <li class="settings hidden-phone">
                        <a href="/index.php?r=admin%2Fpublic%2Flogout" role="button">
                            <i class="icon-share-alt"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- end navbar -->
        <!-- sidebar -->
        <div id="sidebar-nav">
            <ul id="dashboard-menu">
                <li class="active">
                    <a href="${pageContext.request.contextPath}/adminindex">
                        <i class="icon-home"></i>
                        <span>后台首页</span></a>
                </li>
                <li>
                    <a class="dropdown-toggle" href="#${pageContext.request.contextPath}/managers">
                        <i class="icon-user"></i>
                        <span>管理员管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                    <ul class="submenu">
                        <li>
                            <a href="/index.php?r=admin%2Fmanage%2Fmanagers">管理员列表</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/reg">加入新管理员</a></li>
                    </ul>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/list2">
                        <i class="icon-group"></i>
                        <span>评论管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                    <ul class="submenu">
                        <li>
                            <a href="/index.php?r=admin%2Fuser%2Fusers">用户列表</a></li>
                        <li>
                            <a href="/index.php?r=admin%2Fuser%2Freg">加入新用户</a></li>
                    </ul>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/cates">
                        <i class="icon-list"></i>
                        <span>分类管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                    <ul class="submenu">
                        <li>
                            <a href="${pageContext.request.contextPath}/cates">分类列表</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/categoryadd">加入分类</a></li>
                    </ul>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/products">
                        <i class="icon-glass"></i>
                        <span>商品管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                    <ul class="submenu">
                        <li>
                            <a href="${pageContext.request.contextPath}/products">商品列表</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/add">添加商品</a></li>
                    </ul>
                </li>
                <li>
                    <a class="dropdown-toggle" href="list.html">
						<div class="pointer">
                        <div class="arrow"></div>
                        <div class="arrow_border"></div>
                    </div>
                        <i class="icon-edit"></i>
                        <span>订单管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
				<li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/send">

                        <span>发货</span>

                    </a>
                </li>
                
            </ul>
        </div>
        <!-- end sidebar -->
        <link rel="stylesheet" href="assets/admin/css/compiled/user-list.css" type="text/css" media="screen" />
        <!-- main container -->
        <div class="content">
            <div class="container-fluid">
                <div id="pad-wrapper" class="users-list">
                    <div class="row-fluid header">
                        <h3>订单列表</h3></div>
                    <!-- Users table -->
                    <div class="row-fluid table">
                         <form action="${pageContext.request.contextPath }/orderupdating" method="post">
		<h4 align="center" style="color:black">订单信息修改</h4>
		<table align="center" border="1" >
			<tr>
				<td>买家姓名</td>
				<td><input type="text" name="uname" />
				</td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="text" name="uphone" />
				</td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" name="uaddress"  />
				</td>
			</tr>
			<tr>
				<td>邮编</td>
				<td><input type="text" name="uzip" />
				</td>
			</tr>
		</table>
		<p align="center"><input type="submit" value="提交"></p>
	</form>
                    </div>
                    <div class="pagination pull-right"></div>
                    <!-- end users table --></div>
            </div>
        </div>
        <!-- end main container -->
        <!-- scripts -->
        <script src="/assets/admin/js/jquery-latest.js"></script>
        <script src="/assets/admin/js/bootstrap.min.js"></script>
        <script src="/assets/admin/js/jquery-ui-1.10.2.custom.min.js"></script>
        <!-- knob -->
        <script src="/assets/admin/js/jquery.knob.js"></script>
        <!-- flot charts -->
        <script src="/assets/admin/js/jquery.flot.js"></script>
        <script src="/assets/admin/js/jquery.flot.stack.js"></script>
        <script src="/assets/admin/js/jquery.flot.resize.js"></script>
        <script src="/assets/admin/js/theme.js"></script>
        <script src="/assets/admin/js/wysihtml5-0.3.0.js"></script>
        <script src="/assets/admin/js/bootstrap-wysihtml5-0.0.2.js"></script>
        <script type="text/javascript">$(function() {

                // jQuery Knobs
                $(".knob").knob();

                // jQuery UI Sliders
                $(".slider-sample1").slider({
                    value: 100,
                    min: 1,
                    max: 500
                });
                $(".slider-sample2").slider({
                    range: "min",
                    value: 130,
                    min: 1,
                    max: 500
                });
                $(".slider-sample3").slider({
                    range: true,
                    min: 0,
                    max: 500,
                    values: [40, 170],
                });

                // jQuery Flot Chart
                var visits = [[1, 50], [2, 40], [3, 45], [4, 23], [5, 55], [6, 65], [7, 61], [8, 70], [9, 65], [10, 75], [11, 57], [12, 59]];
                var visitors = [[1, 25], [2, 50], [3, 23], [4, 48], [5, 38], [6, 40], [7, 47], [8, 55], [9, 43], [10, 50], [11, 47], [12, 39]];

                var plot = $.plot($("#statsChart"), [{
                    data: visits,
                    label: "注册量"
                },
                {
                    data: visitors,
                    label: "访客量"
                }], {
                    series: {
                        lines: {
                            show: true,
                            lineWidth: 1,
                            fill: true,
                            fillColor: {
                                colors: [{
                                    opacity: 0.1
                                },
                                {
                                    opacity: 0.13
                                }]
                            }
                        },
                        points: {
                            show: true,
                            lineWidth: 2,
                            radius: 3
                        },
                        shadowSize: 0,
                        stack: true
                    },
                    grid: {
                        hoverable: true,
                        clickable: true,
                        tickColor: "#f9f9f9",
                        borderWidth: 0
                    },
                    legend: {
                        // show: false
                        labelBoxBorderColor: "#fff"
                    },
                    colors: ["#a7b5c5", "#30a0eb"],
                    xaxis: {
                        ticks: [[1, "一月"], [2, "二月"], [3, "三月"], [4, "四月"], [5, "五月"], [6, "六月"], [7, "七月"], [8, "八月"], [9, "九月"], [10, "十月"], [11, "十一月"], [12, "十二月"]],
                        font: {
                            size: 12,
                            family: "Open Sans, Arial",
                            variant: "small-caps",
                            color: "#697695"
                        }
                    },
                    yaxis: {
                        ticks: 3,
                        tickDecimals: 0,
                        font: {
                            size: 12,
                            color: "#9da3a9"
                        }
                    }
                });

                function showTooltip(x, y, contents) {
                    $('<div id="tooltip">' + contents + '</div>').css({
                        position: 'absolute',
                        display: 'none',
                        top: y - 30,
                        left: x - 50,
                        color: "#fff",
                        padding: '2px 5px',
                        'border-radius': '6px',
                        'background-color': '#000',
                        opacity: 0.80
                    }).appendTo("body").fadeIn(200);
                }

                var previousPoint = null;
                $("#statsChart").bind("plothover",
                function(event, pos, item) {
                    if (item) {
                        if (previousPoint != item.dataIndex) {
                            previousPoint = item.dataIndex;

                            $("#tooltip").remove();
                            var x = item.datapoint[0].toFixed(0),
                            y = item.datapoint[1].toFixed(0);

                            var month = item.series.xaxis.ticks[item.dataIndex].label;

                            showTooltip(item.pageX, item.pageY, item.series.label + " of " + month + ": " + y);
                        }
                    } else {
                        $("#tooltip").remove();
                        previousPoint = null;
                    }
                });
            });
            $(".wysihtml5").wysihtml5({
                "font-styles": false
            });
            $("#addpic").click(function() {
                var pic = $("#product-pics").clone();
                pic.attr("style", "margin-left:120px");
                $("#product-pics").parent().append(pic);
            });</script>
    </body>

</html>