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
import org.spring.springboot.dao.LeibieMapper;
import org.spring.springboot.dao.LiulangchongwupinglunMapper;
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.spring.springboot.service.LiulangchongwuServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class LiulangchongwuController {

	private static final Log logger = LogFactory.getLog(LiulangchongwuController.class);

	@Autowired
	private LiulangchongwuServiceImp liulangchongwuservice;

	// 定义方法addliulangchongwu,响应页面addliulangchongwu请求

	@RequestMapping(value = "addliulangchongwu")

	public String addliulangchongwu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addliulangchongwu

		logger.debug("LiulangchongwuController.addliulangchongwu ......");

		liulangchongwuservice.addliulangchongwu(request, session);

		// 若返回地址不等于空且不等于addliulangchongwu.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addliulangchongwu.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addliulangchongwu页面

		return "addliulangchongwu";

	}

	// 定义addliulangchongwuact方法

	@RequestMapping(value = "addliulangchongwuact")

	public String addliulangchongwuact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Liulangchongwu liulangchongwu, String backurl, MultipartFile tupianfile) throws IOException {

		// 输出当前方法日志，表示正在执行LiulangchongwuController.addliulangchongwuact方法

		logger.debug("LiulangchongwuController.addliulangchongwuact ......");

		liulangchongwuservice.addliulangchongwuact(request, session, liulangchongwu, tupianfile); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addliulangchongwuact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addliulangchongwu方法

		return "forward:/liulangchongwumanage.action";

	}

	// 定义liulangchongwumanage方法响应页面请求

	@RequestMapping(value = "liulangchongwumanage")

	public String liulangchongwumanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwuController.liulangchongwumanage

		logger.debug("LiulangchongwuController.liulangchongwumanage ......");

		liulangchongwuservice.liulangchongwumanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("liulangchongwumanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到liulangchongwumanage页面

		return "liulangchongwumanage";

	}

	// 定义 liulangchongwuview方法

	@RequestMapping(value = "liulangchongwuview")

	public String liulangchongwuview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwuController.liulangchongwuview方法

		logger.debug("LiulangchongwuController.liulangchongwuview ......");

		liulangchongwuservice.liulangchongwuview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("liulangchongwuview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwuview页面

		return "liulangchongwuview";

	}

	// 定义 updateliulangchongwu方法

	@RequestMapping(value = "updateliulangchongwu")

	public String updateliulangchongwu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志LiulangchongwuController.updateliulangchongwu，表示正在执行该方法

		logger.debug("LiulangchongwuController.updateliulangchongwu ......");

		liulangchongwuservice.updateliulangchongwu(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updateliulangchongwu.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updateliulangchongwu页面

		return "updateliulangchongwu";

	}

	// 定义updateliulangchongwuact处理流浪宠物修改

	@RequestMapping(value = "updateliulangchongwuact")

	public String updateliulangchongwuact(HttpServletRequest request, HttpServletResponse response,
			Liulangchongwu liulangchongwu, HttpSession session, String backurl, MultipartFile tupianfile)
					throws IOException {

		// 输出日志，表示正在执行当前方法LiulangchongwuController.updateliulangchongwuact

		logger.debug("LiulangchongwuController.updateliulangchongwuact ......");

		liulangchongwuservice.updateliulangchongwuact(request, liulangchongwu, session, tupianfile);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updateliulangchongwuact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwumanage.action方法

		return "forward:/liulangchongwumanage.action";

	}

	// 定义deleteliulangchongwu,处理删除流浪宠物

	@RequestMapping(value = "deleteliulangchongwu")

	public String deleteliulangchongwu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwuController.deleteliulangchongwu方法

		logger.debug("LiulangchongwuController.deleteliulangchongwu ......");

		liulangchongwuservice.deleteliulangchongwu(request, session, id);

		if (backurl != null && backurl.indexOf("deleteliulangchongwu.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwumanage.action方法

		return "forward:/liulangchongwumanage.action";

	}

	// 定义searchliulangchongwu方法，处理搜索操作

	@RequestMapping(value = "searchliulangchongwu")

	public String searchliulangchongwu(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwuController.searchliulangchongwu

		logger.debug("LiulangchongwuController.searchliulangchongwu ......");

		liulangchongwuservice.searchliulangchongwu(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchliulangchongwu.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchliulangchongwu";

	}

	// 定义LiulangchongwupinglunMapper

	@RequestMapping(value = "liulangchongwudetails")

	public String liulangchongwudetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为LiulangchongwuController.liulangchongwudetails

		logger.debug("LiulangchongwuController.liulangchongwudetails ......");

		liulangchongwuservice.liulangchongwudetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("liulangchongwudetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwudetails

		return "liulangchongwudetails";

	}

}
