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
<title>添加流浪宠物</title>
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
								<h1>添加流浪宠物</h1>
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
								<div class="card-title">添加流浪宠物</div>
							</div>
							<div class="card-body">
								<form action="addliulangchongwuact.action" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-12 control-label">名字</label>
										<div class="col-sm-12">
											<!-- 定义 名字输入框 -->

											<input name="mingzi" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">图片</label>
										<div class="col-sm-12">
											<!-- 定义图片文件选择框  -->

											<input type="file" name="tupianfile" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">介绍</label>
										<div class="col-sm-12">
											<!-- 定义介绍本文输入框 ，并将其改变为福本文编辑器 -->

											<textarea id="jieshao" name="jieshao" style="height: 200px;"
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
												upload : {},												textarea : $('#jieshao'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">注意事项</label>
										<div class="col-sm-12">
											<!-- 定义注意事项本文输入框  -->

											<textarea name="zhuyi" style="height: 200px;"
												class="form-control"></textarea>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">类别</label>
										<div class="col-sm-12">
											<!-- 定义leibie下拉框 并定义其onchange方法leibiechange(this)" -->

											<select id='leibie' onchange="leibiechange(this)"
												name="leibie" class="form-control">
												<!-- 用c标签的if表达式判断leibieall是否为空  -->

												<c:if test="${ !empty leibieall}">

													<!-- 用c标签的forEach循环展示 request中的leibieall  -->

													<c:forEach items="${ leibieall}" var="item">



														<option value="${item.mingcheng }">${item.mingcheng }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义leibiechange方法  -->  

                                                	function leibiechange(select){

 <!-- 将leibieid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#leibieid").val($("#leibieid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在leibieid时获取地址栏中的leibieid值  -->  

                                            var leibieid = GetQueryString("leibieid"); 

 <!-- 判断leibieid是否为null  -->  

											if(leibieid!=null) { 

 <!-- 将id为leibieid的值设置为参数栏中leibieid的值  -->  

											　　$("#leibieid").val(leibieid);

 <!-- 获取id为leibieid的select保存为sel变量  -->  

												var sel=document.getElementById("leibieid"); 

 <!-- 获取sel的当前的选中值  -->  

												var leibieidselectedindex = sel.selectedIndex;

 <!-- 将leibie的选中项数设置为sel.selectedIndex的值  -->  

											   $("#leibie").val($("#leibie option:eq("+leibieidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">类别id</label>
										<!-- 设置display为none,设置为不可见 -->

										<div style='display: none;' class="col-sm-12">
											<!-- 定义leibieid下拉框 并定义其onchange方法leibieidchange(this)" -->

											<select id='leibieid' onchange="leibieidchange(this)"
												name="leibieid" class="form-control">
												<!-- 用c标签的if表达式判断leibieall是否为空  -->

												<c:if test="${ !empty leibieall}">

													<!-- 用c标签的forEach循环展示 request中的leibieall  -->

													<c:forEach items="${ leibieall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义leibieidchange方法  -->  

                                                	function leibieidchange(select){

 <!-- 将leibieidid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#leibieidid").val($("#leibieidid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在leibieidid时获取地址栏中的leibieidid值  -->  

                                            var leibieidid = GetQueryString("leibieidid"); 

 <!-- 判断leibieidid是否为null  -->  

											if(leibieidid!=null) { 

 <!-- 将id为leibieidid的值设置为参数栏中leibieidid的值  -->  

											　　$("#leibieidid").val(leibieidid);

 <!-- 获取id为leibieidid的select保存为sel变量  -->  

												var sel=document.getElementById("leibieidid"); 

 <!-- 获取sel的当前的选中值  -->  

												var leibieididselectedindex = sel.selectedIndex;

 <!-- 将leibieid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#leibieid").val($("#leibieid option:eq("+leibieididselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">状态</label>
										<div class="col-sm-12">
											<!-- 定义state下拉框 并定义其onchange方法statechange(this)" -->

											<select id='state' onchange="statechange(this)" name="state"
												class="form-control"><option>未领养</option>
												<option>已领养</option></select>
											<!-- 为下拉框添加自定义数据 -->


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

