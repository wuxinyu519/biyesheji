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
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface YonghuServiceImp {

	// 定义方法addyonghu接口,响应控制层添加用户请求

	public void addyonghu(HttpServletRequest request, HttpSession session);

	// 定义addyonghuact接口

	public void addyonghuact(HttpServletRequest request, HttpSession session, Yonghu yonghu) throws IOException;

	// 定义yonghumanage方法响应页面请求

	public void yonghumanage(HttpServletRequest request, HttpSession session);

	// 定义 yonghuview方法

	public void yonghuview(HttpServletRequest request, HttpSession session);

	// 定义 updateyonghu方法

	public void updateyonghu(HttpServletRequest request, HttpSession session, int id);

	// 定义updateyonghuact处理用户修改

	public void updateyonghuact(HttpServletRequest request, Yonghu yonghu, HttpSession session) throws IOException;

	// 定义deleteyonghu,处理删除用户

	public void deleteyonghu(HttpServletRequest request, HttpSession session, int id);

	// 定义searchyonghu方法，处理搜索操作

	public void searchyonghu(HttpServletRequest request, HttpSession session, String search);

	// 定义YonghupinglunMapper

	public void yonghudetails(HttpServletRequest request, HttpSession session, int id);

}
