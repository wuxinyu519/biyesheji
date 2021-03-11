package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Chongwuzixun;
import org.spring.springboot.domain.ChongwuzixunExample;

public interface ChongwuzixunMapper {
	long countByExample(ChongwuzixunExample example);

	int deleteByExample(ChongwuzixunExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Chongwuzixun record);

	int insertSelective(Chongwuzixun record);

	List<Chongwuzixun> selectByExample(ChongwuzixunExample example);

	Chongwuzixun selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Chongwuzixun record, @Param("example") ChongwuzixunExample example);

	int updateByExample(@Param("record") Chongwuzixun record, @Param("example") ChongwuzixunExample example);

	int updateByPrimaryKeySelective(Chongwuzixun record);

	int updateByPrimaryKey(Chongwuzixun record);
}