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
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Liulangchongwupinglun;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.spring.springboot.service.LiulangchongwupinglunServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class LiulangchongwupinglunController {

	private static final Log logger = LogFactory.getLog(LiulangchongwupinglunController.class);

	@Autowired
	private LiulangchongwupinglunServiceImp liulangchongwupinglunservice;

	// 定义方法addliulangchongwupinglun,响应页面addliulangchongwupinglun请求

	@RequestMapping(value = "addliulangchongwupinglun")

	public String addliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, String backurl) {

		// 输出日志，当前执行方法为addliulangchongwupinglun

		logger.debug("LiulangchongwupinglunController.addliulangchongwupinglun ......");

		liulangchongwupinglunservice.addliulangchongwupinglun(request, session);

		// 若返回地址不等于空且不等于addliulangchongwupinglun.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addliulangchongwupinglun.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addliulangchongwupinglun页面

		return "addliulangchongwupinglun";

	}

	// 定义yonghuaddliulangchongwupinglun方法

	@RequestMapping(value = "yonghuaddliulangchongwupinglun")

	public String yonghuaddliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.yonghuaddliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunController.yonghuaddliulangchongwupinglun ......");

		liulangchongwupinglunservice.yonghuaddliulangchongwupinglun(request, session);

		// 若返回地址不等于空且不等于addliulangchongwupinglun.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("yonghuaddliulangchongwupinglun.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回addliulangchongwupinglun页面

		return "yonghuaddliulangchongwupinglun";

	}

	// 定义yonghuupdateliulangchongwupinglun方法

	@RequestMapping(value = "yonghuupdateliulangchongwupinglun")

	public String yonghuupdateliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志LiulangchongwupinglunController.yonghuupdateliulangchongwupinglun

		logger.debug("LiulangchongwupinglunController.yonghuupdateliulangchongwupinglun ......");

		liulangchongwupinglunservice.yonghuupdateliulangchongwupinglun(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("yonghuupdateliulangchongwupinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuupdateliulangchongwupinglun页面

		return "yonghuupdateliulangchongwupinglun";

	}

	// 定义yonghuliulangchongwupinglunmanage方法

	@RequestMapping(value = "yonghuliulangchongwupinglunmanage")

	public String yonghuliulangchongwupinglunmanage(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, String backurl) {

		// 输出日志，表示当前正在执行方法LiulangchongwupinglunController.yonghuliulangchongwupinglunmanage

		logger.debug("LiulangchongwupinglunController.yonghuliulangchongwupinglunmanage ......");

		liulangchongwupinglunservice.yonghuliulangchongwupinglunmanage(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghuliulangchongwupinglunmanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuliulangchongwupinglunmanage页面

		return "yonghuliulangchongwupinglunmanage";

	}

	// 定义yonghuaddliulangchongwupinglunact，响应页面添加请求

	@RequestMapping(value = "yonghuaddliulangchongwupinglunact")

	public String yonghuaddliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, Liulangchongwupinglun liulangchongwupinglun, String backurl)
					throws IOException {

		// 输出日志，表示当前正在执行方法为LiulangchongwupinglunController.yonghuaddliulangchongwupinglunact

		logger.debug("LiulangchongwupinglunController.yonghuaddliulangchongwupinglunact ......");

		liulangchongwupinglunservice.yonghuaddliulangchongwupinglunact(request, session, liulangchongwupinglun); // 如果backurl不等于空
																													// 且
																													// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("yonghuaddliulangchongwupinglunact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到yonghuaddliulangchongwupinglun方法

		return "forward:/yonghuliulangchongwupinglunmanage.action";

	}

	// 定义addliulangchongwupinglunact方法

	@RequestMapping(value = "addliulangchongwupinglunact")

	public String addliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, Liulangchongwupinglun liulangchongwupinglun, String backurl)
					throws IOException {

		// 输出当前方法日志，表示正在执行LiulangchongwupinglunController.addliulangchongwupinglunact方法

		logger.debug("LiulangchongwupinglunController.addliulangchongwupinglunact ......");

		liulangchongwupinglunservice.addliulangchongwupinglunact(request, session, liulangchongwupinglun); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addliulangchongwupinglunact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addliulangchongwupinglun方法

		return "forward:/liulangchongwupinglunmanage.action";

	}

	// 定义liulangchongwupinglunmanage方法响应页面请求

	@RequestMapping(value = "liulangchongwupinglunmanage")

	public String liulangchongwupinglunmanage(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.liulangchongwupinglunmanage

		logger.debug("LiulangchongwupinglunController.liulangchongwupinglunmanage ......");

		liulangchongwupinglunservice.liulangchongwupinglunmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("liulangchongwupinglunmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到liulangchongwupinglunmanage页面

		return "liulangchongwupinglunmanage";

	}

	// 定义 liulangchongwupinglunview方法

	@RequestMapping(value = "liulangchongwupinglunview")

	public String liulangchongwupinglunview(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.liulangchongwupinglunview方法

		logger.debug("LiulangchongwupinglunController.liulangchongwupinglunview ......");

		liulangchongwupinglunservice.liulangchongwupinglunview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("liulangchongwupinglunview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwupinglunview页面

		return "liulangchongwupinglunview";

	}

	// 定义 updateliulangchongwupinglun方法

	@RequestMapping(value = "updateliulangchongwupinglun")

	public String updateliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志LiulangchongwupinglunController.updateliulangchongwupinglun，表示正在执行该方法

		logger.debug("LiulangchongwupinglunController.updateliulangchongwupinglun ......");

		liulangchongwupinglunservice.updateliulangchongwupinglun(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updateliulangchongwupinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updateliulangchongwupinglun页面

		return "updateliulangchongwupinglun";

	}

	// 定义updateliulangchongwupinglunact处理宠物评论修改

	@RequestMapping(value = "updateliulangchongwupinglunact")

	public String updateliulangchongwupinglunact(HttpServletRequest request, HttpServletResponse response,
			Liulangchongwupinglun liulangchongwupinglun, HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法LiulangchongwupinglunController.updateliulangchongwupinglunact

		logger.debug("LiulangchongwupinglunController.updateliulangchongwupinglunact ......");

		liulangchongwupinglunservice.updateliulangchongwupinglunact(request, liulangchongwupinglun, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updateliulangchongwupinglunact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwupinglunmanage.action方法

		return "forward:/liulangchongwupinglunmanage.action";

	}

	// 定义yonghuupdateliulangchongwupinglunact方法

	@RequestMapping(value = "yonghuupdateliulangchongwupinglunact")

	public String yonghuupdateliulangchongwupinglunact(HttpServletRequest request, HttpServletResponse response,
			Liulangchongwupinglun liulangchongwupinglun, HttpSession session, String backurl) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("LiulangchongwupinglunController.yonghuupdateliulangchongwupinglunact ......");

		liulangchongwupinglunservice.yonghuupdateliulangchongwupinglunact(request, liulangchongwupinglun, session);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("yonghuupdateliulangchongwupinglunact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuliulangchongwupinglunmanage.action方法

		return "forward:/yonghuliulangchongwupinglunmanage.action";

	}

	// 定义deleteliulangchongwupinglun,处理删除宠物评论

	@RequestMapping(value = "deleteliulangchongwupinglun")

	public String deleteliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.deleteliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunController.deleteliulangchongwupinglun ......");

		liulangchongwupinglunservice.deleteliulangchongwupinglun(request, session, id);

		if (backurl != null && backurl.indexOf("deleteliulangchongwupinglun.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwupinglunmanage.action方法

		return "forward:/liulangchongwupinglunmanage.action";

	}

	// 定义yonghudeleteliulangchongwupinglun方法

	@RequestMapping(value = "yonghudeleteliulangchongwupinglun")

	public String yonghudeleteliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.yonghudeleteliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunController.yonghudeleteliulangchongwupinglun ......");

		liulangchongwupinglunservice.yonghudeleteliulangchongwupinglun(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghudeleteliulangchongwupinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuliulangchongwupinglunmanage.action方法

		return "forward:/yonghuliulangchongwupinglunmanage.action";

	}

	// 定义searchliulangchongwupinglun方法，处理搜索操作

	@RequestMapping(value = "searchliulangchongwupinglun")

	public String searchliulangchongwupinglun(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, String search, String backurl) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.searchliulangchongwupinglun

		logger.debug("LiulangchongwupinglunController.searchliulangchongwupinglun ......");

		liulangchongwupinglunservice.searchliulangchongwupinglun(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchliulangchongwupinglun.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchliulangchongwupinglun";

	}

	// 定义LiulangchongwupinglunpinglunMapper

	@RequestMapping(value = "liulangchongwupinglundetails")

	public String liulangchongwupinglundetails(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, int id, String backurl) {

		// 输入日志信息，表名当前执行方法为LiulangchongwupinglunController.liulangchongwupinglundetails

		logger.debug("LiulangchongwupinglunController.liulangchongwupinglundetails ......");

		liulangchongwupinglunservice.liulangchongwupinglundetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("liulangchongwupinglundetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回liulangchongwupinglundetails

		return "liulangchongwupinglundetails";

	}

}
