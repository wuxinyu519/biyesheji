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
import org.spring.springboot.dao.DongtaiMapper;
import org.spring.springboot.dao.DongtaipinglunMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Dongtai;
import org.spring.springboot.domain.DongtaiExample;
import org.spring.springboot.domain.Dongtaipinglun;
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface DongtaipinglunServiceImp {

	// 定义方法adddongtaipinglun接口,响应控制层添加动态回复请求

	public void adddongtaipinglun(HttpServletRequest request, HttpSession session);

	// 定义yonghuadddongtaipinglun接口，在动态回复控制层中调用

	public void yonghuadddongtaipinglun(HttpServletRequest request, HttpSession session);

	// 定义yonghuupdatedongtaipinglun方法

	public void yonghuupdatedongtaipinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudongtaipinglunmanage方法

	public void yonghudongtaipinglunmanage(HttpServletRequest request, HttpSession session);

	// 定义yonghuadddongtaipinglunact接口，响应控制层添加请求

	public void yonghuadddongtaipinglunact(HttpServletRequest request, HttpSession session,
			Dongtaipinglun dongtaipinglun) throws IOException;

	// 定义adddongtaipinglunact接口

	public void adddongtaipinglunact(HttpServletRequest request, HttpSession session, Dongtaipinglun dongtaipinglun)
			throws IOException;

	// 定义dongtaipinglunmanage方法响应页面请求

	public void dongtaipinglunmanage(HttpServletRequest request, HttpSession session);

	// 定义 dongtaipinglunview方法

	public void dongtaipinglunview(HttpServletRequest request, HttpSession session);

	// 定义 updatedongtaipinglun方法

	public void updatedongtaipinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义updatedongtaipinglunact处理动态回复修改

	public void updatedongtaipinglunact(HttpServletRequest request, Dongtaipinglun dongtaipinglun, HttpSession session)
			throws IOException;

	// 定义yonghuupdatedongtaipinglunact方法

	public void yonghuupdatedongtaipinglunact(HttpServletRequest request, Dongtaipinglun dongtaipinglun,
			HttpSession session) throws IOException;

	// 定义deletedongtaipinglun,处理删除动态回复

	public void deletedongtaipinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudeletedongtaipinglun方法

	public void yonghudeletedongtaipinglun(HttpServletRequest request, HttpSession session, int id);

	// 定义searchdongtaipinglun方法，处理搜索操作

	public void searchdongtaipinglun(HttpServletRequest request, HttpSession session, String search);

	// 定义DongtaipinglunpinglunMapper

	public void dongtaipinglundetails(HttpServletRequest request, HttpSession session, int id);

}
