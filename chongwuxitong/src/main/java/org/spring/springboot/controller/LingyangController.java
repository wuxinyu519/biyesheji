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
import org.spring.springboot.domain.Lingyang;
import org.spring.springboot.domain.LingyangExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.spring.springboot.service.LingyangServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class LingyangController {

	private static final Log logger = LogFactory.getLog(LingyangController.class);

	@Autowired
	private LingyangServiceImp lingyangservice;

	// 定义方法addlingyang,响应页面addlingyang请求

	@RequestMapping(value = "addlingyang")

	public String addlingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addlingyang

		logger.debug("LingyangController.addlingyang ......");

		lingyangservice.addlingyang(request, session);

		// 若返回地址不等于空且不等于addlingyang.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addlingyang.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addlingyang页面

		return "addlingyang";

	}

	// 定义yonghuaddlingyang方法

	@RequestMapping(value = "yonghuaddlingyang")

	public String yonghuaddlingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，表示当前正在执行LingyangController.yonghuaddlingyang方法

		logger.debug("LingyangController.yonghuaddlingyang ......");

		lingyangservice.yonghuaddlingyang(request, session);

		// 若返回地址不等于空且不等于addlingyang.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("yonghuaddlingyang.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回addlingyang页面

		return "yonghuaddlingyang";

	}

	// 定义yonghuupdatelingyang方法

	@RequestMapping(value = "yonghuupdatelingyang")

	public String yonghuupdatelingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志LingyangController.yonghuupdatelingyang

		logger.debug("LingyangController.yonghuupdatelingyang ......");

		lingyangservice.yonghuupdatelingyang(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("yonghuupdatelingyang.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghuupdatelingyang页面

		return "yonghuupdatelingyang";

	}

	// 定义yonghulingyangmanage方法

	@RequestMapping(value = "yonghulingyangmanage")

	public String yonghulingyangmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志 ，表示当前正在执行方法为LingyangController.yonghulingyangmanage

		logger.debug("LingyangController.yonghulingyangmanage ......");

		lingyangservice.yonghulingyangmanage(request, session); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("yonghulingyangmanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		} // 返回yonghulingyangmanage方法

		return "yonghulingyangmanage";

	}

	// 定义yonghuaddlingyangact，响应页面添加请求

	@RequestMapping(value = "yonghuaddlingyangact")

	public String yonghuaddlingyangact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Lingyang lingyang, String backurl) throws IOException {

		// 输出日志，表示当前正在执行方法为LingyangController.yonghuaddlingyangact

		logger.debug("LingyangController.yonghuaddlingyangact ......");

		lingyangservice.yonghuaddlingyangact(request, session, lingyang); // 如果backurl不等于空
																			// 且
																			// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("yonghuaddlingyangact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到yonghuaddlingyang方法

		return "forward:/yonghulingyangmanage.action";

	}

	// 定义addlingyangact方法

	@RequestMapping(value = "addlingyangact")

	public String addlingyangact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Lingyang lingyang, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行LingyangController.addlingyangact方法

		logger.debug("LingyangController.addlingyangact ......");

		lingyangservice.addlingyangact(request, session, lingyang); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addlingyangact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addlingyang方法

		return "forward:/lingyangmanage.action";

	}

	// 定义lingyangmanage方法响应页面请求

	@RequestMapping(value = "lingyangmanage")

	public String lingyangmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LingyangController.lingyangmanage

		logger.debug("LingyangController.lingyangmanage ......");

		lingyangservice.lingyangmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("lingyangmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到lingyangmanage页面

		return "lingyangmanage";

	}

	// 定义 lingyangview方法

	@RequestMapping(value = "lingyangview")

	public String lingyangview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行LingyangController.lingyangview方法

		logger.debug("LingyangController.lingyangview ......");

		lingyangservice.lingyangview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("lingyangview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回lingyangview页面

		return "lingyangview";

	}

	// 定义 updatelingyang方法

	@RequestMapping(value = "updatelingyang")

	public String updatelingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志LingyangController.updatelingyang，表示正在执行该方法

		logger.debug("LingyangController.updatelingyang ......");

		lingyangservice.updatelingyang(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatelingyang.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatelingyang页面

		return "updatelingyang";

	}

	// 定义updatelingyangact处理领养修改

	@RequestMapping(value = "updatelingyangact")

	public String updatelingyangact(HttpServletRequest request, HttpServletResponse response, Lingyang lingyang,
			HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法LingyangController.updatelingyangact

		logger.debug("LingyangController.updatelingyangact ......");

		lingyangservice.updatelingyangact(request, lingyang, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatelingyangact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回lingyangmanage.action方法

		return "forward:/lingyangmanage.action";

	}

	// 定义yonghuupdatelingyangact方法

	@RequestMapping(value = "yonghuupdatelingyangact")

	public String yonghuupdatelingyangact(HttpServletRequest request, HttpServletResponse response, Lingyang lingyang,
			HttpSession session, String backurl) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("LingyangController.yonghuupdatelingyangact ......");

		lingyangservice.yonghuupdatelingyangact(request, lingyang, session);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("yonghuupdatelingyangact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghulingyangmanage.action方法

		return "forward:/yonghulingyangmanage.action";

	}

	// 定义deletelingyang,处理删除领养

	@RequestMapping(value = "deletelingyang")

	public String deletelingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行LingyangController.deletelingyang方法

		logger.debug("LingyangController.deletelingyang ......");

		lingyangservice.deletelingyang(request, session, id);

		if (backurl != null && backurl.indexOf("deletelingyang.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回lingyangmanage.action方法

		return "forward:/lingyangmanage.action";

	}

	// 定义yonghudeletelingyang方法

	@RequestMapping(value = "yonghudeletelingyang")

	public String yonghudeletelingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行LingyangController.yonghudeletelingyang方法

		logger.debug("LingyangController.yonghudeletelingyang ......");

		lingyangservice.yonghudeletelingyang(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("yonghudeletelingyang.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回yonghulingyangmanage.action方法

		return "forward:/yonghulingyangmanage.action";

	}

	// 定义searchlingyang方法，处理搜索操作

	@RequestMapping(value = "searchlingyang")

	public String searchlingyang(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行LingyangController.searchlingyang

		logger.debug("LingyangController.searchlingyang ......");

		lingyangservice.searchlingyang(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchlingyang.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchlingyang";

	}

	// 定义LingyangpinglunMapper

	@RequestMapping(value = "lingyangdetails")

	public String lingyangdetails(HttpServletRequest request, HttpSession session, HttpServletResponse response, int id,
			String backurl) {

		// 输入日志信息，表名当前执行方法为LingyangController.lingyangdetails

		logger.debug("LingyangController.lingyangdetails ......");

		lingyangservice.lingyangdetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("lingyangdetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回lingyangdetails

		return "lingyangdetails";

	}

}
