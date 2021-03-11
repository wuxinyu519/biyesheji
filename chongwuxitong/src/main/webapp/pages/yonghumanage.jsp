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
<title>用户管理</title>
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

<!--bs4 data table-->
<link href="resource/houtai/assets/css/dataTables.bootstrap4.min.css"
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
								<h1>用户管理</h1>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--page title end-->
			<div class="container-fluid">
				<!-- state start-->
				<div class="row">
					<div class=" col-sm-12">
						<div class="card card-shadow mb-4">
							<div class="card-header">
								<div class="card-title">用户管理</div>
							</div>
							<div class="card-body">
								<table id="bs4-table" class="table table-bordered table-striped"
									cellspacing="0" width="100%">
									<thead>
										<th>名字</th>
										<th>账号</th>
										<th>密码</th>
										<th>性别</th>
										<th>介绍</th>
										<th>操作</th>
									</thead>


									<tbody>





										<c:if test="${ !empty yonghuall}">

											<c:forEach items="${ yonghuall}" var="item">



												<tr>
													<td>${item.mingzi }</td>
													<td>${item.username }</td>
													<td>${item.password }</td>
													<td>${item.xingbie }</td>
													<td>${item.jieshao }</td>
													<td>
														<!--  定义修改用户按钮和删除用户按钮，修改提交地址为updateyonghu.action?id=${item.id}，删除提交地址为 deleteyonghu.action?id=${item.id}-->

														<a href="updateyonghu.action?id=${item.id}">修改</a> <a
														href="deleteyonghu.action?id=${item.id}">删除</a>

													</td>
												</tr>

											</c:forEach>

										</c:if>

									</tbody>
								</table>
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
	<!--datatables-->
	<script src="resource/houtai/assets/js/jquery.dataTables.min.js"></script>
	<script src="resource/houtai/assets/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="resource/houtai/assets/js/custom.js"
		type="text/javascript"></script>
	<script>
			$(document).ready(function() {

				$('#bs4-table').dataTable({
                    "language": {
                        "lengthMenu": "每页显示 _MENU_记录",
                        "zeroRecords": "没有匹配的数据",
                        "info": "第_PAGE_页/共 _PAGES_页 ( 共\_TOTAL\_条记录 )",
                        "infoEmpty": "没有符合条件的记录",
                        "search": "查找",
                        "infoFiltered": "(从 _MAX_条记录中过滤)",
                        "paginate": { "first": "首页 ", "last": "末页", "next": "下一页", "previous": "上一页" }
                    }
                });

			});
		</script>
	<script>
			if("${message}"){
				alert("${message}");
			}
		</script>
</body>

</html>

