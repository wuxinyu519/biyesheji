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
import org.spring.springboot.dao.DongtaiMapper;
import org.spring.springboot.dao.DongtaipinglunMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Dongtai;
import org.spring.springboot.domain.DongtaiExample;
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class DongtaiService implements DongtaiServiceImp {

	private static final Log logger = LogFactory.getLog(DongtaiService.class);

	@Autowired
	private DongtaiMapper dongtaidao;
	// 定义yonghudao参数

	@Autowired
	private YonghuMapper yonghudao; // 定义DongtaipinglunMapper

	@Autowired
	private DongtaipinglunMapper dongtaipinglundao;

	// 定义方法adddongtai,响应控制层adddongtai请求

	public void adddongtai(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为adddongtai

		logger.debug("DongtaiService.adddongtai ......");

		// 定义 example1为 YonghuExample的实例

		YonghuExample example1 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态数据

		List yonghuall = yonghudao.selectByExample(example1);

		// 将上面查询到的动态数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuadddongtai方法，在动态控制层中调用

	public void yonghuadddongtai(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaiService.yonghuadddongtai方法

		logger.debug("DongtaiService.yonghuadddongtai ......");

		// 定义 example1为 YonghuExample的实例

		YonghuExample example1 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态数据

		List yonghuall = yonghudao.selectByExample(example1);

		// 将上面查询到的动态数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuupdatedongtai方法

	public void yonghuupdatedongtai(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志DongtaiService.yonghuupdatedongtai

		logger.debug("DongtaiService.yonghuupdatedongtai ......");

		// 实例化动态,使用dongtaidao的selectByPrimaryKey方法通过id查询动态

		Dongtai dongtai = dongtaidao.selectByPrimaryKey(id);

		// 定义 example1为 YonghuExample的实例

		YonghuExample example1 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态数据

		List yonghuall = yonghudao.selectByExample(example1);

		// 将上面查询到的动态数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询出的动态信息保存到request中

		request.setAttribute("dongtai", dongtai);

	}

	// 定义yonghudongtaimanage方法

	public void yonghudongtaimanage(HttpServletRequest request, HttpSession session) {

		// 输出日志 ，表示当前正在执行方法为DongtaiService.yonghudongtaimanage

		logger.debug("DongtaiService.yonghudongtaimanage ......");

		// 定义实体，从session中获取当前用户，赋值给

		Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");

		// 实例化动态类为example

		DongtaiExample example = new DongtaiExample();

		// 实例化动态Example类的criteria

		DongtaiExample.Criteria criteria = example.createCriteria();

		// 通过 criteria设置查询条件Yonghuid为当前用户id

		criteria.andYonghuidEqualTo(yonghu.getId());

		// 使用 dongtaidao.selectByExample(example)方法查询所有yonghuid为当前用户id的动态

		List dongtaiall = dongtaidao.selectByExample(example);

		// 将查询的动态数据保存到request中的 dongtaiall参数中

		request.setAttribute("dongtaiall", dongtaiall);
	}

	// 定义yonghuadddongtaiact，响应页面添加请求

	public void yonghuadddongtaiact(HttpServletRequest request, HttpSession session, Dongtai dongtai,
			MultipartFile picfile) throws IOException {

		// 输出日志，表示当前正在执行方法为DongtaiService.yonghuadddongtaiact

		logger.debug("DongtaiService.yonghuadddongtaiact ......");

		// 判断封面文件是否为空

		if (!picfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到pic参数中

			String pic = uploadUtile(picfile, request);

			// 将dongtai的封面设置为pic的值

			dongtai.setPic(pic);

		}

		// 使用mybatis逆向工程所提供的insert方法添加动态数据到数据库中

		dongtaidao.insert(dongtai);

		// 将添加动态成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "添加动态成功");

	}

	// 定义adddongtaiact方法

	public void adddongtaiact(HttpServletRequest request, HttpSession session, Dongtai dongtai, MultipartFile picfile)
			throws IOException {

		// 输出当前方法日志，表示正在执行DongtaiService.adddongtaiact方法

		logger.debug("DongtaiService.adddongtaiact ......");

		// 判断封面文件是否为空

		if (!picfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到pic参数中

			String pic = uploadUtile(picfile, request);

			// 将dongtai的封面设置为pic的值

			dongtai.setPic(pic);

		}

		// 使用dongtaidao的insert方法将动态添加到数据库中

		dongtaidao.insert(dongtai);

		// 将添加动态信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加动态成功");

	}

	// 定义dongtaimanage方法响应页面请求

	public void dongtaimanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaiService.dongtaimanage

		logger.debug("DongtaiService.dongtaimanage ......");

		// 实例化DongtaiExample类为example

		DongtaiExample example = new DongtaiExample();

		// 使用 dongtaidao.selectByExample(example)方法获取所有的动态数据

		List dongtaiall = dongtaidao.selectByExample(example);

		// 将所有的动态数据保存到request中的dongtaiall参数里

		request.setAttribute("dongtaiall", dongtaiall);

	}

	// 定义 dongtaiview方法

	public void dongtaiview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaiService.dongtaiview方法

		logger.debug("DongtaiService.dongtaiview ......");

		// 实例化DongtaiExample类

		DongtaiExample example = new DongtaiExample();

		// 使用dongtaidao的selectByExample方法查询动态信息

		List dongtaiall = dongtaidao.selectByExample(example);

		// 将查询的dongtaiall保存到request中，记录为参数dongtaiall

		request.setAttribute("dongtaiall", dongtaiall);

	}

	// 定义 updatedongtai方法

	public void updatedongtai(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志DongtaiController.updatedongtai，表示正在执行该方法

		logger.debug("DongtaiController.updatedongtai ......");

		// 定义动态为biaoming，使用 dongtaidao的selectByPrimaryKey方法通过id查询数据

		Dongtai dongtai = dongtaidao.selectByPrimaryKey(id);

		// 定义 example1为 YonghuExample的实例

		YonghuExample example1 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态数据

		List yonghuall = yonghudao.selectByExample(example1);

		// 将上面查询到的动态数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询的动态保存到request中

		request.setAttribute("dongtai", dongtai);

	}

	// 定义updatedongtaiact处理动态修改

	public void updatedongtaiact(HttpServletRequest request, Dongtai dongtai, HttpSession session,
			MultipartFile picfile) throws IOException {

		// 输出日志，表示正在执行当前方法DongtaiController.updatedongtaiact

		logger.debug("DongtaiController.updatedongtaiact ......");

		// 判断封面文件是否为空

		if (!picfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到pic参数中

			String pic = uploadUtile(picfile, request);

			// 将dongtai的封面设置为pic的值

			dongtai.setPic(pic);

		}

		// 执行dongtaidao的updateByPrimaryKeySelective方法，将传入的动态数据同步到数据库中

		dongtaidao.updateByPrimaryKeySelective(dongtai);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改动态信息成功");

	}

	// 定义yonghuupdatedongtaiact方法

	public void yonghuupdatedongtaiact(HttpServletRequest request, Dongtai dongtai, HttpSession session,
			MultipartFile picfile) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("DongtaiService.yonghuupdatedongtaiact ......");

		// 判断封面文件是否为空

		if (!picfile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的封面文件上传到服务器，将返回的文件名保存到pic参数中

			String pic = uploadUtile(picfile, request);

			// 将dongtai的封面设置为pic的值

			dongtai.setPic(pic);

		}

		// 调用dongtaidao的updateByPrimaryKeySelective方法修改传入的dongtai

		dongtaidao.updateByPrimaryKeySelective(dongtai);

		request.setAttribute("message", "修改动态信息成功");

	}

	// 定义deletedongtai,处理删除动态

	public void deletedongtai(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行DongtaiService.deletedongtai方法

		logger.debug("DongtaiService.deletedongtai ......");

		// 根据id调用dongtaidao的deleteByPrimaryKey方法，删除动态

		dongtaidao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除动态成功");

	}

	// 定义yonghudeletedongtai方法

	public void yonghudeletedongtai(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行DongtaiController.yonghudeletedongtai方法

		logger.debug("DongtaiController.yonghudeletedongtai ......");

		// 调用dongtaidao的deleteByPrimaryKey方法，传入id。删除id所对应的动态

		dongtaidao.deleteByPrimaryKey(id);

		// 将删除动态成功信息保存到request中

		request.setAttribute("message", "删除动态成功");

	}

	// 定义searchdongtai方法，处理搜索操作

	public void searchdongtai(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行DongtaiService.searchdongtai

		logger.debug("DongtaiService.searchdongtai ......");

		// 实例化 DongtaiExample

		DongtaiExample example = new DongtaiExample();

		// 实例化 DongtaiExample的Criteria内部类

		DongtaiExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andBiaotiLike("%" + search + "%");

		}

		// 查询动态结果

		List dongtaiall = dongtaidao.selectByExample(example);

		// 将查询到的动态 保存到request中进行保存

		request.setAttribute("dongtaiall", dongtaiall);

	}

	// 定义DongtaipinglunMapper

	public void dongtaidetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为DongtaiController.dongtaidetails

		logger.debug("DongtaiController.dongtaidetails ......");

		// 传入页面所传入的动态id使用dongtaidao的selectByPrimaryKey方法进行查询

		Dongtai dongtai = dongtaidao.selectByPrimaryKey(id);

		// 将查询到的动态保存到request中

		request.setAttribute("dongtai", dongtai);

		// 实例化DongtaipinglunExample

		DongtaipinglunExample example = new DongtaipinglunExample();
		DongtaipinglunExample.Criteria criteria = example.createCriteria();
		criteria.andDongtaiidEqualTo(id); // 使用dongtaipinglundao的selectByExample方法查询dongtaipinglunall

		List dongtaipinglunall = dongtaipinglundao.selectByExample(example);

		// 将dongtaipinglunall保存到request中

		request.setAttribute("dongtaipinglunall", dongtaipinglunall);

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
