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
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class YonghuService implements YonghuServiceImp {

	private static final Log logger = LogFactory.getLog(YonghuService.class);

	@Autowired
	private YonghuMapper yonghudao;

	// 定义方法addyonghu,响应控制层addyonghu请求

	public void addyonghu(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addyonghu

		logger.debug("YonghuService.addyonghu ......");

	}

	// 定义addyonghuact方法

	public void addyonghuact(HttpServletRequest request, HttpSession session, Yonghu yonghu) throws IOException {

		// 输出当前方法日志，表示正在执行YonghuService.addyonghuact方法

		logger.debug("YonghuService.addyonghuact ......");

		// 使用yonghudao的insert方法将用户添加到数据库中

		yonghudao.insert(yonghu);

		// 将添加用户信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加用户成功");

	}

	// 定义yonghumanage方法响应页面请求

	public void yonghumanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行YonghuService.yonghumanage

		logger.debug("YonghuService.yonghumanage ......");

		// 实例化YonghuExample类为example

		YonghuExample example = new YonghuExample();

		// 使用 yonghudao.selectByExample(example)方法获取所有的用户数据

		List yonghuall = yonghudao.selectByExample(example);

		// 将所有的用户数据保存到request中的yonghuall参数里

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义 yonghuview方法

	public void yonghuview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行YonghuService.yonghuview方法

		logger.debug("YonghuService.yonghuview ......");

		// 实例化YonghuExample类

		YonghuExample example = new YonghuExample();

		// 使用yonghudao的selectByExample方法查询用户信息

		List yonghuall = yonghudao.selectByExample(example);

		// 将查询的yonghuall保存到request中，记录为参数yonghuall

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义 updateyonghu方法

	public void updateyonghu(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志YonghuController.updateyonghu，表示正在执行该方法

		logger.debug("YonghuController.updateyonghu ......");

		// 定义用户为biaoming，使用 yonghudao的selectByPrimaryKey方法通过id查询数据

		Yonghu yonghu = yonghudao.selectByPrimaryKey(id);

		// 将查询的用户保存到request中

		request.setAttribute("yonghu", yonghu);

	}

	// 定义updateyonghuact处理用户修改

	public void updateyonghuact(HttpServletRequest request, Yonghu yonghu, HttpSession session) throws IOException {

		// 输出日志，表示正在执行当前方法YonghuController.updateyonghuact

		logger.debug("YonghuController.updateyonghuact ......");

		// 执行yonghudao的updateByPrimaryKeySelective方法，将传入的用户数据同步到数据库中

		yonghudao.updateByPrimaryKeySelective(yonghu);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改用户信息成功");

	}

	// 定义deleteyonghu,处理删除用户

	public void deleteyonghu(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行YonghuService.deleteyonghu方法

		logger.debug("YonghuService.deleteyonghu ......");

		// 根据id调用yonghudao的deleteByPrimaryKey方法，删除用户

		yonghudao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除用户成功");

	}

	// 定义searchyonghu方法，处理搜索操作

	public void searchyonghu(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行YonghuService.searchyonghu

		logger.debug("YonghuService.searchyonghu ......");

		// 实例化 YonghuExample

		YonghuExample example = new YonghuExample();

		// 实例化 YonghuExample的Criteria内部类

		YonghuExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andMingziLike("%" + search + "%");

		}

		// 查询用户结果

		List yonghuall = yonghudao.selectByExample(example);

		// 将查询到的用户 保存到request中进行保存

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义YonghupinglunMapper

	public void yonghudetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为YonghuController.yonghudetails

		logger.debug("YonghuController.yonghudetails ......");

		// 传入页面所传入的用户id使用yonghudao的selectByPrimaryKey方法进行查询

		Yonghu yonghu = yonghudao.selectByPrimaryKey(id);

		// 将查询到的用户保存到request中

		request.setAttribute("yonghu", yonghu);

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
