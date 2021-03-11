<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul class="list-unstyled text-uppercase menu-left">
		<li><a href="index.action">首页</a></li>
		<li><a href="searchchongwuzixun.action">宠物资讯</a></li>
		<li><a href="searchdongtai.action">动态</a></li>
		<li><a href="searchliulangchongwu.action">流浪宠物</a></li>
		<li><a href="searchxitongshuoming.action">系统说明</a></li>

		<c:if test="${sessionScope.identity == '管理员' }">
			<li><a href="adminindex.action">个人中心</a></li>
		</c:if>
		<c:if test="${sessionScope.identity == '用户' }">
			<li><a href="yonghuindex.action">个人中心</a></li>
		</c:if>
		<c:if
			test="${sessionScope.identity == '' ||  sessionScope.identity == null}">
			<li><a href="login.action">登录</a></li>
			<li><a href="regist.action">注册</a></li>
		</c:if>
	</ul>


</body>
</html>