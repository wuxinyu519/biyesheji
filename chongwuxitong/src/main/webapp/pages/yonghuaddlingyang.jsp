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
<title>添加领养</title>
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
								<h1>添加领养</h1>
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
								<div class="card-title">添加领养</div>
							</div>
							<div class="card-body">
								<form action="yonghuaddlingyangact.action" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-12 control-label">宠物</label>
										<div class="col-sm-12">
											<!--  定义 liulangchongwu-->

											<select id='liulangchongwu'
												onchange="liulangchongwuchange(this)" name="liulangchongwu"
												class="form-control">
												<!-- 使用c标签的if表达式判断liulangchongwuall是否为空 -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 使用c标签的forEach表达式循环liulangchongwuall并将其mingzi字段进行展示 -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

// 定义liulangchongwuchange方法，当liulangchongwu改变时执行 

                                                	function liulangchongwuchange(select){

<!-- 将liulangchongwuid"的值改变为与 liulangchongwu项数相同的值，即liulangchongwu为第一项则liulangchongwuid为第一项-->

                                           $("#liulangchongwuid").val($("#liulangchongwuid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在liulangchongwuid，使用GetQueryString方法获取该值 -->

                                            var liulangchongwuid = GetQueryString("liulangchongwuid"); 

<!-- 如果liulangchongwuid不等于null -->

											if(liulangchongwuid!=null) { 

<!-- 将地址栏中的 liulangchongwuid值赋值给id为liulangchongwuid的项-->

											　　$("#liulangchongwuid").val(liulangchongwuid);

<!-- 获取到id为liulangchongwuid的项-->

												var sel=document.getElementById("liulangchongwuid"); 

<!-- 获取到sel当前的选择项-->

												var liulangchongwuidselectedindex = sel.selectedIndex;

<!-- 将id为liulangchongwu赋值为与liulangchongwuid相同的项数的值，即当前liulangchongwuid项目为第一项时，liulangchongwu项为第一项 -->

											   $("#liulangchongwu").val($("#liulangchongwu option:eq("+liulangchongwuidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">宠物id</label>
										<div style='display: none;' class="col-sm-12">
											<!--  定义 liulangchongwuid-->

											<select id='liulangchongwuid'
												onchange="liulangchongwuidchange(this)"
												name="liulangchongwuid" class="form-control">
												<!-- 使用c标签的if表达式判断liulangchongwuall是否为空 -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 使用c标签的forEach表达式循环liulangchongwuall并将其id字段进行展示 -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

// 定义liulangchongwuidchange方法，当liulangchongwuid改变时执行 

                                                	function liulangchongwuidchange(select){

<!-- 将liulangchongwuidid"的值改变为与 liulangchongwuid项数相同的值，即liulangchongwuid为第一项则liulangchongwuidid为第一项-->

                                           $("#liulangchongwuidid").val($("#liulangchongwuidid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在liulangchongwuidid，使用GetQueryString方法获取该值 -->

                                            var liulangchongwuidid = GetQueryString("liulangchongwuidid"); 

<!-- 如果liulangchongwuidid不等于null -->

											if(liulangchongwuidid!=null) { 

<!-- 将地址栏中的 liulangchongwuidid值赋值给id为liulangchongwuidid的项-->

											　　$("#liulangchongwuidid").val(liulangchongwuidid);

<!-- 获取到id为liulangchongwuidid的项-->

												var sel=document.getElementById("liulangchongwuidid"); 

<!-- 获取到sel当前的选择项-->

												var liulangchongwuididselectedindex = sel.selectedIndex;

<!-- 将id为liulangchongwuid赋值为与liulangchongwuidid相同的项数的值，即当前liulangchongwuidid项目为第一项时，liulangchongwuid项为第一项 -->

											   $("#liulangchongwuid").val($("#liulangchongwuid option:eq("+liulangchongwuididselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">用户</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 使用el表达式给yonghu复制，将session中的yonghu赋值到input中-->

											<input value="${sessionScope.userinfo.mingzi}" name="yonghu"
												class="form-control">
										</div>
									</div>
									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">用户id</label>
										<div style='display: none;' class="col-sm-12">
											<!-- 使用el表达式给yonghuid复制，将session中的yonghuid赋值到input中-->

											<input value="${sessionScope.userinfo.id}" name="yonghuid"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">领养日期</label>
										<div class="col-sm-12">
											<!-- 将id为dangqianshijian的项内容设置为当前时间-->

											<script>
												$(function(){
document.getElementById("dangqianshijian").value = new Date().toLocaleString();
})
												</script>
											<!-- 定义id为dangqianshijian的input输入框，并设置为只读-->

											<input readonly type="text" id="dangqianshijian"
												name="lyriqi" class="form-control">
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

