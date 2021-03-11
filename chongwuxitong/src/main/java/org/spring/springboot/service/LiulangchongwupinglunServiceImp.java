package org.spring.springboot.service;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.HashMap;

import java.util.Map;

import java.util.ArrayList;

import java.util.Calendar;

import java.util.Collections;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.LiulangchongwupinglunMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Liulangchongwupinglun;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface LiulangchongwupinglunServiceImp {

	// 定义方法addliulangchongwupinglun接口,响应控制层添加宠物评论请求

	public void addliulangchongwupinglun(HttpServletRequest request, HttpSession session);

	// 定义yonghuaddliulangchongwupinglun接口，在宠物评论控制层中调用

	public void yonghuaddliulangchongwupinglun(HttpServletRequest request, HttpSession session);

	// 定义yonghuupdateliulangchongwupinglun方法

	public void yonghuupdateliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghuliulangchongwupinglunmanage方法

	public void yonghuliulangchongwupinglunmanage(HttpServletRequest request, HttpSession session);

	// 定义yonghuaddliulangchongwupinglunact接口，响应控制层添加请求

	public void yonghuaddliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			Liulangchongwupinglun liulangchongwupinglun) throws IOException;

	// 定义addliulangchongwupinglunact接口

	public void addliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			Liulangchongwupinglun liulangchongwupinglun) throws IOException;

	// 定义liulangchongwupinglunmanage方法响应页面请求

	public void liulangchongwupinglunmanage(HttpServletRequest request, HttpSession session);

	// 定义 liulangchongwupinglunview方法

	public void liulangchongwupinglunview(HttpServletRequest request, HttpSession session);

	// 定义 updateliulangchongwupinglun方法

	public void updateliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义updateliulangchongwupinglunact处理宠物评论修改

	public void updateliulangchongwupinglunact(HttpServletRequest request, Liulangchongwupinglun liulangchongwupinglun,
			HttpSession session) throws IOException;

	// 定义yonghuupdateliulangchongwupinglunact方法

	public void yonghuupdateliulangchongwupinglunact(HttpServletRequest request,
			Liulangchongwupinglun liulangchongwupinglun, HttpSession session) throws IOException;

	// 定义deleteliulangchongwupinglun,处理删除宠物评论

	public void deleteliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudeleteliulangchongwupinglun方法

	public void yonghudeleteliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义searchliulangchongwupinglun方法，处理搜索操作

	public void searchliulangchongwupinglun(HttpServletRequest request, HttpSession session, String search);

	// 定义LiulangchongwupinglunpinglunMapper

	public void liulangchongwupinglundetails(HttpServletRequest request, HttpSession session, int id);

}
