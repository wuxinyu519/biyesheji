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
import org.spring.springboot.dao.XitongshuomingMapper;
import org.spring.springboot.domain.Xitongshuoming;
import org.spring.springboot.domain.XitongshuomingExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class XitongshuomingService implements XitongshuomingServiceImp {

	private static final Log logger = LogFactory.getLog(XitongshuomingService.class);

	@Autowired
	private XitongshuomingMapper xitongshuomingdao;

	// 定义方法addxitongshuoming,响应控制层addxitongshuoming请求

	public void addxitongshuoming(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addxitongshuoming

		logger.debug("XitongshuomingService.addxitongshuoming ......");

	}

	// 定义addxitongshuomingact方法

	public void addxitongshuomingact(HttpServletRequest request, HttpSession session, Xitongshuoming xitongshuoming)
			throws IOException {

		// 输出当前方法日志，表示正在执行XitongshuomingService.addxitongshuomingact方法

		logger.debug("XitongshuomingService.addxitongshuomingact ......");

		// 使用xitongshuomingdao的insert方法将系统说明添加到数据库中

		xitongshuomingdao.insert(xitongshuoming);

		// 将添加系统说明信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加系统说明成功");

	}

	// 定义xitongshuomingmanage方法响应页面请求

	public void xitongshuomingmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行XitongshuomingService.xitongshuomingmanage

		logger.debug("XitongshuomingService.xitongshuomingmanage ......");

		// 实例化XitongshuomingExample类为example

		XitongshuomingExample example = new XitongshuomingExample();

		// 使用 xitongshuomingdao.selectByExample(example)方法获取所有的系统说明数据

		List xitongshuomingall = xitongshuomingdao.selectByExample(example);

		// 将所有的系统说明数据保存到request中的xitongshuomingall参数里

		request.setAttribute("xitongshuomingall", xitongshuomingall);

	}

	// 定义 xitongshuomingview方法

	public void xitongshuomingview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行XitongshuomingService.xitongshuomingview方法

		logger.debug("XitongshuomingService.xitongshuomingview ......");

		// 实例化XitongshuomingExample类

		XitongshuomingExample example = new XitongshuomingExample();

		// 使用xitongshuomingdao的selectByExample方法查询系统说明信息

		List xitongshuomingall = xitongshuomingdao.selectByExample(example);

		// 将查询的xitongshuomingall保存到request中，记录为参数xitongshuomingall

		request.setAttribute("xitongshuomingall", xitongshuomingall);

	}

	// 定义 updatexitongshuoming方法

	public void updatexitongshuoming(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志XitongshuomingController.updatexitongshuoming，表示正在执行该方法

		logger.debug("XitongshuomingController.updatexitongshuoming ......");

		// 定义系统说明为biaoming，使用 xitongshuomingdao的selectByPrimaryKey方法通过id查询数据

		Xitongshuoming xitongshuoming = xitongshuomingdao.selectByPrimaryKey(id);

		// 将查询的系统说明保存到request中

		request.setAttribute("xitongshuoming", xitongshuoming);

	}

	// 定义updatexitongshuomingact处理系统说明修改

	public void updatexitongshuomingact(HttpServletRequest request, Xitongshuoming xitongshuoming, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法XitongshuomingController.updatexitongshuomingact

		logger.debug("XitongshuomingController.updatexitongshuomingact ......");

		// 执行xitongshuomingdao的updateByPrimaryKeySelective方法，将传入的系统说明数据同步到数据库中

		xitongshuomingdao.updateByPrimaryKeySelective(xitongshuoming);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改系统说明信息成功");

	}

	// 定义deletexitongshuoming,处理删除系统说明

	public void deletexitongshuoming(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行XitongshuomingService.deletexitongshuoming方法

		logger.debug("XitongshuomingService.deletexitongshuoming ......");

		// 根据id调用xitongshuomingdao的deleteByPrimaryKey方法，删除系统说明

		xitongshuomingdao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除系统说明成功");

	}

	// 定义searchxitongshuoming方法，处理搜索操作

	public void searchxitongshuoming(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行XitongshuomingService.searchxitongshuoming

		logger.debug("XitongshuomingService.searchxitongshuoming ......");

		// 实例化 XitongshuomingExample

		XitongshuomingExample example = new XitongshuomingExample();

		// 实例化 XitongshuomingExample的Criteria内部类

		XitongshuomingExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andBiaotiLike("%" + search + "%");

		}

		// 查询系统说明结果

		List xitongshuomingall = xitongshuomingdao.selectByExample(example);

		// 将查询到的系统说明 保存到request中进行保存

		request.setAttribute("xitongshuomingall", xitongshuomingall);

	}

	// 定义XitongshuomingpinglunMapper

	public void xitongshuomingdetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为XitongshuomingController.xitongshuomingdetails

		logger.debug("XitongshuomingController.xitongshuomingdetails ......");

		// 传入页面所传入的系统说明id使用xitongshuomingdao的selectByPrimaryKey方法进行查询

		Xitongshuoming xitongshuoming = xitongshuomingdao.selectByPrimaryKey(id);

		// 将查询到的系统说明保存到request中

		request.setAttribute("xitongshuoming", xitongshuoming);

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
