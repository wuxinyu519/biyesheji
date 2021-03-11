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
<title>首页</title>
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
		<section class="main-slider">
			<div class="slide bg-full text-center overlay"
				style="background-image: url(resource/qianduan/images/img01.jpg);">
				<div class="caption">
					<h1>我们把宠物当亲人</h1>
				</div>
			</div>
		</section>
		<section class="abt-sec container">
			<div class="row">
				<div class="col-xs-12 col-sm-7">
					<header class="header text-center">
						<h2 class="heading text-uppercase">欢迎使用本系统</h2>
						<span class="icon"><i class="icon-bone"></i></span>
						<p class="text-center">倾听宠物的好声音，就在本站，相信我们的实力。</p>
					</header>
					<ul class="list-unstyled icon-list text-center">
						<li><span class="icon round"><i class="icon-money"></i></span>
						<h3 class="heading2">救助</h3></li>
						<li><span class="icon round"><i class="icon-atom"></i></span>
						<h3 class="heading2">健康</h3></li>
						<li><span class="icon round"><i class="icon-smile"></i></span>
						<h3 class="heading2">欢乐</h3></li>
					</ul>
				</div>
				<div class="col-xs-12 col-sm-5">
					<div class="img-holder">
						<img src="resource/qianduan/images/img02.jpg" alt="pet-image"
							class="img-responsive">
					</div>
				</div>
			</div>
		</section>





		<section class="testimonail-sec bg-full"
			style="background-image: url(resource/qianduan/images/img22.jpg);">
			<div class="container">
				<div class="row">
					<div class="col-xs-12" style="height: 240px;">
						<div class="testimonail-slider">
							<blockquote class="slide text-center">
								<span class="icon"><i class="icon-comment"></i></span> <q>一个对动物残忍的人，也会变得对人类残忍。</q> <cite class="name">——汤玛斯·艾奎纳</cite>
							</blockquote>
							<blockquote class="slide text-center">
								<span class="icon"><i class="icon-comment"></i></span> <q>我对人权和动物权益一样重视，这也应是全体人类该有的共识。</q> <cite class="name">——林肯</cite>
							</blockquote>
							<blockquote class="slide text-center">
								<span class="icon"><i class="icon-comment"></i></span> <q>如果我们了解狗真正的本性，并且知道如何鼓励它们，我们就能成为更好的主人。
								</q> <cite class="name">——依莉莎白汤玛斯</cite>
							</blockquote>
						</div>
					</div>
				</div>
			</div>
		</section>


		<section class="blog-sec container">
			<div class="row">
				<header class="col-xs-12 header text-center">
					<h1 class="heading text-uppercase">最新流浪宠物</h1>
					<span class="icon"><i class="icon-bone"></i></span>
				</header>
			</div>
			<div class="row">

				<c:if test="${ !empty liulangchongwuzuixin3}">
					<c:forEach items="${ liulangchongwuzuixin3}" var="item">


						<div class="col-sx-12 col-sm-4">
							<div class="blog-col text-center">
								<div class="img-holder overlay">
									<img src="resource/uploads/${item.tupian}" alt="image"
										class="img-responsive" style="width: 359px; height: 262px;">
								</div>
								<h4>
									<a href="liulangchongwudetails.action?id=${item.id}">
										${item.mingzi}</a>
								</h4>
							</div>
						</div>
					</c:forEach>
				</c:if>




			</div>
		</section>
		<section class="blog-sec container">
			<div class="row">
				<header class="col-xs-12 header text-center">
					<h1 class="heading text-uppercase">最新宠物资讯</h1>
					<span class="icon"><i class="icon-bone"></i></span>
				</header>
			</div>
			<div class="row">

				<c:if test="${ !empty chongwuzixunzuixin3}">
					<c:forEach items="${ chongwuzixunzuixin3}" var="item">


						<div class="col-sx-12 col-sm-4">
							<div class="blog-col text-center">
								<div class="img-holder overlay">
									<img src="resource/uploads/${item.fengmian}" alt="image"
										class="img-responsive" style="width: 359px; height: 262px;">
								</div>
								<h4>
									<a href="chongwuzixundetails.action?id=${item.id}">
										${item.biaoti}</a>
								</h4>
							</div>
						</div>
					</c:forEach>
				</c:if>




			</div>
		</section>
		<section class="blog-sec container">
			<div class="row">
				<header class="col-xs-12 header text-center">
					<h1 class="heading text-uppercase">最新动态</h1>
					<span class="icon"><i class="icon-bone"></i></span>
				</header>
			</div>
			<div class="row">

				<c:if test="${ !empty dongtaizuixin3}">
					<c:forEach items="${ dongtaizuixin3}" var="item">


						<div class="col-sx-12 col-sm-4">
							<div class="blog-col text-center">
								<div class="img-holder overlay">
									<img src="resource/uploads/${item.pic}" alt="image"
										class="img-responsive" style="width: 359px; height: 262px;">
								</div>
								<h4>
									<a href="dongtaidetails.action?id=${item.id}">
										${item.biaoti}</a>
								</h4>
							</div>
						</div>
					</c:forEach>
				</c:if>




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

