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
import org.spring.springboot.dao.DongtaiMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Dongtai;
import org.spring.springboot.domain.DongtaiExample;
import org.spring.springboot.domain.Dongtaipinglun;
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.spring.springboot.service.DongtaipinglunServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class DongtaipinglunController {

	private static final Log logger = LogFactory.getLog(DongtaipinglunController.class);

	@Autowired
	private DongtaipinglunServiceImp dongtaipinglunservice;

	// 定义方法adddongtaipinglun,响应页面adddongtaipinglun请求

	@RequestMapping(value = "adddongtaipinglun")

	public String adddongtaipinglun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为adddongtaipinglun

		logger.debug("DongtaipinglunController.adddongtaipinglun ......");

		dongtaipinglunservice.adddongtaipinglun(request, session);

		// 若返回地址不等于空且不等于adddongtaipinglun.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("adddongtaipinglun.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回adddongtaipinglun页面

		return "adddongtaipinglun";

	}

	// 定义yonghuadddongtaipinglun方法

	@RequestMapping(value = "yonghuadddongtaipinglun")

	public String yonghuadddongtaipinglun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.yonghuadddongtaipinglun方法

		logger.debug("DongtaipinglunController.yonghuadddongtaipinglun ......");

		dongtaipinglunservice.yonghuadddongtaipinglun(request, session);

		// 若返回地址不等于空且不等于adddongtaipinglun.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("yonghuadddongtaipinglun.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回adddongtaipinglun页面

		return "yonghuadddongtaipinglun";

	}

	// 定义yonghuupdatedongtaipinglun方法

	@RequestMapping(value = "yonghuupdatedongtaipinglun")

	public String yonghuupdatedongtaipinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志DongtaipinglunController.yonghuupdatedongtaipinglun

		logger.debug("DongtaipinglunController.yonghuupdatedongtaipinglun ......");

		dongtaipinglunservice.yonghuupdatedongtaipinglun(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("yonghuupdatedongtaipinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuupdatedongtaipinglun页面

		return "yonghuupdatedongtaipinglun";

	}

	// 定义yonghudongtaipinglunmanage方法

	@RequestMapping(value = "yonghudongtaipinglunmanage")

	public String yonghudongtaipinglunmanage(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, String backurl) {

		// 输出日志，表示当前正在执行方法DongtaipinglunController.yonghudongtaipinglunmanage

		logger.debug("DongtaipinglunController.yonghudongtaipinglunmanage ......");

		dongtaipinglunservice.yonghudongtaipinglunmanage(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghudongtaipinglunmanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudongtaipinglunmanage页面

		return "yonghudongtaipinglunmanage";

	}

	// 定义yonghuadddongtaipinglunact，响应页面添加请求

	@RequestMapping(value = "yonghuadddongtaipinglunact")

	public String yonghuadddongtaipinglunact(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, Dongtaipinglun dongtaipinglun, String backurl) throws IOException {

		// 输出日志，表示当前正在执行方法为DongtaipinglunController.yonghuadddongtaipinglunact

		logger.debug("DongtaipinglunController.yonghuadddongtaipinglunact ......");

		dongtaipinglunservice.yonghuadddongtaipinglunact(request, session, dongtaipinglun); // 如果backurl不等于空
																							// 且
																							// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("yonghuadddongtaipinglunact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到yonghuadddongtaipinglun方法

		return "forward:/yonghudongtaipinglunmanage.action";

	}

	// 定义adddongtaipinglunact方法

	@RequestMapping(value = "adddongtaipinglunact")

	public String adddongtaipinglunact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Dongtaipinglun dongtaipinglun, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行DongtaipinglunController.adddongtaipinglunact方法

		logger.debug("DongtaipinglunController.adddongtaipinglunact ......");

		dongtaipinglunservice.adddongtaipinglunact(request, session, dongtaipinglun); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("adddongtaipinglunact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回adddongtaipinglun方法

		return "forward:/dongtaipinglunmanage.action";

	}

	// 定义dongtaipinglunmanage方法响应页面请求

	@RequestMapping(value = "dongtaipinglunmanage")

	public String dongtaipinglunmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.dongtaipinglunmanage

		logger.debug("DongtaipinglunController.dongtaipinglunmanage ......");

		dongtaipinglunservice.dongtaipinglunmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("dongtaipinglunmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到dongtaipinglunmanage页面

		return "dongtaipinglunmanage";

	}

	// 定义 dongtaipinglunview方法

	@RequestMapping(value = "dongtaipinglunview")

	public String dongtaipinglunview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.dongtaipinglunview方法

		logger.debug("DongtaipinglunController.dongtaipinglunview ......");

		dongtaipinglunservice.dongtaipinglunview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("dongtaipinglunview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaipinglunview页面

		return "dongtaipinglunview";

	}

	// 定义 updatedongtaipinglun方法

	@RequestMapping(value = "updatedongtaipinglun")

	public String updatedongtaipinglun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志DongtaipinglunController.updatedongtaipinglun，表示正在执行该方法

		logger.debug("DongtaipinglunController.updatedongtaipinglun ......");

		dongtaipinglunservice.updatedongtaipinglun(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatedongtaipinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatedongtaipinglun页面

		return "updatedongtaipinglun";

	}

	// 定义updatedongtaipinglunact处理动态回复修改

	@RequestMapping(value = "updatedongtaipinglunact")

	public String updatedongtaipinglunact(HttpServletRequest request, HttpServletResponse response,
			Dongtaipinglun dongtaipinglun, HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法DongtaipinglunController.updatedongtaipinglunact

		logger.debug("DongtaipinglunController.updatedongtaipinglunact ......");

		dongtaipinglunservice.updatedongtaipinglunact(request, dongtaipinglun, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatedongtaipinglunact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回dongtaipinglunmanage.action方法

		return "forward:/dongtaipinglunmanage.action";

	}

	// 定义yonghuupdatedongtaipinglunact方法

	@RequestMapping(value = "yonghuupdatedongtaipinglunact")

	public String yonghuupdatedongtaipinglunact(HttpServletRequest request, HttpServletResponse response,
			Dongtaipinglun dongtaipinglun, HttpSession session, String backurl) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("DongtaipinglunController.yonghuupdatedongtaipinglunact ......");

		dongtaipinglunservice.yonghuupdatedongtaipinglunact(request, dongtaipinglun, session);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("yonghuupdatedongtaipinglunact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudongtaipinglunmanage.action方法

		return "forward:/yonghudongtaipinglunmanage.action";

	}

	// 定义deletedongtaipinglun,处理删除动态回复

	@RequestMapping(value = "deletedongtaipinglun")

	public String deletedongtaipinglun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.deletedongtaipinglun方法

		logger.debug("DongtaipinglunController.deletedongtaipinglun ......");

		dongtaipinglunservice.deletedongtaipinglun(request, session, id);

		if (backurl != null && backurl.indexOf("deletedongtaipinglun.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaipinglunmanage.action方法

		return "forward:/dongtaipinglunmanage.action";

	}

	// 定义yonghudeletedongtaipinglun方法

	@RequestMapping(value = "yonghudeletedongtaipinglun")

	public String yonghudeletedongtaipinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.yonghudeletedongtaipinglun方法

		logger.debug("DongtaipinglunController.yonghudeletedongtaipinglun ......");

		dongtaipinglunservice.yonghudeletedongtaipinglun(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghudeletedongtaipinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudongtaipinglunmanage.action方法

		return "forward:/yonghudongtaipinglunmanage.action";

	}

	// 定义searchdongtaipinglun方法，处理搜索操作

	@RequestMapping(value = "searchdongtaipinglun")

	public String searchdongtaipinglun(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行DongtaipinglunController.searchdongtaipinglun

		logger.debug("DongtaipinglunController.searchdongtaipinglun ......");

		dongtaipinglunservice.searchdongtaipinglun(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchdongtaipinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchdongtaipinglun";

	}

	// 定义DongtaipinglunpinglunMapper

	@RequestMapping(value = "dongtaipinglundetails")

	public String dongtaipinglundetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为DongtaipinglunController.dongtaipinglundetails

		logger.debug("DongtaipinglunController.dongtaipinglundetails ......");

		dongtaipinglunservice.dongtaipinglundetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("dongtaipinglundetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaipinglundetails

		return "dongtaipinglundetails";

	}

}
