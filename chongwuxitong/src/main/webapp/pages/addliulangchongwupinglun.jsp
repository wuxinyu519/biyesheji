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
<title>添加宠物评论</title>
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
								<h1>添加宠物评论</h1>
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
								<div class="card-title">添加宠物评论</div>
							</div>
							<div class="card-body">
								<form action="addliulangchongwupinglunact.action" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-12 control-label">宠物</label>
										<div class="col-sm-12">
											<!-- 定义liulangchongwu下拉框 并定义其onchange方法liulangchongwuchange(this)" -->

											<select id='liulangchongwu'
												onchange="liulangchongwuchange(this)" name="liulangchongwu"
												class="form-control">
												<!-- 用c标签的if表达式判断liulangchongwuall是否为空  -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 用c标签的forEach循环展示 request中的liulangchongwuall  -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义liulangchongwuchange方法  -->  

                                                	function liulangchongwuchange(select){

 <!-- 将liulangchongwuid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#liulangchongwuid").val($("#liulangchongwuid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在liulangchongwuid时获取地址栏中的liulangchongwuid值  -->  

                                            var liulangchongwuid = GetQueryString("liulangchongwuid"); 

 <!-- 判断liulangchongwuid是否为null  -->  

											if(liulangchongwuid!=null) { 

 <!-- 将id为liulangchongwuid的值设置为参数栏中liulangchongwuid的值  -->  

											　　$("#liulangchongwuid").val(liulangchongwuid);

 <!-- 获取id为liulangchongwuid的select保存为sel变量  -->  

												var sel=document.getElementById("liulangchongwuid"); 

 <!-- 获取sel的当前的选中值  -->  

												var liulangchongwuidselectedindex = sel.selectedIndex;

 <!-- 将liulangchongwu的选中项数设置为sel.selectedIndex的值  -->  

											   $("#liulangchongwu").val($("#liulangchongwu option:eq("+liulangchongwuidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">宠物id</label>
										<!-- 设置display为none,设置为不可见 -->

										<div style='display: none;' class="col-sm-12">
											<!-- 定义liulangchongwuid下拉框 并定义其onchange方法liulangchongwuidchange(this)" -->

											<select id='liulangchongwuid'
												onchange="liulangchongwuidchange(this)"
												name="liulangchongwuid" class="form-control">
												<!-- 用c标签的if表达式判断liulangchongwuall是否为空  -->

												<c:if test="${ !empty liulangchongwuall}">

													<!-- 用c标签的forEach循环展示 request中的liulangchongwuall  -->

													<c:forEach items="${ liulangchongwuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义liulangchongwuidchange方法  -->  

                                                	function liulangchongwuidchange(select){

 <!-- 将liulangchongwuidid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#liulangchongwuidid").val($("#liulangchongwuidid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在liulangchongwuidid时获取地址栏中的liulangchongwuidid值  -->  

                                            var liulangchongwuidid = GetQueryString("liulangchongwuidid"); 

 <!-- 判断liulangchongwuidid是否为null  -->  

											if(liulangchongwuidid!=null) { 

 <!-- 将id为liulangchongwuidid的值设置为参数栏中liulangchongwuidid的值  -->  

											　　$("#liulangchongwuidid").val(liulangchongwuidid);

 <!-- 获取id为liulangchongwuidid的select保存为sel变量  -->  

												var sel=document.getElementById("liulangchongwuidid"); 

 <!-- 获取sel的当前的选中值  -->  

												var liulangchongwuididselectedindex = sel.selectedIndex;

 <!-- 将liulangchongwuid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#liulangchongwuid").val($("#liulangchongwuid option:eq("+liulangchongwuididselectedindex+")").val());

											}                                                         </script>
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
										<label class="col-sm-12 control-label">评论人名字</label>
										<div class="col-sm-12">
											<!-- 定义pinglunrenmingzi下拉框 并定义其onchange方法pinglunrenmingzichange(this)" -->

											<select id='pinglunrenmingzi'
												onchange="pinglunrenmingzichange(this)"
												name="pinglunrenmingzi" class="form-control">
												<!-- 用c标签的if表达式判断yonghuall是否为空  -->

												<c:if test="${ !empty yonghuall}">

													<!-- 用c标签的forEach循环展示 request中的yonghuall  -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.mingzi }">${item.mingzi }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义pinglunrenmingzichange方法  -->  

                                                	function pinglunrenmingzichange(select){

 <!-- 将pinglunrenmingziid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#pinglunrenmingziid").val($("#pinglunrenmingziid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在pinglunrenmingziid时获取地址栏中的pinglunrenmingziid值  -->  

                                            var pinglunrenmingziid = GetQueryString("pinglunrenmingziid"); 

 <!-- 判断pinglunrenmingziid是否为null  -->  

											if(pinglunrenmingziid!=null) { 

 <!-- 将id为pinglunrenmingziid的值设置为参数栏中pinglunrenmingziid的值  -->  

											　　$("#pinglunrenmingziid").val(pinglunrenmingziid);

 <!-- 获取id为pinglunrenmingziid的select保存为sel变量  -->  

												var sel=document.getElementById("pinglunrenmingziid"); 

 <!-- 获取sel的当前的选中值  -->  

												var pinglunrenmingziidselectedindex = sel.selectedIndex;

 <!-- 将pinglunrenmingzi的选中项数设置为sel.selectedIndex的值  -->  

											   $("#pinglunrenmingzi").val($("#pinglunrenmingzi option:eq("+pinglunrenmingziidselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label class="col-sm-12 control-label">评论人id</label>
										<!-- 设置display为none,设置为不可见 -->

										<div style='display: none;' class="col-sm-12">
											<!-- 定义pinglunrenid下拉框 并定义其onchange方法pinglunrenidchange(this)" -->

											<select id='pinglunrenid' onchange="pinglunrenidchange(this)"
												name="pinglunrenid" class="form-control">
												<!-- 用c标签的if表达式判断yonghuall是否为空  -->

												<c:if test="${ !empty yonghuall}">

													<!-- 用c标签的forEach循环展示 request中的yonghuall  -->

													<c:forEach items="${ yonghuall}" var="item">



														<option value="${item.id }">${item.id }</option>

													</c:forEach>

												</c:if>



											</select>

											<script>

 <!-- 定义pinglunrenidchange方法  -->  

                                                	function pinglunrenidchange(select){

 <!-- 将pinglunrenidid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#pinglunrenidid").val($("#pinglunrenidid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在pinglunrenidid时获取地址栏中的pinglunrenidid值  -->  

                                            var pinglunrenidid = GetQueryString("pinglunrenidid"); 

 <!-- 判断pinglunrenidid是否为null  -->  

											if(pinglunrenidid!=null) { 

 <!-- 将id为pinglunrenidid的值设置为参数栏中pinglunrenidid的值  -->  

											　　$("#pinglunrenidid").val(pinglunrenidid);

 <!-- 获取id为pinglunrenidid的select保存为sel变量  -->  

												var sel=document.getElementById("pinglunrenidid"); 

 <!-- 获取sel的当前的选中值  -->  

												var pinglunrenididselectedindex = sel.selectedIndex;

 <!-- 将pinglunrenid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#pinglunrenid").val($("#pinglunrenid option:eq("+pinglunrenididselectedindex+")").val());

											}                                                         </script>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-12 control-label">评论时间</label>
										<div class="col-sm-12">
											<!-- 定义 评论时间输入框 -->

											<input name="pinglunshijian" class="form-control">
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

