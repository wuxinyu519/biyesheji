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
<meta name="description" content="Petshop">
<title>搜索系统说明</title>
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
				<h1 class="heading text-center">搜索系统说明</h1>
			</div>
		</section>

		<section class="shop-sec style1 container">
			<div class="row" style="margin-top: 80px;">
				<div class="col-md-12">
					<div class="job-search-bar">
						<div class="search-bar text-center">
							<form action="searchxitongshuoming.action" class="" method="post">
								<div class="form-row">
									<div class="col-md-6">
										<input type="search" name="search" style="background: none;"
											class="form-control" placeholder="输入关键字" />
									</div>
									<div class="col-md-1">
										<button type="submit" class="btn btn-success">搜索</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>


		<section class="shop-sec style1 container">
			<div class="row">
				<div class="col-xs-12">
					<article id="content" style="width: 100%;">
						<div class="product-block" id="allitems">


							<c:if test="${ !empty xitongshuomingall}">
								<c:forEach items="${ xitongshuomingall}" var="item">

									<div class="product-col oneitem">
										<div class="descrip">
											<h3 class="heading2">${item.biaoti}</h3>
										</div>
										<div class="text-center">
											<a href="xitongshuomingdetails.action?id=${item.id}"
												class="btn-primary lg-round text-uppercase"><i
												class="icon-cart"></i>查看详情</a>
										</div>
									</div>


								</c:forEach>
							</c:if>

						</div>
						<div
							style="text-align: center; margin-bottom: 180px; color: black;"
							id="barcon"></div>
					</article>
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
	<style>
#barcon {
	font-family: 'Lato', sans-serif;
}

#barcon a {
	display: block;
	background: #fff;
	padding: 8px 1.1em;
	font-size: 0.9em;
	text-transform: uppercase;
	color: #222;
	font-weight: 400;
	display: inline-block;
	margin-top: 1em;
	text-decoration: none;
	border: none;
}

#barcon a:hover {
	background: #29292A;
	color: #fff;
}
</style>

	<script>

	function goPage(pno,psize){
		var itable = document.getElementById("allitems");
		console.log(itable);
		var num = $("#allitems .oneitem").length;//表格所有行数(所有记录数)
		console.log(num);
		var totalPage = 0;//总页数
		var pageSize = psize;//每页显示行数
		//总共分几页
		if(num/pageSize > parseInt(num/pageSize)){
			totalPage=parseInt(num/pageSize)+1;
		}else{
			totalPage=parseInt(num/pageSize);
		}
		var currentPage = pno;//当前页数
		var startRow = (currentPage - 1) * pageSize+1;//开始显示的行 31
		var endRow = currentPage * pageSize;//结束显示的行  40
		endRow = (endRow > num)? num : endRow;  //40
		console.log(endRow);
		//遍历显示数据实现分页
		for(var i=1;i<(num+1);i++){
			if(i>=startRow && i<=endRow){
				console.log($("#allitems .oneitem")[i-1]);
				$("#allitems .oneitem")[i-1].style.display = "block";
			}else{
				$("#allitems .oneitem")[i-1].style.display = "none";
			}
		}
		var tempStr = "共 "+num+" 条记录 分 "+totalPage+" 页 当前第 <span style=\"color:red;font-weight:bold;\">"+currentPage+"</span> 页<br/>";
		if(currentPage>1){
			tempStr += "<a href=\"#\" onClick=\"goPage("+(1)+","+psize+")\">首页</a>";
			tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage-1)+","+psize+")\"><上一页</a>"
		}else{
			tempStr += "<a href='#'>首页</a>";
			tempStr += "<a href='#'><上一页</a>";
		}
		if(currentPage<totalPage){
			tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage+1)+","+psize+")\">下一页></a>";
			tempStr += "<a href=\"#\" onClick=\"goPage("+(totalPage)+","+psize+")\">尾页</a>";
		}else{
			tempStr += "<a href='#'>下一页></a>";
			tempStr += "<a href='#'>尾页</a>";
		}
		document.getElementById("barcon").innerHTML = tempStr;
	}


	goPage(1,12);

</script>
	<script>
		if("${message}"){
			alert("${message}");
		}
	</script>
</body>
</html>

