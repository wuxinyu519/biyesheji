package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Lingyang;
import org.spring.springboot.domain.LingyangExample;

public interface LingyangMapper {
	long countByExample(LingyangExample example);

	int deleteByExample(LingyangExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Lingyang record);

	int insertSelective(Lingyang record);

	List<Lingyang> selectByExample(LingyangExample example);

	Lingyang selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Lingyang record, @Param("example") LingyangExample example);

	int updateByExample(@Param("record") Lingyang record, @Param("example") LingyangExample example);

	int updateByPrimaryKeySelective(Lingyang record);

	int updateByPrimaryKey(Lingyang record);
}