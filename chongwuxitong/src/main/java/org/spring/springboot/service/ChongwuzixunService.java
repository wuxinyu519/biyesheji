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
import org.spring.springboot.dao.ChongwuzixunMapper;
import org.spring.springboot.domain.Chongwuzixun;
import org.spring.springboot.domain.ChongwuzixunExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class ChongwuzixunService implements ChongwuzixunServiceImp {

	private static final Log logger = LogFactory.getLog(ChongwuzixunService.class);

	@Autowired
	private ChongwuzixunMapper chongwuzixundao;

	// 定义方法addchongwuzixun,响应控制层addchongwuzixun请求

	public void addchongwuzixun(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addchongwuzixun

		logger.debug("ChongwuzixunService.addchongwuzixun ......");

	}

	// 定义addchongwuzixunact方法

	public void addchongwuzixunact(HttpServletRequest request, HttpSession session, Chongwuzixun chongwuzixun,
			MultipartFile fengmianfile) throws IOException {

		// 输出当前方法日志，表示正在执行ChongwuzixunService.addchongwuzixunact方法

		logger.debug("ChongwuzixunService.addchongwuzixunact ......");

		// 判断封面文件是否为空

		if (!fengmianfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到fengmian参数中

			String fengmian = uploadUtile(fengmianfile, request);

			// 将chongwuzixun的封面设置为fengmian的值

			chongwuzixun.setFengmian(fengmian);

		}

		// 使用chongwuzixundao的insert方法将宠物资讯添加到数据库中

		chongwuzixundao.insert(chongwuzixun);

		// 将添加宠物资讯信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加宠物资讯成功");

	}

	// 定义chongwuzixunmanage方法响应页面请求

	public void chongwuzixunmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行ChongwuzixunService.chongwuzixunmanage

		logger.debug("ChongwuzixunService.chongwuzixunmanage ......");

		// 实例化ChongwuzixunExample类为example

		ChongwuzixunExample example = new ChongwuzixunExample();

		// 使用 chongwuzixundao.selectByExample(example)方法获取所有的宠物资讯数据

		List chongwuzixunall = chongwuzixundao.selectByExample(example);

		// 将所有的宠物资讯数据保存到request中的chongwuzixunall参数里

		request.setAttribute("chongwuzixunall", chongwuzixunall);

	}

	// 定义 chongwuzixunview方法

	public void chongwuzixunview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行ChongwuzixunService.chongwuzixunview方法

		logger.debug("ChongwuzixunService.chongwuzixunview ......");

		// 实例化ChongwuzixunExample类

		ChongwuzixunExample example = new ChongwuzixunExample();

		// 使用chongwuzixundao的selectByExample方法查询宠物资讯信息

		List chongwuzixunall = chongwuzixundao.selectByExample(example);

		// 将查询的chongwuzixunall保存到request中，记录为参数chongwuzixunall

		request.setAttribute("chongwuzixunall", chongwuzixunall);

	}

	// 定义 updatechongwuzixun方法

	public void updatechongwuzixun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志ChongwuzixunController.updatechongwuzixun，表示正在执行该方法

		logger.debug("ChongwuzixunController.updatechongwuzixun ......");

		// 定义宠物资讯为biaoming，使用 chongwuzixundao的selectByPrimaryKey方法通过id查询数据

		Chongwuzixun chongwuzixun = chongwuzixundao.selectByPrimaryKey(id);

		// 将查询的宠物资讯保存到request中

		request.setAttribute("chongwuzixun", chongwuzixun);

	}

	// 定义updatechongwuzixunact处理宠物资讯修改

	public void updatechongwuzixunact(HttpServletRequest request, Chongwuzixun chongwuzixun, HttpSession session,
			MultipartFile fengmianfile) throws IOException {

		// 输出日志，表示正在执行当前方法ChongwuzixunController.updatechongwuzixunact

		logger.debug("ChongwuzixunController.updatechongwuzixunact ......");

		// 判断封面文件是否为空

		if (!fengmianfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到fengmian参数中

			String fengmian = uploadUtile(fengmianfile, request);

			// 将chongwuzixun的封面设置为fengmian的值

			chongwuzixun.setFengmian(fengmian);

		}

		// 执行chongwuzixundao的updateByPrimaryKeySelective方法，将传入的宠物资讯数据同步到数据库中

		chongwuzixundao.updateByPrimaryKeySelective(chongwuzixun);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改宠物资讯信息成功");

	}

	// 定义deletechongwuzixun,处理删除宠物资讯

	public void deletechongwuzixun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行ChongwuzixunService.deletechongwuzixun方法

		logger.debug("ChongwuzixunService.deletechongwuzixun ......");

		// 根据id调用chongwuzixundao的deleteByPrimaryKey方法，删除宠物资讯

		chongwuzixundao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除宠物资讯成功");

	}

	// 定义searchchongwuzixun方法，处理搜索操作

	public void searchchongwuzixun(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行ChongwuzixunService.searchchongwuzixun

		logger.debug("ChongwuzixunService.searchchongwuzixun ......");

		// 实例化 ChongwuzixunExample

		ChongwuzixunExample example = new ChongwuzixunExample();

		// 实例化 ChongwuzixunExample的Criteria内部类

		ChongwuzixunExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andBiaotiLike("%" + search + "%");

		}

		// 查询宠物资讯结果

		List chongwuzixunall = chongwuzixundao.selectByExample(example);

		// 将查询到的宠物资讯 保存到request中进行保存

		request.setAttribute("chongwuzixunall", chongwuzixunall);

	}

	// 定义ChongwuzixunpinglunMapper

	public void chongwuzixundetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为ChongwuzixunController.chongwuzixundetails

		logger.debug("ChongwuzixunController.chongwuzixundetails ......");

		// 传入页面所传入的宠物资讯id使用chongwuzixundao的selectByPrimaryKey方法进行查询

		Chongwuzixun chongwuzixun = chongwuzixundao.selectByPrimaryKey(id);

		// 将查询到的宠物资讯保存到request中

		request.setAttribute("chongwuzixun", chongwuzixun);

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
