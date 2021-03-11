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
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface LeibieServiceImp {

	// 定义方法addleibie接口,响应控制层添加类别请求

	public void addleibie(HttpServletRequest request, HttpSession session);

	// 定义addleibieact接口

	public void addleibieact(HttpServletRequest request, HttpSession session, Leibie leibie) throws IOException;

	// 定义leibiemanage方法响应页面请求

	public void leibiemanage(HttpServletRequest request, HttpSession session);

	// 定义 leibieview方法

	public void leibieview(HttpServletRequest request, HttpSession session);

	// 定义 updateleibie方法

	public void updateleibie(HttpServletRequest request, HttpSession session, int id);

	// 定义updateleibieact处理类别修改

	public void updateleibieact(HttpServletRequest request, Leibie leibie, HttpSession session) throws IOException;

	// 定义deleteleibie,处理删除类别

	public void deleteleibie(HttpServletRequest request, HttpSession session, int id);

	// 定义searchleibie方法，处理搜索操作

	public void searchleibie(HttpServletRequest request, HttpSession session, String search);

	// 定义LeibiepinglunMapper

	public void leibiedetails(HttpServletRequest request, HttpSession session, int id);

}
