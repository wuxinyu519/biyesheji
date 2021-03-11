package org.spring.springboot.controller;

import java.io.File;

import java.io.IOException;

import java.text.SimpleDateFormat;

import org.spring.springboot.dao.ChongwuzixunMapper;
import org.spring.springboot.dao.DongtaiMapper;
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.domain.ChongwuzixunExample;
import org.spring.springboot.domain.DongtaiExample;
import org.spring.springboot.domain.LiulangchongwuExample;

import java.util.Calendar;

import java.util.Collections;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import java.util.Map;

import java.util.HashMap;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class IndexController {

	private static final Log logger = LogFactory.getLog(IndexController.class);

	@Autowired
	private LiulangchongwuMapper liulangchongwudao;

	@Autowired
	private ChongwuzixunMapper chongwuzixundao;

	@Autowired
	private DongtaiMapper dongtaidao;

	@RequestMapping(value = "index")

	public String index(HttpServletRequest request, HttpServletResponse response, HttpSession session, String backurl) {

		logger.debug("AdminController.index ......");// 实例化LiulangchongwuExample
		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 实例化LiulangchongwuExample内部类Criteria
		LiulangchongwuExample.Criteria criteria1 = example1.createCriteria();

		// 查询所有流浪宠物保存到liulangchongwuall1中
		List liulangchongwuall1 = liulangchongwudao.selectByExample(example1);

		// 定义最新流浪宠物list
		List liulangchongwuzuixin3 = null;

		// 如果所有的流浪宠物数量大于了 3
		if (liulangchongwuall1.size() > 3) {

			// 截取liulangchongwuall1中的前3位保存到最新流浪宠物list中
			liulangchongwuzuixin3 = liulangchongwuall1.subList(liulangchongwuall1.size() - 4,
					liulangchongwuall1.size() - 1);

		} else {

			// 将所有流浪宠物添加到最新流浪宠物list中
			liulangchongwuzuixin3 = liulangchongwuall1;

		}

		// 将最新流浪宠物list保存到request中
		request.setAttribute("liulangchongwuzuixin3", liulangchongwuzuixin3);

		// 实例化ChongwuzixunExample
		ChongwuzixunExample example2 = new ChongwuzixunExample();

		// 实例化ChongwuzixunExample内部类Criteria
		ChongwuzixunExample.Criteria criteria2 = example2.createCriteria();

		// 查询所有宠物资讯保存到chongwuzixunall2中
		List chongwuzixunall2 = chongwuzixundao.selectByExample(example2);

		// 定义最新宠物资讯list
		List chongwuzixunzuixin3 = null;

		// 如果所有的宠物资讯数量大于了 3
		if (chongwuzixunall2.size() > 3) {

			// 截取chongwuzixunall2中的前3位保存到最新宠物资讯list中
			chongwuzixunzuixin3 = chongwuzixunall2.subList(chongwuzixunall2.size() - 4, chongwuzixunall2.size() - 1);

		} else {

			// 将所有宠物资讯添加到最新宠物资讯list中
			chongwuzixunzuixin3 = chongwuzixunall2;

		}

		// 将最新宠物资讯list保存到request中
		request.setAttribute("chongwuzixunzuixin3", chongwuzixunzuixin3);

		// 实例化DongtaiExample
		DongtaiExample example3 = new DongtaiExample();

		// 实例化DongtaiExample内部类Criteria
		DongtaiExample.Criteria criteria3 = example3.createCriteria();

		// 查询所有动态保存到dongtaiall3中
		List dongtaiall3 = dongtaidao.selectByExample(example3);

		// 定义最新动态list
		List dongtaizuixin3 = null;

		// 如果所有的动态数量大于了 3
		if (dongtaiall3.size() > 3) {

			// 截取dongtaiall3中的前3位保存到最新动态list中
			dongtaizuixin3 = dongtaiall3.subList(dongtaiall3.size() - 4, dongtaiall3.size() - 1);

		} else {

			// 将所有动态添加到最新动态list中
			dongtaizuixin3 = dongtaiall3;

		}

		// 将最新动态list保存到request中
		request.setAttribute("dongtaizuixin3", dongtaizuixin3);

		if (backurl != null && backurl.indexOf("index.action") == -1) {

			return "forward:/" + backurl;

		}

		return "index";

	}

	// 上传文件图片等

	public String uploadUtile(MultipartFile file, HttpServletRequest request) throws IOException {

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
