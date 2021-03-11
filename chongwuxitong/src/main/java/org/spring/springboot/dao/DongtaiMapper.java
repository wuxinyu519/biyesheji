package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Dongtai;
import org.spring.springboot.domain.DongtaiExample;

public interface DongtaiMapper {
	long countByExample(DongtaiExample example);

	int deleteByExample(DongtaiExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Dongtai record);

	int insertSelective(Dongtai record);

	List<Dongtai> selectByExample(DongtaiExample example);

	Dongtai selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Dongtai record, @Param("example") DongtaiExample example);

	int updateByExample(@Param("record") Dongtai record, @Param("example") DongtaiExample example);

	int updateByPrimaryKeySelective(Dongtai record);

	int updateByPrimaryKey(Dongtai record);
}