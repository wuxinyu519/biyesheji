package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Yonghu;
import org.spring.springboot.domain.YonghuExample;

public interface YonghuMapper {
	long countByExample(YonghuExample example);

	int deleteByExample(YonghuExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Yonghu record);

	int insertSelective(Yonghu record);

	List<Yonghu> selectByExample(YonghuExample example);

	Yonghu selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Yonghu record, @Param("example") YonghuExample example);

	int updateByExample(@Param("record") Yonghu record, @Param("example") YonghuExample example);

	int updateByPrimaryKeySelective(Yonghu record);

	int updateByPrimaryKey(Yonghu record);
}