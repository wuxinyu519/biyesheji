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
import org.spring.springboot.domain.Dongtaipinglun;
import org.spring.springboot.domain.DongtaipinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class DongtaipinglunService implements DongtaipinglunServiceImp {

	private static final Log logger = LogFactory.getLog(DongtaipinglunService.class);

	@Autowired
	private DongtaipinglunMapper dongtaipinglundao;
	// 定义dongtaidao参数

	@Autowired
	private DongtaiMapper dongtaidao;
	// 定义yonghudao参数

	@Autowired
	private YonghuMapper yonghudao;

	// 定义方法adddongtaipinglun,响应控制层adddongtaipinglun请求

	public void adddongtaipinglun(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为adddongtaipinglun

		logger.debug("DongtaipinglunService.adddongtaipinglun ......");

		// 定义 example1为 DongtaiExample的实例

		DongtaiExample example1 = new DongtaiExample();

		// 定义dongtaiall的List使用 dongtaidao的selectByExample方法查询所有动态回复数据

		List dongtaiall = dongtaidao.selectByExample(example1);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("dongtaiall", dongtaiall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态回复数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuadddongtaipinglun方法，在动态回复控制层中调用

	public void yonghuadddongtaipinglun(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaipinglunService.yonghuadddongtaipinglun方法

		logger.debug("DongtaipinglunService.yonghuadddongtaipinglun ......");

		// 定义 example1为 DongtaiExample的实例

		DongtaiExample example1 = new DongtaiExample();

		// 定义dongtaiall的List使用 dongtaidao的selectByExample方法查询所有动态回复数据

		List dongtaiall = dongtaidao.selectByExample(example1);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("dongtaiall", dongtaiall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态回复数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuupdatedongtaipinglun方法

	public void yonghuupdatedongtaipinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志DongtaipinglunService.yonghuupdatedongtaipinglun

		logger.debug("DongtaipinglunService.yonghuupdatedongtaipinglun ......");

		// 实例化动态回复,使用dongtaipinglundao的selectByPrimaryKey方法通过id查询动态回复

		Dongtaipinglun dongtaipinglun = dongtaipinglundao.selectByPrimaryKey(id);

		// 定义 example1为 DongtaiExample的实例

		DongtaiExample example1 = new DongtaiExample();

		// 定义dongtaiall的List使用 dongtaidao的selectByExample方法查询所有动态回复数据

		List dongtaiall = dongtaidao.selectByExample(example1);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("dongtaiall", dongtaiall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态回复数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询出的动态回复信息保存到request中

		request.setAttribute("dongtaipinglun", dongtaipinglun);

	}

	// 定义yonghudongtaipinglunmanage方法

	public void yonghudongtaipinglunmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行方法DongtaipinglunService.yonghudongtaipinglunmanage

		logger.debug("DongtaipinglunService.yonghudongtaipinglunmanage ......");

		// 实例化为yonghu,并从session中取出当前登录用户赋值，

		Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");

		// 实例化DongtaipinglunExample为example

		DongtaipinglunExample example = new DongtaipinglunExample();

		// 实例化DongtaipinglunExample的Criteria内部类为criteria

		DongtaipinglunExample.Criteria criteria = example.createCriteria();

		// 定义查询条件的pinglunrenid为当前登录用户id

		criteria.andPinglunrenidEqualTo(yonghu.getId());

		// 查询当前用户所有的 动态回复，保存到dongtaipinglunall中

		List dongtaipinglunall = dongtaipinglundao.selectByExample(example);

		// 将查询出的 动态回复保存到request中的dongtaipinglunall中

		request.setAttribute("dongtaipinglunall", dongtaipinglunall);

	}

	// 定义yonghuadddongtaipinglunact，响应页面添加请求

	public void yonghuadddongtaipinglunact(HttpServletRequest request, HttpSession session,
			Dongtaipinglun dongtaipinglun) throws IOException {

		// 输出日志，表示当前正在执行方法为DongtaipinglunService.yonghuadddongtaipinglunact

		logger.debug("DongtaipinglunService.yonghuadddongtaipinglunact ......");

		// 使用mybatis逆向工程所提供的insert方法添加动态回复数据到数据库中

		dongtaipinglundao.insert(dongtaipinglun);

		// 将添加动态回复成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "添加动态回复成功");

	}

	// 定义adddongtaipinglunact方法

	public void adddongtaipinglunact(HttpServletRequest request, HttpSession session, Dongtaipinglun dongtaipinglun)
			throws IOException {

		// 输出当前方法日志，表示正在执行DongtaipinglunService.adddongtaipinglunact方法

		logger.debug("DongtaipinglunService.adddongtaipinglunact ......");

		// 使用dongtaipinglundao的insert方法将动态回复添加到数据库中

		dongtaipinglundao.insert(dongtaipinglun);

		// 将添加动态回复信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加动态回复成功");

	}

	// 定义dongtaipinglunmanage方法响应页面请求

	public void dongtaipinglunmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaipinglunService.dongtaipinglunmanage

		logger.debug("DongtaipinglunService.dongtaipinglunmanage ......");

		// 实例化DongtaipinglunExample类为example

		DongtaipinglunExample example = new DongtaipinglunExample();

		// 使用 dongtaipinglundao.selectByExample(example)方法获取所有的动态回复数据

		List dongtaipinglunall = dongtaipinglundao.selectByExample(example);

		// 将所有的动态回复数据保存到request中的dongtaipinglunall参数里

		request.setAttribute("dongtaipinglunall", dongtaipinglunall);

	}

	// 定义 dongtaipinglunview方法

	public void dongtaipinglunview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行DongtaipinglunService.dongtaipinglunview方法

		logger.debug("DongtaipinglunService.dongtaipinglunview ......");

		// 实例化DongtaipinglunExample类

		DongtaipinglunExample example = new DongtaipinglunExample();

		// 使用dongtaipinglundao的selectByExample方法查询动态回复信息

		List dongtaipinglunall = dongtaipinglundao.selectByExample(example);

		// 将查询的dongtaipinglunall保存到request中，记录为参数dongtaipinglunall

		request.setAttribute("dongtaipinglunall", dongtaipinglunall);

	}

	// 定义 updatedongtaipinglun方法

	public void updatedongtaipinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志DongtaipinglunController.updatedongtaipinglun，表示正在执行该方法

		logger.debug("DongtaipinglunController.updatedongtaipinglun ......");

		// 定义动态回复为biaoming，使用 dongtaipinglundao的selectByPrimaryKey方法通过id查询数据

		Dongtaipinglun dongtaipinglun = dongtaipinglundao.selectByPrimaryKey(id);

		// 定义 example1为 DongtaiExample的实例

		DongtaiExample example1 = new DongtaiExample();

		// 定义dongtaiall的List使用 dongtaidao的selectByExample方法查询所有动态回复数据

		List dongtaiall = dongtaidao.selectByExample(example1);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("dongtaiall", dongtaiall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有动态回复数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的动态回复数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询的动态回复保存到request中

		request.setAttribute("dongtaipinglun", dongtaipinglun);

	}

	// 定义updatedongtaipinglunact处理动态回复修改

	public void updatedongtaipinglunact(HttpServletRequest request, Dongtaipinglun dongtaipinglun, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法DongtaipinglunController.updatedongtaipinglunact

		logger.debug("DongtaipinglunController.updatedongtaipinglunact ......");

		// 执行dongtaipinglundao的updateByPrimaryKeySelective方法，将传入的动态回复数据同步到数据库中

		dongtaipinglundao.updateByPrimaryKeySelective(dongtaipinglun);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改动态回复信息成功");

	}

	// 定义yonghuupdatedongtaipinglunact方法

	public void yonghuupdatedongtaipinglunact(HttpServletRequest request, Dongtaipinglun dongtaipinglun,
			HttpSession session) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("DongtaipinglunService.yonghuupdatedongtaipinglunact ......");

		// 调用dongtaipinglundao的updateByPrimaryKeySelective方法修改传入的dongtaipinglun

		dongtaipinglundao.updateByPrimaryKeySelective(dongtaipinglun);

		request.setAttribute("message", "修改动态回复信息成功");

	}

	// 定义deletedongtaipinglun,处理删除动态回复

	public void deletedongtaipinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行DongtaipinglunService.deletedongtaipinglun方法

		logger.debug("DongtaipinglunService.deletedongtaipinglun ......");

		// 根据id调用dongtaipinglundao的deleteByPrimaryKey方法，删除动态回复

		dongtaipinglundao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除动态回复成功");

	}

	// 定义yonghudeletedongtaipinglun方法

	public void yonghudeletedongtaipinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行DongtaipinglunController.yonghudeletedongtaipinglun方法

		logger.debug("DongtaipinglunController.yonghudeletedongtaipinglun ......");

		// 调用dongtaipinglundao的deleteByPrimaryKey方法，传入id。删除id所对应的动态回复

		dongtaipinglundao.deleteByPrimaryKey(id);

		// 将删除动态回复成功信息保存到request中

		request.setAttribute("message", "删除动态回复成功");

	}

	// 定义searchdongtaipinglun方法，处理搜索操作

	public void searchdongtaipinglun(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行DongtaipinglunService.searchdongtaipinglun

		logger.debug("DongtaipinglunService.searchdongtaipinglun ......");

		// 实例化 DongtaipinglunExample

		DongtaipinglunExample example = new DongtaipinglunExample();

		// 实例化 DongtaipinglunExample的Criteria内部类

		DongtaipinglunExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andDongtaiLike("%" + search + "%");

		}

		// 查询动态回复结果

		List dongtaipinglunall = dongtaipinglundao.selectByExample(example);

		// 将查询到的动态回复 保存到request中进行保存

		request.setAttribute("dongtaipinglunall", dongtaipinglunall);

	}

	// 定义DongtaipinglunpinglunMapper

	public void dongtaipinglundetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为DongtaipinglunController.dongtaipinglundetails

		logger.debug("DongtaipinglunController.dongtaipinglundetails ......");

		// 传入页面所传入的动态回复id使用dongtaipinglundao的selectByPrimaryKey方法进行查询

		Dongtaipinglun dongtaipinglun = dongtaipinglundao.selectByPrimaryKey(id);

		// 将查询到的动态回复保存到request中

		request.setAttribute("dongtaipinglun", dongtaipinglun);

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
