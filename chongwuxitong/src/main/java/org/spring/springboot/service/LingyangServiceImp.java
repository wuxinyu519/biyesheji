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
import org.spring.springboot.dao.LingyangMapper;
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Lingyang;
import org.spring.springboot.domain.LingyangExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface LingyangServiceImp {

	// 定义方法addlingyang接口,响应控制层添加领养请求

	public void addlingyang(HttpServletRequest request, HttpSession session);

	// 定义yonghuaddlingyang接口，在领养控制层中调用

	public void yonghuaddlingyang(HttpServletRequest request, HttpSession session);

	// 定义yonghuupdatelingyang方法

	public void yonghuupdatelingyang(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghulingyangmanage方法

	public void yonghulingyangmanage(HttpServletRequest request, HttpSession session);

	// 定义yonghuaddlingyangact接口，响应控制层添加请求

	public void yonghuaddlingyangact(HttpServletRequest request, HttpSession session, Lingyang lingyang)
			throws IOException;

	// 定义addlingyangact接口

	public void addlingyangact(HttpServletRequest request, HttpSession session, Lingyang lingyang) throws IOException;

	// 定义lingyangmanage方法响应页面请求

	public void lingyangmanage(HttpServletRequest request, HttpSession session);

	// 定义 lingyangview方法

	public void lingyangview(HttpServletRequest request, HttpSession session);

	// 定义 updatelingyang方法

	public void updatelingyang(HttpServletRequest request, HttpSession session, int id);

	// 定义updatelingyangact处理领养修改

	public void updatelingyangact(HttpServletRequest request, Lingyang lingyang, HttpSession session)
			throws IOException;

	// 定义yonghuupdatelingyangact方法

	public void yonghuupdatelingyangact(HttpServletRequest request, Lingyang lingyang, HttpSession session)
			throws IOException;

	// 定义deletelingyang,处理删除领养

	public void deletelingyang(HttpServletRequest request, HttpSession session, int id);

	// 定义yonghudeletelingyang方法

	public void yonghudeletelingyang(HttpServletRequest request, HttpSession session, int id);

	// 定义searchlingyang方法，处理搜索操作

	public void searchlingyang(HttpServletRequest request, HttpSession session, String search);

	// 定义LingyangpinglunMapper

	public void lingyangdetails(HttpServletRequest request, HttpSession session, int id);

}
