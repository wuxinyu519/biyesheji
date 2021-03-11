package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Liulangchongwupinglun;
import org.spring.springboot.domain.LiulangchongwupinglunExample;

public interface LiulangchongwupinglunMapper {
	long countByExample(LiulangchongwupinglunExample example);

	int deleteByExample(LiulangchongwupinglunExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Liulangchongwupinglun record);

	int insertSelective(Liulangchongwupinglun record);

	List<Liulangchongwupinglun> selectByExample(LiulangchongwupinglunExample example);

	Liulangchongwupinglun selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Liulangchongwupinglun record,
			@Param("example") LiulangchongwupinglunExample example);

	int updateByExample(@Param("record") Liulangchongwupinglun record,
			@Param("example") LiulangchongwupinglunExample example);

	int updateByPrimaryKeySelective(Liulangchongwupinglun record);

	int updateByPrimaryKey(Liulangchongwupinglun record);
}