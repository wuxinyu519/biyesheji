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
import org.spring.springboot.dao.XitongshuomingMapper;
import org.spring.springboot.domain.Xitongshuoming;
import org.spring.springboot.domain.XitongshuomingExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface XitongshuomingServiceImp {

	// 定义方法addxitongshuoming接口,响应控制层添加系统说明请求

	public void addxitongshuoming(HttpServletRequest request, HttpSession session);

	// 定义addxitongshuomingact接口

	public void addxitongshuomingact(HttpServletRequest request, HttpSession session, Xitongshuoming xitongshuoming)
			throws IOException;

	// 定义xitongshuomingmanage方法响应页面请求

	public void xitongshuomingmanage(HttpServletRequest request, HttpSession session);

	// 定义 xitongshuomingview方法

	public void xitongshuomingview(HttpServletRequest request, HttpSession session);

	// 定义 updatexitongshuoming方法

	public void updatexitongshuoming(HttpServletRequest request, HttpSession session, int id);

	// 定义updatexitongshuomingact处理系统说明修改

	public void updatexitongshuomingact(HttpServletRequest request, Xitongshuoming xitongshuoming, HttpSession session)
			throws IOException;

	// 定义deletexitongshuoming,处理删除系统说明

	public void deletexitongshuoming(HttpServletRequest request, HttpSession session, int id);

	// 定义searchxitongshuoming方法，处理搜索操作

	public void searchxitongshuoming(HttpServletRequest request, HttpSession session, String search);

	// 定义XitongshuomingpinglunMapper

	public void xitongshuomingdetails(HttpServletRequest request, HttpSession session, int id);

}
