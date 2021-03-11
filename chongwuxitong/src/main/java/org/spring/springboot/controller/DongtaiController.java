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
import org.spring.springboot.dao.DongtaipinglunMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Dongtai;
import org.spring.springboot.domain.DongtaiExample;
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.spring.springboot.service.DongtaiServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class DongtaiController {

	private static final Log logger = LogFactory.getLog(DongtaiController.class);

	@Autowired
	private DongtaiServiceImp dongtaiservice;

	// 定义方法adddongtai,响应页面adddongtai请求

	@RequestMapping(value = "adddongtai")

	public String adddongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为adddongtai

		logger.debug("DongtaiController.adddongtai ......");

		dongtaiservice.adddongtai(request, session);

		// 若返回地址不等于空且不等于adddongtai.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("adddongtai.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回adddongtai页面

		return "adddongtai";

	}

	// 定义yonghuadddongtai方法

	@RequestMapping(value = "yonghuadddongtai")

	public String yonghuadddongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.yonghuadddongtai方法

		logger.debug("DongtaiController.yonghuadddongtai ......");

		dongtaiservice.yonghuadddongtai(request, session);

		// 若返回地址不等于空且不等于adddongtai.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("yonghuadddongtai.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回adddongtai页面

		return "yonghuadddongtai";

	}

	// 定义yonghuupdatedongtai方法

	@RequestMapping(value = "yonghuupdatedongtai")

	public String yonghuupdatedongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志DongtaiController.yonghuupdatedongtai

		logger.debug("DongtaiController.yonghuupdatedongtai ......");

		dongtaiservice.yonghuupdatedongtai(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("yonghuupdatedongtai.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuupdatedongtai页面

		return "yonghuupdatedongtai";

	}

	// 定义yonghudongtaimanage方法

	@RequestMapping(value = "yonghudongtaimanage")

	public String yonghudongtaimanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志 ，表示当前正在执行方法为DongtaiController.yonghudongtaimanage

		logger.debug("DongtaiController.yonghudongtaimanage ......");

		dongtaiservice.yonghudongtaimanage(request, session); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("yonghudongtaimanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		} // 返回yonghudongtaimanage方法

		return "yonghudongtaimanage";

	}

	// 定义yonghuadddongtaiact，响应页面添加请求

	@RequestMapping(value = "yonghuadddongtaiact")

	public String yonghuadddongtaiact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Dongtai dongtai, String backurl, MultipartFile picfile) throws IOException {

		// 输出日志，表示当前正在执行方法为DongtaiController.yonghuadddongtaiact

		logger.debug("DongtaiController.yonghuadddongtaiact ......");

		dongtaiservice.yonghuadddongtaiact(request, session, dongtai, picfile); // 如果backurl不等于空
																				// 且
																				// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("yonghuadddongtaiact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到yonghuadddongtai方法

		return "forward:/yonghudongtaimanage.action";

	}

	// 定义adddongtaiact方法

	@RequestMapping(value = "adddongtaiact")

	public String adddongtaiact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Dongtai dongtai, String backurl, MultipartFile picfile) throws IOException {

		// 输出当前方法日志，表示正在执行DongtaiController.adddongtaiact方法

		logger.debug("DongtaiController.adddongtaiact ......");

		dongtaiservice.adddongtaiact(request, session, dongtai, picfile); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("adddongtaiact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回adddongtai方法

		return "forward:/dongtaimanage.action";

	}

	// 定义dongtaimanage方法响应页面请求

	@RequestMapping(value = "dongtaimanage")

	public String dongtaimanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.dongtaimanage

		logger.debug("DongtaiController.dongtaimanage ......");

		dongtaiservice.dongtaimanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("dongtaimanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到dongtaimanage页面

		return "dongtaimanage";

	}

	// 定义 dongtaiview方法

	@RequestMapping(value = "dongtaiview")

	public String dongtaiview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.dongtaiview方法

		logger.debug("DongtaiController.dongtaiview ......");

		dongtaiservice.dongtaiview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("dongtaiview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaiview页面

		return "dongtaiview";

	}

	// 定义 updatedongtai方法

	@RequestMapping(value = "updatedongtai")

	public String updatedongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志DongtaiController.updatedongtai，表示正在执行该方法

		logger.debug("DongtaiController.updatedongtai ......");

		dongtaiservice.updatedongtai(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatedongtai.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatedongtai页面

		return "updatedongtai";

	}

	// 定义updatedongtaiact处理动态修改

	@RequestMapping(value = "updatedongtaiact")

	public String updatedongtaiact(HttpServletRequest request, HttpServletResponse response, Dongtai dongtai,
			HttpSession session, String backurl, MultipartFile picfile) throws IOException {

		// 输出日志，表示正在执行当前方法DongtaiController.updatedongtaiact

		logger.debug("DongtaiController.updatedongtaiact ......");

		dongtaiservice.updatedongtaiact(request, dongtai, session, picfile);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatedongtaiact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回dongtaimanage.action方法

		return "forward:/dongtaimanage.action";

	}

	// 定义yonghuupdatedongtaiact方法

	@RequestMapping(value = "yonghuupdatedongtaiact")

	public String yonghuupdatedongtaiact(HttpServletRequest request, HttpServletResponse response, Dongtai dongtai,
			HttpSession session, String backurl, MultipartFile picfile) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("DongtaiController.yonghuupdatedongtaiact ......");

		dongtaiservice.yonghuupdatedongtaiact(request, dongtai, session, picfile);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("yonghuupdatedongtaiact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudongtaimanage.action方法

		return "forward:/yonghudongtaimanage.action";

	}

	// 定义deletedongtai,处理删除动态

	@RequestMapping(value = "deletedongtai")

	public String deletedongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.deletedongtai方法

		logger.debug("DongtaiController.deletedongtai ......");

		dongtaiservice.deletedongtai(request, session, id);

		if (backurl != null && backurl.indexOf("deletedongtai.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaimanage.action方法

		return "forward:/dongtaimanage.action";

	}

	// 定义yonghudeletedongtai方法

	@RequestMapping(value = "yonghudeletedongtai")

	public String yonghudeletedongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.yonghudeletedongtai方法

		logger.debug("DongtaiController.yonghudeletedongtai ......");

		dongtaiservice.yonghudeletedongtai(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghudeletedongtai.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghudongtaimanage.action方法

		return "forward:/yonghudongtaimanage.action";

	}

	// 定义searchdongtai方法，处理搜索操作

	@RequestMapping(value = "searchdongtai")

	public String searchdongtai(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行DongtaiController.searchdongtai

		logger.debug("DongtaiController.searchdongtai ......");

		dongtaiservice.searchdongtai(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchdongtai.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchdongtai";

	}

	// 定义DongtaipinglunMapper

	@RequestMapping(value = "dongtaidetails")

	public String dongtaidetails(HttpServletRequest request, HttpSession session, HttpServletResponse response, int id,
			String backurl) {

		// 输入日志信息，表名当前执行方法为DongtaiController.dongtaidetails

		logger.debug("DongtaiController.dongtaidetails ......");

		dongtaiservice.dongtaidetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("dongtaidetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回dongtaidetails

		return "dongtaidetails";

	}

}
