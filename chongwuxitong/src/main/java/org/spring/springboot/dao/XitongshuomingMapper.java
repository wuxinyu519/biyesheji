package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Xitongshuoming;
import org.spring.springboot.domain.XitongshuomingExample;

public interface XitongshuomingMapper {
	long countByExample(XitongshuomingExample example);

	int deleteByExample(XitongshuomingExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Xitongshuoming record);

	int insertSelective(Xitongshuoming record);

	List<Xitongshuoming> selectByExample(XitongshuomingExample example);

	Xitongshuoming selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Xitongshuoming record,
			@Param("example") XitongshuomingExample example);

	int updateByExample(@Param("record") Xitongshuoming record, @Param("example") XitongshuomingExample example);

	int updateByPrimaryKeySelective(Xitongshuoming record);

	int updateByPrimaryKey(Xitongshuoming record);
}