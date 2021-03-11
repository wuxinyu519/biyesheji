 ﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<head>
<!-- set the encoding of your site -->
<meta charset="utf-8">
<!-- set the viewport width and initial-scale on mobile devices -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- set the price table -->
<meta name="Petshop" content="yes">
<!-- set the HandheldFriendly -->
<meta name="HandheldFriendly" content="True">
<!-- set the price table style -->
<meta name="Petshop" content="black">
<!-- set the description -->
<meta name="description" content="Petshop HTML5 Template">
<title>动态详情</title>
<!-- include the site stylesheet -->
<link
	href="https://fonts.googleapis.com/css?family=Dosis:400,500,600%7CNunito:400,600,700"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="resource/qianduan/css/font-awesome.css">
<link rel="stylesheet" type="text/css"
	href="resource/qianduan/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="resource/qianduan/css/icon-fonts.css">
<link rel="stylesheet" type="text/css"
	href="resource/qianduan/css/plugins.css">
<link rel="stylesheet" type="text/css"
	href="resource/qianduan/style.css">
</head>
<body>
	<div id="wrapper">
		<header id="header">
			<div class="header-area container">
				<div class="row" style="font-size: bold;color: black;">
					基于Springboot宠物爱心救助系统
				</div>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<a href="#" class="nav-opener pull-right hidden visible-xs"><i
							class="fa fa-bars"></i></a>
						<nav id="nav">
							<c:import url="qtmenu.jsp"></c:import>
						</nav>
					</div>
				</div>
			</div>
		</header>
		<main id="main">
		<section class="hero-sec bg-full"
			style="background-image: url(resource/qianduan/images/img33.jpg);">
			<div class="caption">
				<h1 class="heading text-center">动态详情</h1>
			</div>
		</section>
		<section class="abt-sec container">
			<div class="row">
				<div class="col-xs-12 col-sm-12" style="margin-bottom: 80px;">
					<header class="header text-center">
						<h2 class="heading text-uppercase">${dongtai.biaoti}</h2>
					</header>

					<!--  使用img展示动态的封面  -->
					<img src="resource/uploads/${dongtai.pic}"
						style="width: 100%; height: 500px; margin-bottom: 15px;">


					<!--  展示动态的发布时间  -->
					<div>
						<span
							style="display: inline-block; width: 113px; text-align: right; margin-right: 20px;"><b>发布时间：</b></span>${dongtai.fabushijian}</div>


					<!--  展示动态的内容  -->
					<div>
						<span
							style="display: inline-block; width: 113px; text-align: right; margin-right: 20px;"><b>内容：</b></span>${dongtai.neirong}</div>


					<!--  展示动态的用户  -->
					<div>
						<span
							style="display: inline-block; width: 113px; text-align: right; margin-right: 20px;"><b>用户：</b></span>${dongtai.yonghu}</div>


				</div>
			</div>

			<div class="container">
				<div id="caozuomoban" style="margin-bottom: 40px;">
					<div></div>
				</div>
				<script>
						$("#caozuomoban a").addClass("btn btn-success");
					</script>
				<div style="margin-bottom: 80px;">
					<div>
						<div style="margin-bottom: 40px;">

							<span style="border-left: 3px red solid;; padding: 5px;">评论内容</span>
						</div>
						<!-- 判断{表名备注}评论内容是否为空  -->
						<c:if test="${ !empty dongtaipinglunall}">
							<!-- 循环展示{表名备注}评论内容  -->
							<c:forEach items="${ dongtaipinglunall}" var="item">

								<div class="form-group">
									<label>${item.pinglunrenmingzi } </label> <br /> <span
										style="color: #999; display: inline-block; margin-top: 5px;">${item.pinglunshijian }</span>
									<div
										style="margin-top: 20px; border-bottom: 1px solid #eee; padding-bottom: 40px;">${item.neirong }</div>
								</div>
							</c:forEach>
						</c:if>
					</div>
					<!-- 判断当前身份是否为空  -->
					<c:if
						test="${sessionScope.identity != '' && sessionScope.identity != null}">
						<!-- 定义评论表单  -->
						<form action="adddongtaipinglunact.action" method="post"
							enctype="multipart/form-data">
							<div class="form-group">
								<label>评论内容</label>
								<!-- 定义评论框文本输入框  -->
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
											var editor = new Simditor({
												textarea : $('#neirong'),
toolbar : ['title', 'bold', 'italic', 'underline', 'strikethrough', 'fontScale', 'color', '|', 'ol', 'ul', 'blockquote', 'code', 'table', '|', 'link', 'image', 'hr', '|', 'indent', 'outdent', 'alignment'],											//optional options
											});
										</script>
							</div>
							<div class="form-group">
								<label>评论时间</label>
								<!-- 初始化评论时间  -->
								<script>
												$(function(){
document.getElementById("dangqianshijian").value = new Date().toLocaleString();
})
												</script>
								<input readonly type="text" id="dangqianshijian"
									name="pinglunshijian" required class="form-control"> <input
									type="hidden" value="${dongtai.biaoti }" name="dongtai"
									class="form-control"> <input type="hidden"
									value="${dongtai.id }" name="dongtaiid" class="form-control">
								<input type="hidden" value="${sessionScope.mingzi }"
									name="pinglunrenmingzi" class="form-control"> <input
									type="hidden" value="${sessionScope.id }" name="pinglunrenid"
									class="form-control"> <input type="hidden"
									value="dongtaidetails.action?id=${dongtai.id }" name="backurl"
									class="form-control">
							</div>
							<div class="form-group text-right m-b-0">
								<button class="btn btn-primary waves-effect waves-light"
									type="submit">评论</button>
							</div>
						</form>
					</c:if>
					<!-- 如果未登录，提示登录后评论  -->
					<c:if
						test="${sessionScope.identity == '' || sessionScope.identity == null}">请<a
							href="login.action">登录</a>后评论</c:if>
				</div>
			</div>

		</section>

				<section class="callout"
			style="background-image: url(resource/qianduan/images/img26.jpg);">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6">
						<h2>联系热线</h2>
					</div>
					<div class="col-xs-12 col-sm-6">
						<a class="btn-primary text-uppercase text-center lg-round"
							href="#"> 13265xxxxxx</a>
					</div>
				</div>
			</div>
		</section>
		</main>
		<footer id="footer">
			<div class="container">
				<div class="row" style="text-align: center; margin-bottom: 40px;">
					宠物爱心救助系统</div>
			</div>
		</footer>
	</div>
	<script src="resource/qianduan/js/jquery.js"></script>
	<script src="resource/qianduan/js/plugins.js"></script>
	<script src="resource/qianduan/js/jquery.main.js"></script>
	<script>
		if("${message}"){
			alert("${message}");
		}
	</script>
</body>
</html>

