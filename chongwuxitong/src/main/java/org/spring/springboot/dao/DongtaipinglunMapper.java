package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Dongtaipinglun;
import org.spring.springboot.domain.DongtaipinglunExample;

public interface DongtaipinglunMapper {
	long countByExample(DongtaipinglunExample example);

	int deleteByExample(DongtaipinglunExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Dongtaipinglun record);

	int insertSelective(Dongtaipinglun record);

	List<Dongtaipinglun> selectByExample(DongtaipinglunExample example);

	Dongtaipinglun selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Dongtaipinglun record,
			@Param("example") DongtaipinglunExample example);

	int updateByExample(@Param("record") Dongtaipinglun record, @Param("example") DongtaipinglunExample example);

	int updateByPrimaryKeySelective(Dongtaipinglun record);

	int updateByPrimaryKey(Dongtaipinglun record);
}