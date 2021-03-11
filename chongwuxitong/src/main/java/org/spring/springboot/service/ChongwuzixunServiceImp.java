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
import org.spring.springboot.dao.ChongwuzixunMapper;
import org.spring.springboot.domain.Chongwuzixun;
import org.spring.springboot.domain.ChongwuzixunExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface ChongwuzixunServiceImp {

	// 定义方法addchongwuzixun接口,响应控制层添加宠物资讯请求

	public void addchongwuzixun(HttpServletRequest request, HttpSession session);

	// 定义addchongwuzixunact接口

	public void addchongwuzixunact(HttpServletRequest request, HttpSession session, Chongwuzixun chongwuzixun,
			MultipartFile fengmianfile) throws IOException;

	// 定义chongwuzixunmanage方法响应页面请求

	public void chongwuzixunmanage(HttpServletRequest request, HttpSession session);

	// 定义 chongwuzixunview方法

	public void chongwuzixunview(HttpServletRequest request, HttpSession session);

	// 定义 updatechongwuzixun方法

	public void updatechongwuzixun(HttpServletRequest request, HttpSession session, int id);

	// 定义updatechongwuzixunact处理宠物资讯修改

	public void updatechongwuzixunact(HttpServletRequest request, Chongwuzixun chongwuzixun, HttpSession session,
			MultipartFile fengmianfile) throws IOException;

	// 定义deletechongwuzixun,处理删除宠物资讯

	public void deletechongwuzixun(HttpServletRequest request, HttpSession session, int id);

	// 定义searchchongwuzixun方法，处理搜索操作

	public void searchchongwuzixun(HttpServletRequest request, HttpSession session, String search);

	// 定义ChongwuzixunpinglunMapper

	public void chongwuzixundetails(HttpServletRequest request, HttpSession session, int id);

}
