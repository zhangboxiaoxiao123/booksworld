<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>及时行乐-商品管理</title>
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
                <a class="brand" href="${pageContext.request.contextPath}/adminindex" style="font-weight:700;font-family:Microsoft Yahei">及时行乐-商品管理</a>
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
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/managers">
                        <i class="icon-user"></i>
                        <span>管理员管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/list2">
                        <i class="icon-group"></i>
                        <span>评论管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/cates">
                        <i class="icon-list"></i>
                        <span>分类管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/products">
                        <i class="icon-glass"></i>
                        <span>商品管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
				<li>
					<div class="pointer">
                        <div class="arrow"></div>
                        <div class="arrow_border"></div>
                    </div>
                    <a class="dropdown-toggle" href="add.html">
                        <span>添加商品</span>
                    </a>
                </li>
                <li>
                    <a class="dropdown-toggle" href="${pageContext.request.contextPath}/list">
                        <i class="icon-edit"></i>
                        <span>订单管理</span>
                        <i class="icon-chevron-down"></i>
                    </a>
                </li>
            </ul>
        </div>
        <!-- end sidebar -->
        <style>.span8 div{ display:inline; } .help-block-error { color:red; display:inline; }</style>
        <link rel="stylesheet" href="assets/admin/css/compiled/new-user.css" type="text/css" media="screen" />
        <!-- main container -->
        <div class="content">
            <div class="container-fluid">
                <div id="pad-wrapper" class="new-user">
                    <div class="row-fluid header">
                        <h3>添加商品</h3></div>
                    <div class="row-fluid form-wrapper">
                        <!-- left column -->
                        <div class="span9 with-sidebar">
                            <div class="container">
                                <form id="w0" class="new_user_form inline-input" action="products.html" method="post" enctype="multipart/form-data">
                                    <input type="hidden" name="_csrf" value="LjJsTTRjRURcfAsrTFFoLh8KDR1MFTARXwINAWEADTJKdT00BhcGNg==">
                                    <div class="form-group field-cates required">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="cates">分类名称</label>
                                            <select id="cates" class="form-control" name="Product[cateid]">
                                                <option value="1">|-----服装</option>
                                                <option value="2">|-----|-----上衣</option>
                                                <option value="3">|-----电子产品</option>
                                                <option value="6">|-----|-----手机</option>
                                        </div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-product-title required">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="product-title">商品名称</label>
                                            <input type="text" id="product-title" class="span9" name="Product[title]" placeholder="商品名"></div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-wysi required">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="wysi">商品描述</label>
                                            <textarea id="wysi" class="span9 wysihtml5" name="Product[descr]" style="margin-left:120px"></textarea>
                                        </div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-product-price required">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="product-price">商品价格</label>
                                            <input type="text" id="product-price" class="span9" name="Product[price]"></div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-product-ishot">

                                    <div class="form-group field-product-num">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="product-num">库存</label>
                                            <input type="text" id="product-num" class="span9" name="Product[num]"></div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-product-cover required">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="product-cover">图片封面</label>
                                            <input type="hidden" name="Product[cover]" value="">
                                            <input type="file" id="product-cover" class="span9" name="Product[cover]"></div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <div class="form-group field-product-pics">
                                        <div class="span12 field-box">
                                            <label class="control-label" for="product-pics">商品图片</label>
                                            <input type="hidden" name="Product[pics][]" value="">
                                            <input type="file" id="product-pics" class="span9" name="Product[pics][]" multiple></div>
                                        <p class="help-block help-block-error"></p>
                                    </div>
                                    <hr>
                                    <div class="span11 field-box actions">
                                        <button type="submit" class="btn-glow primary">提交</button>
                                        <span>OR</span>
                                        <button type="reset" class="reset">取消</button></div>
                                </form>
                            </div>
                        </div>
                        <!-- side right column -->
                        <div class="span3 form-sidebar pull-right">
                            <div class="alert alert-info hidden-tablet">
                                <i class="icon-lightbulb pull-left"></i>请在左侧表单当中填入要添加的商品信息,包括商品名称,描述,图片等</div>
                            
                        </div>
                    </div>
                </div>
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