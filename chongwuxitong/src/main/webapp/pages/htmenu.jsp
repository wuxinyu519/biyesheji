
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

	<c:if test="${sessionScope.identity == '管理员' }">


		<ul id="dc_accordion" class="sidebar-menu tree">

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>个人中心</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="adminindex.action">个人中心</a></li>
				</ul></li>
			
			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>管理员管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addadmin.action">添加管理员</a></li>
					<li><a href="adminmanage.action">管理员管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>用户管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addyonghu.action">添加用户</a></li>
					<li><a href="yonghumanage.action">用户管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>流浪宠物管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addliulangchongwu.action">添加流浪宠物</a></li>
					<li><a href="liulangchongwumanage.action">流浪宠物管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>类别管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addleibie.action">添加类别</a></li>
					<li><a href="leibiemanage.action">类别管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>领养管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addlingyang.action">添加领养</a></li>
					<li><a href="lingyangmanage.action">领养管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>宠物评论管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addliulangchongwupinglun.action">添加宠物评论</a></li>
					<li><a href="liulangchongwupinglunmanage.action">宠物评论管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>宠物资讯管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addchongwuzixun.action">添加宠物资讯</a></li>
					<li><a href="chongwuzixunmanage.action">宠物资讯管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>系统说明管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="addxitongshuoming.action">添加系统说明</a></li>
					<li><a href="xitongshuomingmanage.action">系统说明管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>动态管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="adddongtai.action">添加动态</a></li>
					<li><a href="dongtaimanage.action">动态管理</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>动态回复管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="adddongtaipinglun.action">添加动态回复</a></li>
					<li><a href="dongtaipinglunmanage.action">动态回复管理</a></li>
				</ul></li>



			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>退出系统</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="exitsystem.action">退出系统</a></li>
				</ul></li>

		</ul>


	</c:if>
	<c:if test="${sessionScope.identity == '用户' }">


		<ul id="dc_accordion" class="sidebar-menu tree">


			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>个人中心</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="yonghuindex.action">个人中心</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>领养管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="yonghulingyangmanage.action">我的领养</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>回复管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="yonghuliulangchongwupinglunmanage.action">宠物评论</a></li>
					<li><a href="yonghudongtaipinglunmanage.action">动态回复</a></li>
				</ul></li>

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>动态管理</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="yonghuadddongtai.action">添加动态</a></li>
					<li><a href="yonghudongtaimanage.action">动态管理</a></li>
				</ul></li>
			

			<li class="menu_sub"><a href="#"> <i class="fa fa-home"></i>
					<span>退出系统</span> <span class="arrow"></span>
			</a>
				<ul class="down_menu">
					<li><a href="exitsystem.action">退出系统</a></li>
				</ul></li>

		</ul>


	</c:if>






</body>
</html>


