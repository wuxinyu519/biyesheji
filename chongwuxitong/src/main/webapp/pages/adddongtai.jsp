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
<title>添加动态</title>
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
								<h1>添加动态</h1>
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
								<div class="card-title">添加动态</div>
							</div>
							<div class="card-body">
								<form action="adddongtaiact.action" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-12 control-label">标题</label>
										<div class="col-sm-12">
											<!-- 定义 标题输入框 -->

											<input name="biaoti" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">发布时间</label>
										<div class="col-sm-12">
											<!-- 定义js方法将id为dangqianshijian的项设置为当前时间  -->

											<script>
												$(function(){
document.getElementById("dangqianshijian").value = new Date().toLocaleString();
})
												</script>
											<!-- 定义当前时间input输入框，并设置为只读  -->

											<input readonly type="text" id="dangqianshijian"
												name="fabushijian" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">内容</label>
										<div class="col-sm-12">
											<!-- 定义内容本文输入框 ，并将其改变为福本文编辑器 -->

											<textarea id="neirong" name="neirong" style="height: 200px;"
												class="form-control"></textarea>
											<!-- 导入富文本组件  -->

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
 <!-- 将textarea设置为富文本  -->  

											var editor = new Simditor({
												upload : {},												textarea : $('#neirong'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">用户</label>
										<div class="col-sm-12">
											<!-- 定义yonghu下拉框 并定义其onchange方法yonghuchange(this)" -->

											<select id='yonghu' onchange="yonghuchange(this)"
												name="yonghu" class="form-control">
												<!-- 用c标签的if表达式判断yonghuall是否为空  -->

												<c:if test="${ !empty yonghuall}">

													<!-- 用c标签的forEach循环展示 request中的yonghuall  -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义yonghuchange方法  -->  

                                                	function yonghuchange(select){

 <!-- 将yonghuid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#yonghuid").val($("#yonghuid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在yonghuid时获取地址栏中的yonghuid值  -->  

                                            var yonghuid = GetQueryString("yonghuid"); 

 <!-- 判断yonghuid是否为null  -->  

											if(yonghuid!=null) { 

 <!-- 将id为yonghuid的值设置为参数栏中yonghuid的值  -->  

											　　$("#yonghuid").val(yonghuid);

 <!-- 获取id为yonghuid的select保存为sel变量  -->  

												var sel=document.getElementById("yonghuid"); 

 <!-- 获取sel的当前的选中值  -->  

												var yonghuidselectedindex = sel.selectedIndex;

 <!-- 将yonghu的选中项数设置为sel.selectedIndex的值  -->  

											   $("#yonghu").val($("#yonghu option:eq("+yonghuidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">用户id</label>
										<!-- 设置display为none,设置为不可见 -->

										<div style='display: none;' class="col-sm-12">
											<!-- 定义yonghuid下拉框 并定义其onchange方法yonghuidchange(this)" -->

											<select id='yonghuid' onchange="yonghuidchange(this)"
												name="yonghuid" class="form-control">
												<!-- 用c标签的if表达式判断yonghuall是否为空  -->

												<c:if test="${ !empty yonghuall}">

													<!-- 用c标签的forEach循环展示 request中的yonghuall  -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义yonghuidchange方法  -->  

                                                	function yonghuidchange(select){

 <!-- 将yonghuidid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#yonghuidid").val($("#yonghuidid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在yonghuidid时获取地址栏中的yonghuidid值  -->  

                                            var yonghuidid = GetQueryString("yonghuidid"); 

 <!-- 判断yonghuidid是否为null  -->  

											if(yonghuidid!=null) { 

 <!-- 将id为yonghuidid的值设置为参数栏中yonghuidid的值  -->  

											　　$("#yonghuidid").val(yonghuidid);

 <!-- 获取id为yonghuidid的select保存为sel变量  -->  

												var sel=document.getElementById("yonghuidid"); 

 <!-- 获取sel的当前的选中值  -->  

												var yonghuididselectedindex = sel.selectedIndex;

 <!-- 将yonghuid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#yonghuid").val($("#yonghuid option:eq("+yonghuididselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">封面</label>
										<div class="col-sm-12">
											<!-- 定义封面文件选择框  -->

											<input type="file" name="picfile" class="form-control">
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

