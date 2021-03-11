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
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.spring.springboot.service.LeibieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class LeibieController {

	private static final Log logger = LogFactory.getLog(LeibieController.class);

	@Autowired
	private LeibieServiceImp leibieservice;

	// 定义方法addleibie,响应页面addleibie请求

	@RequestMapping(value = "addleibie")

	public String addleibie(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addleibie

		logger.debug("LeibieController.addleibie ......");

		leibieservice.addleibie(request, session);

		// 若返回地址不等于空且不等于addleibie.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addleibie.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addleibie页面

		return "addleibie";

	}

	// 定义addleibieact方法

	@RequestMapping(value = "addleibieact")

	public String addleibieact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Leibie leibie, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行LeibieController.addleibieact方法

		logger.debug("LeibieController.addleibieact ......");

		leibieservice.addleibieact(request, session, leibie); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addleibieact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addleibie方法

		return "forward:/leibiemanage.action";

	}

	// 定义leibiemanage方法响应页面请求

	@RequestMapping(value = "leibiemanage")

	public String leibiemanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LeibieController.leibiemanage

		logger.debug("LeibieController.leibiemanage ......");

		leibieservice.leibiemanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("leibiemanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到leibiemanage页面

		return "leibiemanage";

	}

	// 定义 leibieview方法

	@RequestMapping(value = "leibieview")

	public String leibieview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LeibieController.leibieview方法

		logger.debug("LeibieController.leibieview ......");

		leibieservice.leibieview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("leibieview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回leibieview页面

		return "leibieview";

	}

	// 定义 updateleibie方法

	@RequestMapping(value = "updateleibie")

	public String updateleibie(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志LeibieController.updateleibie，表示正在执行该方法

		logger.debug("LeibieController.updateleibie ......");

		leibieservice.updateleibie(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updateleibie.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updateleibie页面

		return "updateleibie";

	}

	// 定义updateleibieact处理类别修改

	@RequestMapping(value = "updateleibieact")

	public String updateleibieact(HttpServletRequest request, HttpServletResponse response, Leibie leibie,
			HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法LeibieController.updateleibieact

		logger.debug("LeibieController.updateleibieact ......");

		leibieservice.updateleibieact(request, leibie, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updateleibieact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回leibiemanage.action方法

		return "forward:/leibiemanage.action";

	}

	// 定义deleteleibie,处理删除类别

	@RequestMapping(value = "deleteleibie")

	public String deleteleibie(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行LeibieController.deleteleibie方法

		logger.debug("LeibieController.deleteleibie ......");

		leibieservice.deleteleibie(request, session, id);

		if (backurl != null && backurl.indexOf("deleteleibie.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回leibiemanage.action方法

		return "forward:/leibiemanage.action";

	}

	// 定义searchleibie方法，处理搜索操作

	@RequestMapping(value = "searchleibie")

	public String searchleibie(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行LeibieController.searchleibie

		logger.debug("LeibieController.searchleibie ......");

		leibieservice.searchleibie(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchleibie.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchleibie";

	}

	// 定义LeibiepinglunMapper

	@RequestMapping(value = "leibiedetails")

	public String leibiedetails(HttpServletRequest request, HttpSession session, HttpServletResponse response, int id,
			String backurl) {

		// 输入日志信息，表名当前执行方法为LeibieController.leibiedetails

		logger.debug("LeibieController.leibiedetails ......");

		leibieservice.leibiedetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("leibiedetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回leibiedetails

		return "leibiedetails";

	}

}
