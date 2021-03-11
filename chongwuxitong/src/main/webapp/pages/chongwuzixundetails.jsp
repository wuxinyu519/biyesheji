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
<title>宠物资讯详情</title>
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
				<h1 class="heading text-center">宠物资讯详情</h1>
			</div>
		</section>
		<section class="abt-sec container">
			<div class="row">
				<div class="col-xs-12 col-sm-12" style="margin-bottom: 80px;">
					<header class="header text-center">
						<h2 class="heading text-uppercase">${chongwuzixun.biaoti}</h2>
					</header>

					<!--  使用img展示宠物资讯的封面  -->
					<img src="resource/uploads/${chongwuzixun.fengmian}"
						style="width: 100%; height: 500px; margin-bottom: 15px;">


					<!--  展示宠物资讯的发布时间  -->
					<div>
						<span
							style="display: inline-block; width: 113px; text-align: right; margin-right: 20px;"><b>发布时间：</b></span>${chongwuzixun.fabushijian}</div>


					<!--  展示宠物资讯的内容  -->
					<div>
						<span
							style="display: inline-block; width: 113px; text-align: right; margin-right: 20px;"><b>内容：</b></span>${chongwuzixun.neirong}</div>


				</div>
			</div>

			<div class="container">
				<div id="caozuomoban" style="margin-bottom: 40px;">
					<div></div>
				</div>
				<script>
						$("#caozuomoban a").addClass("btn btn-success");
					</script>
				<div style="margin-bottom: 80px;"></div>
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

