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
<title>修改领养</title>
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
								<h1>修改领养</h1>
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
								<div class="card-title">修改领养</div>
							</div>
							<div class="card-body">
								<form action="updatelingyangact.action" method="post"
									enctype="multipart/form-data">
									<input name='id' style='display: none;' value="${lingyang.id}">
									<div class="form-group">
										<label class="col-sm-12 control-label">宠物</label>
										<div class="col-sm-12">
											<!-- 定义宠物下拉框 -->

											<select id='liulangchongwu'
												onchange="liulangchongwuchange(this)" name="liulangchongwu"
												class="form-control">
												<!-- 使用c标签的if表达式判断liulangchongwuall是否为空 -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 使用c标签的forEach表达式循环输出liulangchongwuall -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义liulangchongwuchange方法 -->  

                                                	function liulangchongwuchange(select){

 <!-- 获取传入的select的选中项的项数， 将id为liulangchongwuid的选中项改变为与其一致  -->  

                                           $("#liulangchongwuid").val($("#liulangchongwuid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为liulangchongwu的值为request中的lingyang.liulangchongwu  -->  

$("#liulangchongwu").val("${lingyang.liulangchongwu}")</script>

										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">宠物id</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 定义宠物id下拉框 -->

											<select id='liulangchongwuid'
												onchange="liulangchongwuidchange(this)"
												name="liulangchongwuid" class="form-control">
												<!-- 使用c标签的if表达式判断liulangchongwuall是否为空 -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 使用c标签的forEach表达式循环输出liulangchongwuall -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义liulangchongwuidchange方法 -->  

                                                	function liulangchongwuidchange(select){

 <!-- 获取传入的select的选中项的项数， 将id为liulangchongwuidid的选中项改变为与其一致  -->  

                                           $("#liulangchongwuidid").val($("#liulangchongwuidid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为liulangchongwuid的值为request中的lingyang.liulangchongwuid  -->  

$("#liulangchongwuid").val("${lingyang.liulangchongwuid}")</script>

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">用户</label>
										<div class="col-sm-12">
											<!-- 定义用户下拉框 -->

											<select id='yonghu' onchange="yonghuchange(this)"
												name="yonghu" class="form-control">
												<!-- 使用c标签的if表达式判断yonghuall是否为空 -->

												<c:if test="${ !empty yonghuall}">

													<!-- 使用c标签的forEach表达式循环输出yonghuall -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义yonghuchange方法 -->  

                                                	function yonghuchange(select){

 <!-- 获取传入的select的选中项的项数， 将id为yonghuid的选中项改变为与其一致  -->  

                                           $("#yonghuid").val($("#yonghuid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为yonghu的值为request中的lingyang.yonghu  -->  

$("#yonghu").val("${lingyang.yonghu}")</script>

										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">用户id</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 定义用户id下拉框 -->

											<select id='yonghuid' onchange="yonghuidchange(this)"
												name="yonghuid" class="form-control">
												<!-- 使用c标签的if表达式判断yonghuall是否为空 -->

												<c:if test="${ !empty yonghuall}">

													<!-- 使用c标签的forEach表达式循环输出yonghuall -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义yonghuidchange方法 -->  

                                                	function yonghuidchange(select){

 <!-- 获取传入的select的选中项的项数， 将id为yonghuidid的选中项改变为与其一致  -->  

                                           $("#yonghuidid").val($("#yonghuidid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为yonghuid的值为request中的lingyang.yonghuid  -->  

$("#yonghuid").val("${lingyang.yonghuid}")</script>

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">领养日期</label>
										<div class="col-sm-12">
											<!-- 定义领养日期输入框，并设置其值为当前时间  -->

											<input type="text" readonly value="${lingyang.lyriqi}"
												name="lyriqi" class="form-control">
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

