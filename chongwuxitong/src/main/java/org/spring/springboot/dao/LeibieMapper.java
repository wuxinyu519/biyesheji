package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Leibie;
import org.spring.springboot.domain.LeibieExample;

public interface LeibieMapper {
	long countByExample(LeibieExample example);

	int deleteByExample(LeibieExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Leibie record);

	int insertSelective(Leibie record);

	List<Leibie> selectByExample(LeibieExample example);

	Leibie selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Leibie record, @Param("example") LeibieExample example);

	int updateByExample(@Param("record") Leibie record, @Param("example") LeibieExample example);

	int updateByPrimaryKeySelective(Leibie record);

	int updateByPrimaryKey(Leibie record);
}