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
<title>修改动态回复</title>
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
								<h1>修改动态回复</h1>
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
								<div class="card-title">修改动态回复</div>
							</div>
							<div class="card-body">
								<form action="yonghuupdatedongtaipinglunact.action"
									method="post" enctype="multipart/form-data">
									<input name='id' style='display: none;'
										value="${dongtaipinglun.id}">
									<div class="form-group">
										<label class="col-sm-12 control-label">动态</label>
										<div class="col-sm-12">
											<!-- 定义动态下拉框，并定义其onchange事件 -->

											<select id='dongtai' onchange="dongtaichange(this)"
												name="dongtai" class="form-control">
												<!-- 使用c标签的if表达式判断 dongtaiall是否为空 -->

												<c:if test="${ !empty dongtaiall}">

													<!-- 使用c标签的forEach表达式循环输入 dongtaiall -->

													<c:forEach items="${ dongtaiall}" var="item">



														<option value="${item.biaoti }">${item.biaoti }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义dongtaichange方法 -->  

                                                	function dongtaichange(select){

 <!-- 将id为dongtaiid的项数设置为select的选中项的项数 -->  

                                           $("#dongtaiid").val($("#dongtaiid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 将id为dongtai值设置为request中的dongtaipinglun.dongtai -->  

$("#dongtai").val("${dongtaipinglun.dongtai}")</script>

										</div>
									</div>
									<!-- 设置div的display为none，将其进行隐藏 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">动态id</label>
										<!-- 设置div的display为none，将其进行隐藏 -->

										<div style='display: none;' class="col-sm-12">
											<!-- 定义动态id下拉框，并定义其onchange事件 -->

											<select id='dongtaiid' onchange="dongtaiidchange(this)"
												name="dongtaiid" class="form-control">
												<!-- 使用c标签的if表达式判断 dongtaiall是否为空 -->

												<c:if test="${ !empty dongtaiall}">

													<!-- 使用c标签的forEach表达式循环输入 dongtaiall -->

													<c:forEach items="${ dongtaiall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义dongtaiidchange方法 -->  

                                                	function dongtaiidchange(select){

 <!-- 将id为dongtaiidid的项数设置为select的选中项的项数 -->  

                                           $("#dongtaiidid").val($("#dongtaiidid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 将id为dongtaiid值设置为request中的dongtaipinglun.dongtaiid -->  

$("#dongtaiid").val("${dongtaipinglun.dongtaiid}")</script>

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">内容</label>
										<div class="col-sm-12">
											<!-- 定义内容文本输入框，并将其加载为富文本组件 -->

											<textarea id="neirong" name="neirong" style="height: 200px;"
												class="form-control">${dongtaipinglun.neirong}</textarea>
											<!-- 加载富文本所需css和js -->

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
 <!-- 初始化id为neirong的组件为富文本 -->  

											var editor = new Simditor({
												upload : {},												textarea : $('#neirong'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
										</div>
									</div>
									<!-- 设置div display属性为none，将其隐藏 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">回复人</label>
										<!-- 设置div display属性为none，将其隐藏 -->

										<div style='display: none;' class="col-sm-12">
											<input value="${sessionScope.userinfo.mingzi}"
												name="pinglunrenmingzi" class="form-control">
										</div>
									</div>
									<!-- 设置div display属性为none，将其隐藏 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">回复人id</label>
										<!-- 设置div display属性为none，将其隐藏 -->

										<div style='display: none;' class="col-sm-12">
											<input value="${sessionScope.userinfo.id}"
												name="pinglunrenid" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">回复时间</label>
										<div class="col-sm-12">
											<!-- 定义回复时间输入框 -->

											<input type="text" readonly
												value="${dongtaipinglun.pinglunshijian}"
												name="pinglunshijian" class="form-control">
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

