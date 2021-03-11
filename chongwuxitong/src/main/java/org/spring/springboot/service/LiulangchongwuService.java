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
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.LiulangchongwupinglunMapper;
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class LiulangchongwuService implements LiulangchongwuServiceImp {

	private static final Log logger = LogFactory.getLog(LiulangchongwuService.class);

	@Autowired
	private LiulangchongwuMapper liulangchongwudao;
	// 定义leibiedao参数

	@Autowired
	private LeibieMapper leibiedao; // 定义LiulangchongwupinglunMapper

	@Autowired
	private LiulangchongwupinglunMapper liulangchongwupinglundao;

	// 定义方法addliulangchongwu,响应控制层addliulangchongwu请求

	public void addliulangchongwu(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addliulangchongwu

		logger.debug("LiulangchongwuService.addliulangchongwu ......");

		// 定义 example1为 LeibieExample的实例

		LeibieExample example1 = new LeibieExample();

		// 定义leibieall的List使用 leibiedao的selectByExample方法查询所有流浪宠物数据

		List leibieall = leibiedao.selectByExample(example1);

		// 将上面查询到的流浪宠物数据保存到request中，返回页面

		request.setAttribute("leibieall", leibieall);

	}

	// 定义addliulangchongwuact方法

	public void addliulangchongwuact(HttpServletRequest request, HttpSession session, Liulangchongwu liulangchongwu,
			MultipartFile tupianfile) throws IOException {

		// 输出当前方法日志，表示正在执行LiulangchongwuService.addliulangchongwuact方法

		logger.debug("LiulangchongwuService.addliulangchongwuact ......");

		// 判断图片文件是否为空

		if (!tupianfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的图片文件上传到服务器，将返回的文件名保存到tupian参数中

			String tupian = uploadUtile(tupianfile, request);

			// 将liulangchongwu的图片设置为tupian的值

			liulangchongwu.setTupian(tupian);

		}

		// 使用liulangchongwudao的insert方法将流浪宠物添加到数据库中

		liulangchongwudao.insert(liulangchongwu);

		// 将添加流浪宠物信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加流浪宠物成功");

	}

	// 定义liulangchongwumanage方法响应页面请求

	public void liulangchongwumanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LiulangchongwuService.liulangchongwumanage

		logger.debug("LiulangchongwuService.liulangchongwumanage ......");

		// 实例化LiulangchongwuExample类为example

		LiulangchongwuExample example = new LiulangchongwuExample();

		// 使用 liulangchongwudao.selectByExample(example)方法获取所有的流浪宠物数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example);

		// 将所有的流浪宠物数据保存到request中的liulangchongwuall参数里

		request.setAttribute("liulangchongwuall", liulangchongwuall);

	}

	// 定义 liulangchongwuview方法

	public void liulangchongwuview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LiulangchongwuService.liulangchongwuview方法

		logger.debug("LiulangchongwuService.liulangchongwuview ......");

		// 实例化LiulangchongwuExample类

		LiulangchongwuExample example = new LiulangchongwuExample();

		// 使用liulangchongwudao的selectByExample方法查询流浪宠物信息

		List liulangchongwuall = liulangchongwudao.selectByExample(example);

		// 将查询的liulangchongwuall保存到request中，记录为参数liulangchongwuall

		request.setAttribute("liulangchongwuall", liulangchongwuall);

	}

	// 定义 updateliulangchongwu方法

	public void updateliulangchongwu(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LiulangchongwuController.updateliulangchongwu，表示正在执行该方法

		logger.debug("LiulangchongwuController.updateliulangchongwu ......");

		// 定义流浪宠物为biaoming，使用 liulangchongwudao的selectByPrimaryKey方法通过id查询数据

		Liulangchongwu liulangchongwu = liulangchongwudao.selectByPrimaryKey(id);

		// 定义 example1为 LeibieExample的实例

		LeibieExample example1 = new LeibieExample();

		// 定义leibieall的List使用 leibiedao的selectByExample方法查询所有流浪宠物数据

		List leibieall = leibiedao.selectByExample(example1);

		// 将上面查询到的流浪宠物数据保存到request中，返回页面

		request.setAttribute("leibieall", leibieall);

		// 将查询的流浪宠物保存到request中

		request.setAttribute("liulangchongwu", liulangchongwu);

	}

	// 定义updateliulangchongwuact处理流浪宠物修改

	public void updateliulangchongwuact(HttpServletRequest request, Liulangchongwu liulangchongwu, HttpSession session,
			MultipartFile tupianfile) throws IOException {

		// 输出日志，表示正在执行当前方法LiulangchongwuController.updateliulangchongwuact

		logger.debug("LiulangchongwuController.updateliulangchongwuact ......");

		// 判断图片文件是否为空

		if (!tupianfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的图片文件上传到服务器，将返回的文件名保存到tupian参数中

			String tupian = uploadUtile(tupianfile, request);

			// 将liulangchongwu的图片设置为tupian的值

			liulangchongwu.setTupian(tupian);

		}

		// 执行liulangchongwudao的updateByPrimaryKeySelective方法，将传入的流浪宠物数据同步到数据库中

		liulangchongwudao.updateByPrimaryKeySelective(liulangchongwu);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改流浪宠物信息成功");

	}

	// 定义deleteliulangchongwu,处理删除流浪宠物

	public void deleteliulangchongwu(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LiulangchongwuService.deleteliulangchongwu方法

		logger.debug("LiulangchongwuService.deleteliulangchongwu ......");

		// 根据id调用liulangchongwudao的deleteByPrimaryKey方法，删除流浪宠物

		liulangchongwudao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除流浪宠物成功");

	}

	// 定义searchliulangchongwu方法，处理搜索操作

	public void searchliulangchongwu(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行LiulangchongwuService.searchliulangchongwu

		logger.debug("LiulangchongwuService.searchliulangchongwu ......");

		// 实例化 LiulangchongwuExample

		LiulangchongwuExample example = new LiulangchongwuExample();

		// 实例化 LiulangchongwuExample的Criteria内部类

		LiulangchongwuExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andMingziLike("%" + search + "%");

		}

		// 查询流浪宠物结果

		List liulangchongwuall = liulangchongwudao.selectByExample(example);

		// 将查询到的流浪宠物 保存到request中进行保存

		request.setAttribute("liulangchongwuall", liulangchongwuall);

	}

	// 定义LiulangchongwupinglunMapper

	public void liulangchongwudetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为LiulangchongwuController.liulangchongwudetails

		logger.debug("LiulangchongwuController.liulangchongwudetails ......");

		// 传入页面所传入的流浪宠物id使用liulangchongwudao的selectByPrimaryKey方法进行查询

		Liulangchongwu liulangchongwu = liulangchongwudao.selectByPrimaryKey(id);

		// 将查询到的流浪宠物保存到request中

		request.setAttribute("liulangchongwu", liulangchongwu);

		// 实例化LiulangchongwupinglunExample

		LiulangchongwupinglunExample example = new LiulangchongwupinglunExample();
		LiulangchongwupinglunExample.Criteria criteria = example.createCriteria();
		criteria.andLiulangchongwuidEqualTo(id); // 使用liulangchongwupinglundao的selectByExample方法查询liulangchongwupinglunall

		List liulangchongwupinglunall = liulangchongwupinglundao.selectByExample(example);

		// 将liulangchongwupinglunall保存到request中

		request.setAttribute("liulangchongwupinglunall", liulangchongwupinglunall);

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
