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
<title>修改流浪宠物</title>
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
								<h1>修改流浪宠物</h1>
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
								<div class="card-title">修改流浪宠物</div>
							</div>
							<div class="card-body">
								<form action="updateliulangchongwuact.action" method="post"
									enctype="multipart/form-data">
									<input name='id' style='display: none;'
										value="${liulangchongwu.id}">
									<div class="form-group">
										<label class="col-sm-12 control-label">名字</label>
										<div class="col-sm-12">
											<!-- 定义名字input输入框，并从request中取值liulangchongwu.mingzi赋值  -->

											<input name="mingzi" value="${liulangchongwu.mingzi}"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">图片</label>
										<div class="col-sm-12">
											<!-- 定义图片文件选择框  -->

											<input type="file" name="tupianfile"
												value="${liulangchongwu.tupian}" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">介绍</label>
										<div class="col-sm-12">
											<!-- 定义介绍文本输入框  -->

											<textarea id="jieshao" name="jieshao" style="height: 200px;"
												class="form-control">${liulangchongwu.jieshao}</textarea>
											<!-- 加载富文本组件所需css和js  -->

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
 <!-- 将id为jieshao的textarea设置为富文本  -->  

											var editor = new Simditor({
												upload : {},												textarea : $('#jieshao'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">注意事项</label>
										<div class="col-sm-12">
											<textarea name="zhuyi" style="height: 200px;"
												class="form-control">${liulangchongwu.zhuyi}</textarea>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">类别</label>
										<div class="col-sm-12">
											<!-- 定义类别下拉框 -->

											<select id='leibie' onchange="leibiechange(this)"
												name="leibie" class="form-control">
												<!-- 使用c标签的if表达式判断leibieall是否为空 -->

												<c:if test="${ !empty leibieall}">

													<!-- 使用c标签的forEach表达式循环输出leibieall -->

													<c:forEach items="${ leibieall}" var="item">



														<option value="${item.mingcheng }">${item.mingcheng }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义leibiechange方法 -->  

                                                	function leibiechange(select){

 <!-- 获取传入的select的选中项的项数， 将id为leibieid的选中项改变为与其一致  -->  

                                           $("#leibieid").val($("#leibieid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为leibie的值为request中的liulangchongwu.leibie  -->  

$("#leibie").val("${liulangchongwu.leibie}")</script>

										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">类别id</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 定义类别id下拉框 -->

											<select id='leibieid' onchange="leibieidchange(this)"
												name="leibieid" class="form-control">
												<!-- 使用c标签的if表达式判断leibieall是否为空 -->

												<c:if test="${ !empty leibieall}">

													<!-- 使用c标签的forEach表达式循环输出leibieall -->

													<c:forEach items="${ leibieall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义leibieidchange方法 -->  

                                                	function leibieidchange(select){

 <!-- 获取传入的select的选中项的项数， 将id为leibieidid的选中项改变为与其一致  -->  

                                           $("#leibieidid").val($("#leibieidid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
											<script>
 <!-- 设置id为leibieid的值为request中的liulangchongwu.leibieid  -->  

$("#leibieid").val("${liulangchongwu.leibieid}")</script>

										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">状态</label>
										<div class="col-sm-12">
											<!-- 定义状态下拉框 -->

											<select id='state' onchange="statechange(this)" name="state"
												class="form-control"><option>未领养</option>
												<option>已领养</option></select>
											<script>
 <!-- 将id为state的组件赋值为request中的liulangchongwu.state字段 -->  

$("#state").val("${liulangchongwu.state}")</script>

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

