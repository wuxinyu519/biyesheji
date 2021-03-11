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
import org.spring.springboot.domain.Xitongshuoming;
import org.spring.springboot.domain.XitongshuomingExample;
import org.spring.springboot.service.XitongshuomingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class XitongshuomingController {

	private static final Log logger = LogFactory.getLog(XitongshuomingController.class);

	@Autowired
	private XitongshuomingServiceImp xitongshuomingservice;

	// 定义方法addxitongshuoming,响应页面addxitongshuoming请求

	@RequestMapping(value = "addxitongshuoming")

	public String addxitongshuoming(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addxitongshuoming

		logger.debug("XitongshuomingController.addxitongshuoming ......");

		xitongshuomingservice.addxitongshuoming(request, session);

		// 若返回地址不等于空且不等于addxitongshuoming.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addxitongshuoming.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addxitongshuoming页面

		return "addxitongshuoming";

	}

	// 定义addxitongshuomingact方法

	@RequestMapping(value = "addxitongshuomingact")

	public String addxitongshuomingact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Xitongshuoming xitongshuoming, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行XitongshuomingController.addxitongshuomingact方法

		logger.debug("XitongshuomingController.addxitongshuomingact ......");

		xitongshuomingservice.addxitongshuomingact(request, session, xitongshuoming); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addxitongshuomingact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addxitongshuoming方法

		return "forward:/xitongshuomingmanage.action";

	}

	// 定义xitongshuomingmanage方法响应页面请求

	@RequestMapping(value = "xitongshuomingmanage")

	public String xitongshuomingmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行XitongshuomingController.xitongshuomingmanage

		logger.debug("XitongshuomingController.xitongshuomingmanage ......");

		xitongshuomingservice.xitongshuomingmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("xitongshuomingmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到xitongshuomingmanage页面

		return "xitongshuomingmanage";

	}

	// 定义 xitongshuomingview方法

	@RequestMapping(value = "xitongshuomingview")

	public String xitongshuomingview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行XitongshuomingController.xitongshuomingview方法

		logger.debug("XitongshuomingController.xitongshuomingview ......");

		xitongshuomingservice.xitongshuomingview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("xitongshuomingview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回xitongshuomingview页面

		return "xitongshuomingview";

	}

	// 定义 updatexitongshuoming方法

	@RequestMapping(value = "updatexitongshuoming")

	public String updatexitongshuoming(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志XitongshuomingController.updatexitongshuoming，表示正在执行该方法

		logger.debug("XitongshuomingController.updatexitongshuoming ......");

		xitongshuomingservice.updatexitongshuoming(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatexitongshuoming.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatexitongshuoming页面

		return "updatexitongshuoming";

	}

	// 定义updatexitongshuomingact处理系统说明修改

	@RequestMapping(value = "updatexitongshuomingact")

	public String updatexitongshuomingact(HttpServletRequest request, HttpServletResponse response,
			Xitongshuoming xitongshuoming, HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法XitongshuomingController.updatexitongshuomingact

		logger.debug("XitongshuomingController.updatexitongshuomingact ......");

		xitongshuomingservice.updatexitongshuomingact(request, xitongshuoming, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatexitongshuomingact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回xitongshuomingmanage.action方法

		return "forward:/xitongshuomingmanage.action";

	}

	// 定义deletexitongshuoming,处理删除系统说明

	@RequestMapping(value = "deletexitongshuoming")

	public String deletexitongshuoming(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行XitongshuomingController.deletexitongshuoming方法

		logger.debug("XitongshuomingController.deletexitongshuoming ......");

		xitongshuomingservice.deletexitongshuoming(request, session, id);

		if (backurl != null && backurl.indexOf("deletexitongshuoming.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回xitongshuomingmanage.action方法

		return "forward:/xitongshuomingmanage.action";

	}

	// 定义searchxitongshuoming方法，处理搜索操作

	@RequestMapping(value = "searchxitongshuoming")

	public String searchxitongshuoming(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行XitongshuomingController.searchxitongshuoming

		logger.debug("XitongshuomingController.searchxitongshuoming ......");

		xitongshuomingservice.searchxitongshuoming(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchxitongshuoming.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchxitongshuoming";

	}

	// 定义XitongshuomingpinglunMapper

	@RequestMapping(value = "xitongshuomingdetails")

	public String xitongshuomingdetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为XitongshuomingController.xitongshuomingdetails

		logger.debug("XitongshuomingController.xitongshuomingdetails ......");

		xitongshuomingservice.xitongshuomingdetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("xitongshuomingdetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回xitongshuomingdetails

		return "xitongshuomingdetails";

	}

}
