package org.spring.springboot.controller;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

import java.util.Collections;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.spring.springboot.service.YonghuServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class YonghuController {

	private static final Log logger = LogFactory.getLog(YonghuController.class);

	@Autowired
	private YonghuServiceImp yonghuservice;

	// 定义方法addyonghu,响应页面addyonghu请求

	@RequestMapping(value = "addyonghu")

	public String addyonghu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addyonghu

		logger.debug("YonghuController.addyonghu ......");

		yonghuservice.addyonghu(request, session);

		// 若返回地址不等于空且不等于addyonghu.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addyonghu.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addyonghu页面

		return "addyonghu";

	}

	// 定义addyonghuact方法

	@RequestMapping(value = "addyonghuact")

	public String addyonghuact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Yonghu yonghu, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行YonghuController.addyonghuact方法

		logger.debug("YonghuController.addyonghuact ......");

		yonghuservice.addyonghuact(request, session, yonghu); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addyonghuact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addyonghu方法

		return "forward:/yonghumanage.action";

	}

	// 定义yonghumanage方法响应页面请求

	@RequestMapping(value = "yonghumanage")

	public String yonghumanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行YonghuController.yonghumanage

		logger.debug("YonghuController.yonghumanage ......");

		yonghuservice.yonghumanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("yonghumanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到yonghumanage页面

		return "yonghumanage";

	}

	// 定义 yonghuview方法

	@RequestMapping(value = "yonghuview")

	public String yonghuview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行YonghuController.yonghuview方法

		logger.debug("YonghuController.yonghuview ......");

		yonghuservice.yonghuview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghuview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuview页面

		return "yonghuview";

	}

	// 定义 updateyonghu方法

	@RequestMapping(value = "updateyonghu")

	public String updateyonghu(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志YonghuController.updateyonghu，表示正在执行该方法

		logger.debug("YonghuController.updateyonghu ......");

		yonghuservice.updateyonghu(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updateyonghu.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updateyonghu页面

		return "updateyonghu";

	}

	// 定义updateyonghuact处理用户修改

	@RequestMapping(value = "updateyonghuact")

	public String updateyonghuact(HttpServletRequest request, HttpServletResponse response, Yonghu yonghu,
			HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法YonghuController.updateyonghuact

		logger.debug("YonghuController.updateyonghuact ......");

		yonghuservice.updateyonghuact(request, yonghu, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updateyonghuact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回yonghumanage.action方法

		return "forward:/yonghumanage.action";

	}

	// 定义deleteyonghu,处理删除用户

	@RequestMapping(value = "deleteyonghu")

	public String deleteyonghu(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行YonghuController.deleteyonghu方法

		logger.debug("YonghuController.deleteyonghu ......");

		yonghuservice.deleteyonghu(request, session, id);

		if (backurl != null && backurl.indexOf("deleteyonghu.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghumanage.action方法

		return "forward:/yonghumanage.action";

	}

	// 定义searchyonghu方法，处理搜索操作

	@RequestMapping(value = "searchyonghu")

	public String searchyonghu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行YonghuController.searchyonghu

		logger.debug("YonghuController.searchyonghu ......");

		yonghuservice.searchyonghu(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchyonghu.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchyonghu";

	}

	// 定义YonghupinglunMapper

	@RequestMapping(value = "yonghudetails")

	public String yonghudetails(HttpServletRequest request, HttpSession session, HttpServletResponse response, int id,
			String backurl) {

		// 输入日志信息，表名当前执行方法为YonghuController.yonghudetails

		logger.debug("YonghuController.yonghudetails ......");

		yonghuservice.yonghudetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("yonghudetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudetails

		return "yonghudetails";

	}

}
