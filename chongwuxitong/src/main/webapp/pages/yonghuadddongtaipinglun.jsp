 ﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>添加动态回复</title>
<link rel="shortcut icon" type="image/x-icon"
	href="Vertical/favicon.ico">
<!-- google font -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700"
	rel="stylesheet" type="text/css" />
<link href="resource/houtai/assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="resource/houtai/assets/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="resource/houtai/assets/css/ionicons.css" rel="stylesheet"
	type="text/css">
<link href="resource/houtai/assets/css/simple-line-icons.css"
	rel="stylesheet" type="text/css">
<link href="resource/houtai/assets/css/jquery.mCustomScrollbar.css"
	rel="stylesheet">
<link href="resource/houtai/assets/css/style.css" rel="stylesheet">
<link href="resource/houtai/assets/css/responsive.css" rel="stylesheet">
<script type="text/javascript"
	src="resource/houtai/assets/js/jquery.min.js"></script>
</head>

<body>
	<div class="wrapper">
		<!-- header -->
		<header class="main-header">
			<div class="container_header">
				<div class="logo d-flex align-items-center">
					<a href="index.action" style="margin-left: 30px;color: black;font-weight: bold;font-size: 30px;">
						流浪宠物
					</a>
					<div class="icon_menu full_menu">
						<a href="#" class="menu-toggler sidebar-toggler"></a>
					</div>
				</div>
			</div>

		</header>
		<!-- header_End -->
		<!-- Content_right -->
		<div class="container_full">

			<div class="side_bar scroll_auto">


				<c:import url="htmenu.jsp"></c:import>

			</div>

			<!--main contents start-->
			<main class="content_wrapper"> <!--page title start-->
			<div class="page-heading">
				<div class="container-fluid">
					<div class="row d-flex align-items-center">
						<div class="col-md-6">
							<div class="page-breadcrumb">
								<h1>添加动态回复</h1>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--page title end-->
			<div class="container-fluid">
				<!-- state start-->
				<div class="row">
					<div class=" col-md-12">
						<div class="card card-shadow mb-4">
							<div class="card-header">
								<div class="card-title">添加动态回复</div>
							</div>
							<div class="card-body">
								<form action="yonghuadddongtaipinglunact.action" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-12 control-label">动态</label>
										<div class="col-sm-12">
											<!--  定义 dongtai-->

											<select id='dongtai' onchange="dongtaichange(this)"
												name="dongtai" class="form-control">
												<!-- 使用c标签的if表达式判断dongtaiall是否为空 -->

												<c:if test="${ !empty dongtaiall}">

													<!-- 使用c标签的forEach表达式循环dongtaiall并将其biaoti字段进行展示 -->

													<c:forEach items="${ dongtaiall}" var="item">



														<option value="${item.biaoti }">${item.biaoti }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

