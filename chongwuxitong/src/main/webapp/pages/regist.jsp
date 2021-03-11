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
<title>注册</title>
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

<body class="bg_darck">
	<div class="sufee-login d-flex align-content-center flex-wrap">
		<div class="container">
			<div class="login-content">
				<div class="logo">
					<a href="#" style="color: white;font-size: 20px;font-weight: bold;">流浪宠物救助
					</a>
				</div>
				<div class="login-form">
					<form action="registact.action" method="post">
						<div class="form-group">
							<label>用户名</label> <input class="form-control" name="username"
								placeholder="请输入用户名" required>
						</div>
						<div class="form-group">
							<label>密码</label> <input class="form-control" type="password"
								name="password" placeholder="请输入密码" required>
						</div>
						<div class="form-group">
							<label>确认密码</label><input class="form-control" type="password"
								name="repassword" placeholder="请确认密码名" required>
						</div>
						<div class="form-group">
							<label>身份</label> <select name="identity" class="form-control">
								<option>用户</option>
							</select>
						</div>
						<button type="submit"
							class="btn btn-success btn-flat m-b-30 m-t-30">注册</button>
						<div class="register-link m-t-15 text-center"
							style="margin-top: 30px;">
							<p>
								已有账号，点击<a href="login.action">登录</a>
							</p>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="resource/houtai/assets/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/popper.min.js"></script>
	<script type="text/javascript"
		src="resource/houtai/assets/js/bootstrap.min.js"></script>
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

