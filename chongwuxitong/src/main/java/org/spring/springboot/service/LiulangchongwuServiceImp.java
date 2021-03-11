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
import org.spring.springboot.dao.LeibieMapper;
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.LiulangchongwupinglunMapper;
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface LiulangchongwuServiceImp {

	// 定义方法addliulangchongwu接口,响应控制层添加流浪宠物请求

	public void addliulangchongwu(HttpServletRequest request, HttpSession session);

	// 定义addliulangchongwuact接口

	public void addliulangchongwuact(HttpServletRequest request, HttpSession session, Liulangchongwu liulangchongwu,
			MultipartFile tupianfile) throws IOException;

	// 定义liulangchongwumanage方法响应页面请求

	public void liulangchongwumanage(HttpServletRequest request, HttpSession session);

	// 定义 liulangchongwuview方法

	public void liulangchongwuview(HttpServletRequest request, HttpSession session);

	// 定义 updateliulangchongwu方法

	public void updateliulangchongwu(HttpServletRequest request, HttpSession session, int id);

	// 定义updateliulangchongwuact处理流浪宠物修改

	public void updateliulangchongwuact(HttpServletRequest request, Liulangchongwu liulangchongwu, HttpSession session,
			MultipartFile tupianfile) throws IOException;

	// 定义deleteliulangchongwu,处理删除流浪宠物

	public void deleteliulangchongwu(HttpServletRequest request, HttpSession session, int id);

	// 定义searchliulangchongwu方法，处理搜索操作

	public void searchliulangchongwu(HttpServletRequest request, HttpSession session, String search);

	// 定义LiulangchongwupinglunMapper

	public void liulangchongwudetails(HttpServletRequest request, HttpSession session, int id);

}