// 定义dongtaichange方法，当dongtai改变时执行 

                                                	function dongtaichange(select){

<!-- 将dongtaiid"的值改变为与 dongtai项数相同的值，即dongtai为第一项则dongtaiid为第一项-->

                                           $("#dongtaiid").val($("#dongtaiid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在dongtaiid，使用GetQueryString方法获取该值 -->

                                            var dongtaiid = GetQueryString("dongtaiid"); 

<!-- 如果dongtaiid不等于null -->

											if(dongtaiid!=null) { 

<!-- 将地址栏中的 dongtaiid值赋值给id为dongtaiid的项-->

											　　$("#dongtaiid").val(dongtaiid);

<!-- 获取到id为dongtaiid的项-->

												var sel=document.getElementById("dongtaiid"); 

<!-- 获取到sel当前的选择项-->

												var dongtaiidselectedindex = sel.selectedIndex;

<!-- 将id为dongtai赋值为与dongtaiid相同的项数的值，即当前dongtaiid项目为第一项时，dongtai项为第一项 -->

											   $("#dongtai").val($("#dongtai option:eq("+dongtaiidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">动态id</label>
										<div style='display: none;' class="col-sm-12">
											<!--  定义 dongtaiid-->

											<select id='dongtaiid' onchange="dongtaiidchange(this)"
												name="dongtaiid" class="form-control">
												<!-- 使用c标签的if表达式判断dongtaiall是否为空 -->

												<c:if test="${ !empty dongtaiall}">

													<!-- 使用c标签的forEach表达式循环dongtaiall并将其id字段进行展示 -->

													<c:forEach items="${ dongtaiall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

// 定义dongtaiidchange方法，当dongtaiid改变时执行 

                                                	function dongtaiidchange(select){

<!-- 将dongtaiidid"的值改变为与 dongtaiid项数相同的值，即dongtaiid为第一项则dongtaiidid为第一项-->

                                           $("#dongtaiidid").val($("#dongtaiidid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在dongtaiidid，使用GetQueryString方法获取该值 -->

                                            var dongtaiidid = GetQueryString("dongtaiidid"); 

<!-- 如果dongtaiidid不等于null -->

											if(dongtaiidid!=null) { 

<!-- 将地址栏中的 dongtaiidid值赋值给id为dongtaiidid的项-->

											　　$("#dongtaiidid").val(dongtaiidid);

<!-- 获取到id为dongtaiidid的项-->

												var sel=document.getElementById("dongtaiidid"); 

<!-- 获取到sel当前的选择项-->

												var dongtaiididselectedindex = sel.selectedIndex;

<!-- 将id为dongtaiid赋值为与dongtaiidid相同的项数的值，即当前dongtaiidid项目为第一项时，dongtaiid项为第一项 -->

											   $("#dongtaiid").val($("#dongtaiid option:eq("+dongtaiididselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">内容</label>
										<div class="col-sm-12">
											<!-- 定义neirong文本输入框，并将其加载为富文本-->

											<textarea id="neirong" name="neirong" style="height: 200px;"
												class="form-control"></textarea>
											<!-- 导入富文本组件 -->

											<link rel="stylesheet" type="text/css"
												href="resource/simditor/styles/simditor.css" />
											<script type="text/javascript"
												src="resource/simditor/scripts/jquery.min.js"></script>
											<script type="text/javascript"
												src="resource/simditor/scripts/module.min.js"></script>
											<script type="text/javascript"
												src="resource/simditor/scripts/hotkeys.min.js"></script>
											<script type="text/javascript"
												src="resource/simditor/scripts/uploader.min.js"></script>
											<script type="text/javascript"
												src="resource/simditor/scripts/simditor.js"></script>
											<script>
<!-- 将id为neirong的textarea加载为富文本 -->

											var editor = new Simditor({
												upload : {},												textarea : $('#neirong'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">回复人</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 使用el表达式给pinglunrenmingzi复制，将session中的pinglunrenmingzi赋值到input中-->

											<input value="${sessionScope.userinfo.mingzi}"
												name="pinglunrenmingzi" class="form-control">
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">回复人id</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 使用el表达式给pinglunrenid复制，将session中的pinglunrenid赋值到input中-->

											<input value="${sessionScope.userinfo.id}"
												name="pinglunrenid" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">回复时间</label>
										<div class="col-sm-12">
											<!-- 将id为dangqianshijian的项内容设置为当前时间-->

											<script>
												$(function(){
document.getElementById("dangqianshijian").value = new Date().toLocaleString();
})
												</script>
											<!-- 定义id为dangqianshijian的input输入框，并设置为只读-->

											<input readonly type="text" id="dangqianshijian"
												name="pinglunshijian" class="form-control">
										</div>
									</div>
									<button type="submit" class="btn btn-primary">添加</button>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!-- state end-->
			</div>
			</main>
			<!--main contents end-->
		</div>

		<!-- Content_right_End -->
	</div>
	<script type="text/javascript"
		src="resource/houtai/assets/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/popper.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="resource/houtai/assets/js/custom.js"
		type="text/javascript"></script>
	<script>
        if("${message}"){
            alert("${message}");
        }
    </script>
</body>

</html>

