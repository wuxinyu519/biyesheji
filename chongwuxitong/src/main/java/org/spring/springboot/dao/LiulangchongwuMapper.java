package org.spring.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Liulangchongwu;
import org.spring.springboot.domain.LiulangchongwuExample;

public interface LiulangchongwuMapper {
	long countByExample(LiulangchongwuExample example);

	int deleteByExample(LiulangchongwuExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Liulangchongwu record);

	int insertSelective(Liulangchongwu record);

	List<Liulangchongwu> selectByExample(LiulangchongwuExample example);

	Liulangchongwu selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Liulangchongwu record,
			@Param("example") LiulangchongwuExample example);

	int updateByExample(@Param("record") Liulangchongwu record, @Param("example") LiulangchongwuExample example);

	int updateByPrimaryKeySelective(Liulangchongwu record);

	int updateByPrimaryKey(Liulangchongwu record);
}