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
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface DongtaiServiceImp {

	// 定义方法adddongtai接口,响应控制层添加动态请求

	public void adddongtai(HttpServletRequest request, HttpSession session);

	// 定义yonghuadddongtai接口，在动态控制层中调用

	public void yonghuadddongtai(HttpServletRequest request, HttpSession session);

	// 定义yonghuupdatedongtai方法

	public void yonghuupdatedongtai(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudongtaimanage方法

	public void yonghudongtaimanage(HttpServletRequest request, HttpSession session);

	// 定义yonghuadddongtaiact接口，响应控制层添加请求

	public void yonghuadddongtaiact(HttpServletRequest request, HttpSession session, Dongtai dongtai,
			MultipartFile picfile) throws IOException;

	// 定义adddongtaiact接口

	public void adddongtaiact(HttpServletRequest request, HttpSession session, Dongtai dongtai, MultipartFile picfile)
			throws IOException;

	// 定义dongtaimanage方法响应页面请求

	public void dongtaimanage(HttpServletRequest request, HttpSession session);

	// 定义 dongtaiview方法

	public void dongtaiview(HttpServletRequest request, HttpSession session);

	// 定义 updatedongtai方法

	public void updatedongtai(HttpServletRequest request, HttpSession session, int id);

	// 定义updatedongtaiact处理动态修改

	public void updatedongtaiact(HttpServletRequest request, Dongtai dongtai, HttpSession session,
			MultipartFile picfile) throws IOException;

	// 定义yonghuupdatedongtaiact方法

	public void yonghuupdatedongtaiact(HttpServletRequest request, Dongtai dongtai, HttpSession session,
			MultipartFile picfile) throws IOException;

	// 定义deletedongtai,处理删除动态

	public void deletedongtai(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudeletedongtai方法

	public void yonghudeletedongtai(HttpServletRequest request, HttpSession session, int id);

	// 定义searchdongtai方法，处理搜索操作

	public void searchdongtai(HttpServletRequest request, HttpSession session, String search);

	// 定义DongtaipinglunMapper

	public void dongtaidetails(HttpServletRequest request, HttpSession session, int id);

}
