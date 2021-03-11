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
import org.spring.springboot.domain.Chongwuzixun;
import org.spring.springboot.domain.ChongwuzixunExample;
import org.spring.springboot.service.ChongwuzixunServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class ChongwuzixunController {

	private static final Log logger = LogFactory.getLog(ChongwuzixunController.class);

	@Autowired
	private ChongwuzixunServiceImp chongwuzixunservice;

	// 定义方法addchongwuzixun,响应页面addchongwuzixun请求

	@RequestMapping(value = "addchongwuzixun")

	public String addchongwuzixun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addchongwuzixun

		logger.debug("ChongwuzixunController.addchongwuzixun ......");

		chongwuzixunservice.addchongwuzixun(request, session);

		// 若返回地址不等于空且不等于addchongwuzixun.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addchongwuzixun.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addchongwuzixun页面

		return "addchongwuzixun";

	}

	// 定义addchongwuzixunact方法

	@RequestMapping(value = "addchongwuzixunact")

	public String addchongwuzixunact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Chongwuzixun chongwuzixun, String backurl, MultipartFile fengmianfile) throws IOException {

		// 输出当前方法日志，表示正在执行ChongwuzixunController.addchongwuzixunact方法

		logger.debug("ChongwuzixunController.addchongwuzixunact ......");

		chongwuzixunservice.addchongwuzixunact(request, session, chongwuzixun, fengmianfile); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addchongwuzixunact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addchongwuzixun方法

		return "forward:/chongwuzixunmanage.action";

	}

	// 定义chongwuzixunmanage方法响应页面请求

	@RequestMapping(value = "chongwuzixunmanage")

	public String chongwuzixunmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行ChongwuzixunController.chongwuzixunmanage

		logger.debug("ChongwuzixunController.chongwuzixunmanage ......");

		chongwuzixunservice.chongwuzixunmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("chongwuzixunmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到chongwuzixunmanage页面

		return "chongwuzixunmanage";

	}

	// 定义 chongwuzixunview方法

	@RequestMapping(value = "chongwuzixunview")

	public String chongwuzixunview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行ChongwuzixunController.chongwuzixunview方法

		logger.debug("ChongwuzixunController.chongwuzixunview ......");

		chongwuzixunservice.chongwuzixunview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("chongwuzixunview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回chongwuzixunview页面

		return "chongwuzixunview";

	}

	// 定义 updatechongwuzixun方法

	@RequestMapping(value = "updatechongwuzixun")

	public String updatechongwuzixun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志ChongwuzixunController.updatechongwuzixun，表示正在执行该方法

		logger.debug("ChongwuzixunController.updatechongwuzixun ......");

		chongwuzixunservice.updatechongwuzixun(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatechongwuzixun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatechongwuzixun页面

		return "updatechongwuzixun";

	}

	// 定义updatechongwuzixunact处理宠物资讯修改

	@RequestMapping(value = "updatechongwuzixunact")

	public String updatechongwuzixunact(HttpServletRequest request, HttpServletResponse response,
			Chongwuzixun chongwuzixun, HttpSession session, String backurl, MultipartFile fengmianfile)
					throws IOException {

		// 输出日志，表示正在执行当前方法ChongwuzixunController.updatechongwuzixunact

		logger.debug("ChongwuzixunController.updatechongwuzixunact ......");

		chongwuzixunservice.updatechongwuzixunact(request, chongwuzixun, session, fengmianfile);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatechongwuzixunact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回chongwuzixunmanage.action方法

		return "forward:/chongwuzixunmanage.action";

	}

	// 定义deletechongwuzixun,处理删除宠物资讯

	@RequestMapping(value = "deletechongwuzixun")

	public String deletechongwuzixun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行ChongwuzixunController.deletechongwuzixun方法

		logger.debug("ChongwuzixunController.deletechongwuzixun ......");

		chongwuzixunservice.deletechongwuzixun(request, session, id);

		if (backurl != null && backurl.indexOf("deletechongwuzixun.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回chongwuzixunmanage.action方法

		return "forward:/chongwuzixunmanage.action";

	}

	// 定义searchchongwuzixun方法，处理搜索操作

	@RequestMapping(value = "searchchongwuzixun")

	public String searchchongwuzixun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行ChongwuzixunController.searchchongwuzixun

		logger.debug("ChongwuzixunController.searchchongwuzixun ......");

		chongwuzixunservice.searchchongwuzixun(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchchongwuzixun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchchongwuzixun";

	}

	// 定义ChongwuzixunpinglunMapper

	@RequestMapping(value = "chongwuzixundetails")

	public String chongwuzixundetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为ChongwuzixunController.chongwuzixundetails

		logger.debug("ChongwuzixunController.chongwuzixundetails ......");

		chongwuzixunservice.chongwuzixundetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("chongwuzixundetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回chongwuzixundetails

		return "chongwuzixundetails";

	}

}
