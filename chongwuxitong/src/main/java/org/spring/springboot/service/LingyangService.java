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
import org.spring.springboot.dao.LingyangMapper;
import org.spring.springboot.dao.LiulangchongwuMapper;
import org.spring.springboot.dao.YonghuMapper;
import org.spring.springboot.domain.Lingyang;
import org.spring.springboot.domain.LingyangExample;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class LingyangService implements LingyangServiceImp {

	private static final Log logger = LogFactory.getLog(LingyangService.class);

	@Autowired
	private LingyangMapper lingyangdao;
	// 定义liulangchongwudao参数

	@Autowired
	private LiulangchongwuMapper liulangchongwudao;
	// 定义yonghudao参数

	@Autowired
	private YonghuMapper yonghudao;

	// 定义方法addlingyang,响应控制层addlingyang请求

	public void addlingyang(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addlingyang

		logger.debug("LingyangService.addlingyang ......");

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有领养数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有领养数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuaddlingyang方法，在领养控制层中调用

	public void yonghuaddlingyang(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LingyangService.yonghuaddlingyang方法

		logger.debug("LingyangService.yonghuaddlingyang ......");

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有领养数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有领养数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

	}

	// 定义yonghuupdatelingyang方法

	public void yonghuupdatelingyang(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LingyangService.yonghuupdatelingyang

		logger.debug("LingyangService.yonghuupdatelingyang ......");

		// 实例化领养,使用lingyangdao的selectByPrimaryKey方法通过id查询领养

		Lingyang lingyang = lingyangdao.selectByPrimaryKey(id);

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有领养数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有领养数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询出的领养信息保存到request中

		request.setAttribute("lingyang", lingyang);

	}

	// 定义yonghulingyangmanage方法

	public void yonghulingyangmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志 ，表示当前正在执行方法为LingyangService.yonghulingyangmanage

		logger.debug("LingyangService.yonghulingyangmanage ......");

		// 定义实体，从session中获取当前用户，赋值给

		Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");

		// 实例化领养类为example

		LingyangExample example = new LingyangExample();

		// 实例化领养Example类的criteria

		LingyangExample.Criteria criteria = example.createCriteria();

		// 通过 criteria设置查询条件Yonghuid为当前用户id

		criteria.andYonghuidEqualTo(yonghu.getId());

		// 使用 lingyangdao.selectByExample(example)方法查询所有yonghuid为当前用户id的领养

		List lingyangall = lingyangdao.selectByExample(example);

		// 将查询的领养数据保存到request中的 lingyangall参数中

		request.setAttribute("lingyangall", lingyangall);
	}

	// 定义yonghuaddlingyangact，响应页面添加请求

	public void yonghuaddlingyangact(HttpServletRequest request, HttpSession session, Lingyang lingyang)
			throws IOException {

		// 输出日志，表示当前正在执行方法为LingyangService.yonghuaddlingyangact

		logger.debug("LingyangService.yonghuaddlingyangact ......");

		Yonghu yonghu = (Yonghu) session.getAttribute("userinfo");
		Liulangchongwu liulangchongwu = liulangchongwudao.selectByPrimaryKey(lingyang.getLiulangchongwuid());

		lingyang.setYonghu(yonghu.getMingzi());
		lingyang.setYonghuid(yonghu.getId());
		lingyang.setLiulangchongwu(liulangchongwu.getMingzi());
		lingyang.setLiulangchongwuid(liulangchongwu.getId());

		// 使用mybatis逆向工程所提供的insert方法添加领养数据到数据库中

		lingyangdao.insert(lingyang);

		// 将添加领养成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "领养成功");

		liulangchongwu.setState("已领养");

		liulangchongwudao.updateByPrimaryKey(liulangchongwu);

	}

	// 定义addlingyangact方法

	public void addlingyangact(HttpServletRequest request, HttpSession session, Lingyang lingyang) throws IOException {

		// 输出当前方法日志，表示正在执行LingyangService.addlingyangact方法

		logger.debug("LingyangService.addlingyangact ......");

		// 使用lingyangdao的insert方法将领养添加到数据库中

		lingyangdao.insert(lingyang);

		// 将添加领养信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加领养成功");

	}

	// 定义lingyangmanage方法响应页面请求

	public void lingyangmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LingyangService.lingyangmanage

		logger.debug("LingyangService.lingyangmanage ......");

		// 实例化LingyangExample类为example

		LingyangExample example = new LingyangExample();

		// 使用 lingyangdao.selectByExample(example)方法获取所有的领养数据

		List lingyangall = lingyangdao.selectByExample(example);

		// 将所有的领养数据保存到request中的lingyangall参数里

		request.setAttribute("lingyangall", lingyangall);

	}

	// 定义 lingyangview方法

	public void lingyangview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行LingyangService.lingyangview方法

		logger.debug("LingyangService.lingyangview ......");

		// 实例化LingyangExample类

		LingyangExample example = new LingyangExample();

		// 使用lingyangdao的selectByExample方法查询领养信息

		List lingyangall = lingyangdao.selectByExample(example);

		// 将查询的lingyangall保存到request中，记录为参数lingyangall

		request.setAttribute("lingyangall", lingyangall);

	}

	// 定义 updatelingyang方法

	public void updatelingyang(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志LingyangController.updatelingyang，表示正在执行该方法

		logger.debug("LingyangController.updatelingyang ......");

		// 定义领养为biaoming，使用 lingyangdao的selectByPrimaryKey方法通过id查询数据

		Lingyang lingyang = lingyangdao.selectByPrimaryKey(id);

		// 定义 example1为 LiulangchongwuExample的实例

		LiulangchongwuExample example1 = new LiulangchongwuExample();

		// 定义liulangchongwuall的List使用
		// liulangchongwudao的selectByExample方法查询所有领养数据

		List liulangchongwuall = liulangchongwudao.selectByExample(example1);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("liulangchongwuall", liulangchongwuall);

		// 定义 example2为 YonghuExample的实例

		YonghuExample example2 = new YonghuExample();

		// 定义yonghuall的List使用 yonghudao的selectByExample方法查询所有领养数据

		List yonghuall = yonghudao.selectByExample(example2);

		// 将上面查询到的领养数据保存到request中，返回页面

		request.setAttribute("yonghuall", yonghuall);

		// 将查询的领养保存到request中

		request.setAttribute("lingyang", lingyang);

	}

	// 定义updatelingyangact处理领养修改

	public void updatelingyangact(HttpServletRequest request, Lingyang lingyang, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法LingyangController.updatelingyangact

		logger.debug("LingyangController.updatelingyangact ......");

		// 执行lingyangdao的updateByPrimaryKeySelective方法，将传入的领养数据同步到数据库中

		lingyangdao.updateByPrimaryKeySelective(lingyang);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改领养信息成功");

	}

	// 定义yonghuupdatelingyangact方法

	public void yonghuupdatelingyangact(HttpServletRequest request, Lingyang lingyang, HttpSession session)
			throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("LingyangService.yonghuupdatelingyangact ......");

		// 调用lingyangdao的updateByPrimaryKeySelective方法修改传入的lingyang

		lingyangdao.updateByPrimaryKeySelective(lingyang);

		request.setAttribute("message", "修改领养信息成功");

	}

	// 定义deletelingyang,处理删除领养

	public void deletelingyang(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LingyangService.deletelingyang方法

		logger.debug("LingyangService.deletelingyang ......");

		// 根据id调用lingyangdao的deleteByPrimaryKey方法，删除领养

		lingyangdao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除领养成功");

	}

	// 定义yonghudeletelingyang方法

	public void yonghudeletelingyang(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行LingyangController.yonghudeletelingyang方法

		logger.debug("LingyangController.yonghudeletelingyang ......");

		// 调用lingyangdao的deleteByPrimaryKey方法，传入id。删除id所对应的领养

		lingyangdao.deleteByPrimaryKey(id);

		// 将删除领养成功信息保存到request中

		request.setAttribute("message", "删除领养成功");

	}

	// 定义searchlingyang方法，处理搜索操作

	public void searchlingyang(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行LingyangService.searchlingyang

		logger.debug("LingyangService.searchlingyang ......");

		// 实例化 LingyangExample

		LingyangExample example = new LingyangExample();

		// 实例化 LingyangExample的Criteria内部类

		LingyangExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andLiulangchongwuLike("%" + search + "%");

		}

		// 查询领养结果

		List lingyangall = lingyangdao.selectByExample(example);

		// 将查询到的领养 保存到request中进行保存

		request.setAttribute("lingyangall", lingyangall);

	}

	// 定义LingyangpinglunMapper

	public void lingyangdetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为LingyangController.lingyangdetails

		logger.debug("LingyangController.lingyangdetails ......");

		// 传入页面所传入的领养id使用lingyangdao的selectByPrimaryKey方法进行查询

		Lingyang lingyang = lingyangdao.selectByPrimaryKey(id);

		// 将查询到的领养保存到request中

		request.setAttribute("lingyang", lingyang);

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
