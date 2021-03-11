package org.spring.springboot.service;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

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
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class LeibieService implements LeibieServiceImp {

	private static final Log logger = LogFactory.getLog(LeibieService.class);

	@Autowired
	private LeibieMapper leibiedao;

	// 定义方法addleibie,响应控制层addleibie请求

	public void addleibie(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addleibie

		logger.debug("LeibieService.addleibie ......");

	}

	// 定义addleibieact方法

	public void addleibieact(HttpServletRequest request, HttpSession session, Leibie leibie) throws IOException {

		// 输出当前方法日志，表示正在执行LeibieService.addleibieact方法

		logger.debug("LeibieService.addleibieact ......");

		// 使用leibiedao的insert方法将类别添加到数据库中

		leibiedao.insert(leibie);

		// 将添加类别信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加类别成功");

	}

	// 定义leibiemanage方法响应页面请求

	public void leibiemanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LeibieService.leibiemanage

		logger.debug("LeibieService.leibiemanage ......");

		// 实例化LeibieExample类为example

		LeibieExample example = new LeibieExample();

		// 使用 leibiedao.selectByExample(example)方法获取所有的类别数据

		List leibieall = leibiedao.selectByExample(example);

		// 将所有的类别数据保存到request中的leibieall参数里

		request.setAttribute("leibieall", leibieall);

	}

	// 定义 leibieview方法

	public void leibieview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LeibieService.leibieview方法

		logger.debug("LeibieService.leibieview ......");

		// 实例化LeibieExample类

		LeibieExample example = new LeibieExample();

		// 使用leibiedao的selectByExample方法查询类别信息

		List leibieall = leibiedao.selectByExample(example);

		// 将查询的leibieall保存到request中，记录为参数leibieall

		request.setAttribute("leibieall", leibieall);

	}

	// 定义 updateleibie方法

	public void updateleibie(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LeibieController.updateleibie，表示正在执行该方法

		logger.debug("LeibieController.updateleibie ......");

		// 定义类别为biaoming，使用 leibiedao的selectByPrimaryKey方法通过id查询数据

		Leibie leibie = leibiedao.selectByPrimaryKey(id);

		// 将查询的类别保存到request中

		request.setAttribute("leibie", leibie);

	}

	// 定义updateleibieact处理类别修改

	public void updateleibieact(HttpServletRequest request, Leibie leibie, HttpSession session) throws IOException {

		// 输出日志，表示正在执行当前方法LeibieController.updateleibieact

		logger.debug("LeibieController.updateleibieact ......");

		// 执行leibiedao的updateByPrimaryKeySelective方法，将传入的类别数据同步到数据库中

		leibiedao.updateByPrimaryKeySelective(leibie);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改类别信息成功");

	}

	// 定义deleteleibie,处理删除类别

	public void deleteleibie(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LeibieService.deleteleibie方法

		logger.debug("LeibieService.deleteleibie ......");

		// 根据id调用leibiedao的deleteByPrimaryKey方法，删除类别

		leibiedao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除类别成功");

	}

	// 定义searchleibie方法，处理搜索操作

	public void searchleibie(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行LeibieService.searchleibie

		logger.debug("LeibieService.searchleibie ......");

		// 实例化 LeibieExample

		LeibieExample example = new LeibieExample();

		// 实例化 LeibieExample的Criteria内部类

		LeibieExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andMingchengLike("%" + search + "%");

		}

		// 查询类别结果

		List leibieall = leibiedao.selectByExample(example);

		// 将查询到的类别 保存到request中进行保存

		request.setAttribute("leibieall", leibieall);

	}

	// 定义LeibiepinglunMapper

	public void leibiedetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为LeibieController.leibiedetails

		logger.debug("LeibieController.leibiedetails ......");

		// 传入页面所传入的类别id使用leibiedao的selectByPrimaryKey方法进行查询

		Leibie leibie = leibiedao.selectByPrimaryKey(id);

		// 将查询到的类别保存到request中

		request.setAttribute("leibie", leibie);

	}

	// 上传文件图片等

	public String uploadUtile(MultipartFile file, HttpServletRequest request) throws IOException {

		// 根据当前时间生成时间字符串

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");

		String res = sdf.format(new Date());

		// uploads文件夹位置

		String rootPath = request.getSession().getServletContext().getRealPath("resource/uploads/");

		// 原始名称

		String originalFileName = file.getOriginalFilename();

		// 新文件名

		String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));

		// 创建年月文件夹

		Calendar date = Calendar.getInstance();

		File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));

		// 新文件

		File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);

		// 判断目标文件所在目录是否存在

		if (!newFile.getParentFile().exists()) {

			// 如果目标文件所在的目录不存在，则创建父目录

			newFile.getParentFile().mkdirs();

		}

		System.out.println(newFile);

		// 将内存中的数据写入磁盘

		file.transferTo(newFile);

		// 完整的url

		String fileUrl = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + newFileName;

		return fileUrl;

	}
}
