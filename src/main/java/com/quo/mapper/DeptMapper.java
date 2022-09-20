package com.quo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.quo.entity.Dept;




@Mapper
public interface DeptMapper {

	
	List<Dept> getAll();

}
