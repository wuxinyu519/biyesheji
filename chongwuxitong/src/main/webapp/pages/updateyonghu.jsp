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
<title>修改用户</title>
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
								<h1>修改用户</h1>
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
								<div class="card-title">修改用户</div>
							</div>
							<div class="card-body">
								<form action="updateyonghuact.action" method="post"
									enctype="multipart/form-data">
									<input name='id' style='display: none;' value="${yonghu.id}">
									<div class="form-group">
										<label class="col-sm-12 control-label">名字</label>
										<div class="col-sm-12">
											<!-- 定义名字input输入框，并从request中取值yonghu.mingzi赋值  -->

											<input name="mingzi" value="${yonghu.mingzi}"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">账号</label>
										<div class="col-sm-12">
											<!-- 定义username的输入框，并设置其为只读  -->

											<input readonly name="username" value="${yonghu.username}"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">密码</label>
										<div class="col-sm-12">
											<!-- 定义密码input输入框，并从request中取值yonghu.password赋值  -->

											<input name="password" value="${yonghu.password}"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">性别</label>
										<div class="col-sm-12">
											<!-- 定义性别下拉框 -->

											<select id='xingbie' onchange="xingbiechange(this)"
												name="xingbie" class="form-control"><option>男</option>
												<option>女</option></select>
											<script>
 <!-- 将id为xingbie的组件赋值为request中的yonghu.xingbie字段 -->  

$("#xingbie").val("${yonghu.xingbie}")</script>

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">介绍</label>
										<div class="col-sm-12">
											<textarea name="jieshao" style="height: 200px;"
												class="form-control">${yonghu.jieshao}</textarea>
										</div>
									</div>
									<button type="submit" class="btn btn-primary">修改</button>
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

