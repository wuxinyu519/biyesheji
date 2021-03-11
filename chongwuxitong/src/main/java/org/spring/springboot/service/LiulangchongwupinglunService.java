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
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.LiulangchongwupinglunMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Liulangchongwupinglun;
import org.spring.springboot.domain.LiulangchongwupinglunExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class LiulangchongwupinglunService implements LiulangchongwupinglunServiceImp {

	private static final Log logger = LogFactory.getLog(LiulangchongwupinglunService.class);

	@Autowired
	private LiulangchongwupinglunMapper liulangchongwupinglundao;
	// 定义liulangchongwudao参数

	@Autowired
	private LiulangchongwuMapper liulangchongwudao;
	// 定义yonghudao参数

	@Autowired
	private YonghuMapper yonghudao;

	// 定义方法addliulangchongwupinglun,响应控制层addliulangchongwupinglun请求

	public void addliulangchongwupinglun(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addliulangchongwupinglun

		logger.debug("LiulangchongwupinglunService.addliulangchongwupinglun ......");

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有宠物评论数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有宠物评论数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuaddliulangchongwupinglun方法，在宠物评论控制层中调用

	public void yonghuaddliulangchongwupinglun(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunService.yonghuaddliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunService.yonghuaddliulangchongwupinglun ......");

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有宠物评论数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有宠物评论数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuupdateliulangchongwupinglun方法

	public void yonghuupdateliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LiulangchongwupinglunService.yonghuupdateliulangchongwupinglun

		logger.debug("LiulangchongwupinglunService.yonghuupdateliulangchongwupinglun ......");

		// 实例化宠物评论,使用liulangchongwupinglundao的selectByPrimaryKey方法通过id查询宠物评论

		Liulangchongwupinglun liulangchongwupinglun = liulangchongwupinglundao.selectByPrimaryKey(id);

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有宠物评论数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有宠物评论数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询出的宠物评论信息保存到request中

		request.setAttribute("liulangchongwupinglun", liulangchongwupinglun);

	}

	// 定义yonghuliulangchongwupinglunmanage方法

	public void yonghuliulangchongwupinglunmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行方法LiulangchongwupinglunService.yonghuliulangchongwupinglunmanage

		logger.debug("LiulangchongwupinglunService.yonghuliulangchongwupinglunmanage ......");

		// 实例化为yonghu,并从session中取出当前登录用户赋值，

		Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");

		// 实例化LiulangchongwupinglunExample为example

		LiulangchongwupinglunExample example = new LiulangchongwupinglunExample();

		// 实例化LiulangchongwupinglunExample的Criteria内部类为criteria

		LiulangchongwupinglunExample.Criteria criteria = example.createCriteria();

		// 定义查询条件的pinglunrenid为当前登录用户id

		criteria.andPinglunrenidEqualTo(yonghu.getId());

		// 查询当前用户所有的 宠物评论，保存到liulangchongwupinglunall中

		List liulangchongwupinglunall = liulangchongwupinglundao.selectByExample(example);

		// 将查询出的 宠物评论保存到request中的liulangchongwupinglunall中

		request.setAttribute("liulangchongwupinglunall", liulangchongwupinglunall);

	}

	// 定义yonghuaddliulangchongwupinglunact，响应页面添加请求

	public void yonghuaddliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			Liulangchongwupinglun liulangchongwupinglun) throws IOException {

		// 输出日志，表示当前正在执行方法为LiulangchongwupinglunService.yonghuaddliulangchongwupinglunact

		logger.debug("LiulangchongwupinglunService.yonghuaddliulangchongwupinglunact ......");

		// 使用mybatis逆向工程所提供的insert方法添加宠物评论数据到数据库中

		liulangchongwupinglundao.insert(liulangchongwupinglun);

		// 将添加宠物评论成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "添加宠物评论成功");

	}

	// 定义addliulangchongwupinglunact方法

	public void addliulangchongwupinglunact(HttpServletRequest request, HttpSession session,
			Liulangchongwupinglun liulangchongwupinglun) throws IOException {

		// 输出当前方法日志，表示正在执行LiulangchongwupinglunService.addliulangchongwupinglunact方法

		logger.debug("LiulangchongwupinglunService.addliulangchongwupinglunact ......");

		// 使用liulangchongwupinglundao的insert方法将宠物评论添加到数据库中

		liulangchongwupinglundao.insert(liulangchongwupinglun);

		// 将添加宠物评论信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加宠物评论成功");

	}

	// 定义liulangchongwupinglunmanage方法响应页面请求

	public void liulangchongwupinglunmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunService.liulangchongwupinglunmanage

		logger.debug("LiulangchongwupinglunService.liulangchongwupinglunmanage ......");

		// 实例化LiulangchongwupinglunExample类为example

		LiulangchongwupinglunExample example = new LiulangchongwupinglunExample();

		// 使用 liulangchongwupinglundao.selectByExample(example)方法获取所有的宠物评论数据

		List liulangchongwupinglunall = liulangchongwupinglundao.selectByExample(example);

		// 将所有的宠物评论数据保存到request中的liulangchongwupinglunall参数里

		request.setAttribute("liulangchongwupinglunall", liulangchongwupinglunall);

	}

	// 定义 liulangchongwupinglunview方法

	public void liulangchongwupinglunview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunService.liulangchongwupinglunview方法

		logger.debug("LiulangchongwupinglunService.liulangchongwupinglunview ......");

		// 实例化LiulangchongwupinglunExample类

		LiulangchongwupinglunExample example = new LiulangchongwupinglunExample();

		// 使用liulangchongwupinglundao的selectByExample方法查询宠物评论信息

		List liulangchongwupinglunall = liulangchongwupinglundao.selectByExample(example);

		// 将查询的liulangchongwupinglunall保存到request中，记录为参数liulangchongwupinglunall

		request.setAttribute("liulangchongwupinglunall", liulangchongwupinglunall);

	}

	// 定义 updateliulangchongwupinglun方法

	public void updateliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LiulangchongwupinglunController.updateliulangchongwupinglun，表示正在执行该方法

		logger.debug("LiulangchongwupinglunController.updateliulangchongwupinglun ......");

		// 定义宠物评论为biaoming，使用
		// liulangchongwupinglundao的selectByPrimaryKey方法通过id查询数据

		Liulangchongwupinglun liulangchongwupinglun = liulangchongwupinglundao.selectByPrimaryKey(id);

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有宠物评论数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有宠物评论数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的宠物评论数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询的宠物评论保存到request中

		request.setAttribute("liulangchongwupinglun", liulangchongwupinglun);

	}

	// 定义updateliulangchongwupinglunact处理宠物评论修改

	public void updateliulangchongwupinglunact(HttpServletRequest request, Liulangchongwupinglun liulangchongwupinglun,
			HttpSession session) throws IOException {

		// 输出日志，表示正在执行当前方法LiulangchongwupinglunController.updateliulangchongwupinglunact

		logger.debug("LiulangchongwupinglunController.updateliulangchongwupinglunact ......");

		// 执行liulangchongwupinglundao的updateByPrimaryKeySelective方法，将传入的宠物评论数据同步到数据库中

		liulangchongwupinglundao.updateByPrimaryKeySelective(liulangchongwupinglun);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改宠物评论信息成功");

	}

	// 定义yonghuupdateliulangchongwupinglunact方法

	public void yonghuupdateliulangchongwupinglunact(HttpServletRequest request,
			Liulangchongwupinglun liulangchongwupinglun, HttpSession session) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("LiulangchongwupinglunService.yonghuupdateliulangchongwupinglunact ......");

		// 调用liulangchongwupinglundao的updateByPrimaryKeySelective方法修改传入的liulangchongwupinglun

		liulangchongwupinglundao.updateByPrimaryKeySelective(liulangchongwupinglun);

		request.setAttribute("message", "修改宠物评论信息成功");

	}

	// 定义deleteliulangchongwupinglun,处理删除宠物评论

	public void deleteliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunService.deleteliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunService.deleteliulangchongwupinglun ......");

		// 根据id调用liulangchongwupinglundao的deleteByPrimaryKey方法，删除宠物评论

		liulangchongwupinglundao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除宠物评论成功");

	}

	// 定义yonghudeleteliulangchongwupinglun方法

	public void yonghudeleteliulangchongwupinglun(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunController.yonghudeleteliulangchongwupinglun方法

		logger.debug("LiulangchongwupinglunController.yonghudeleteliulangchongwupinglun ......");

		// 调用liulangchongwupinglundao的deleteByPrimaryKey方法，传入id。删除id所对应的宠物评论

		liulangchongwupinglundao.deleteByPrimaryKey(id);

		// 将删除宠物评论成功信息保存到request中

		request.setAttribute("message", "删除宠物评论成功");

	}

	// 定义searchliulangchongwupinglun方法，处理搜索操作

	public void searchliulangchongwupinglun(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行LiulangchongwupinglunService.searchliulangchongwupinglun

		logger.debug("LiulangchongwupinglunService.searchliulangchongwupinglun ......");

		// 实例化 LiulangchongwupinglunExample

		LiulangchongwupinglunExample example = new LiulangchongwupinglunExample();

		// 实例化 LiulangchongwupinglunExample的Criteria内部类

		LiulangchongwupinglunExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andLiulangchongwuLike("%" + search + "%");

		}

		// 查询宠物评论结果

		List liulangchongwupinglunall = liulangchongwupinglundao.selectByExample(example);

		// 将查询到的宠物评论 保存到request中进行保存

		request.setAttribute("liulangchongwupinglunall", liulangchongwupinglunall);

	}

	// 定义LiulangchongwupinglunpinglunMapper

	public void liulangchongwupinglundetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为LiulangchongwupinglunController.liulangchongwupinglundetails

		logger.debug("LiulangchongwupinglunController.liulangchongwupinglundetails ......");

		// 传入页面所传入的宠物评论id使用liulangchongwupinglundao的selectByPrimaryKey方法进行查询

		Liulangchongwupinglun liulangchongwupinglun = liulangchongwupinglundao.selectByPrimaryKey(id);

		// 将查询到的宠物评论保存到request中

		request.setAttribute("liulangchongwupinglun", liulangchongwupinglun);

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
