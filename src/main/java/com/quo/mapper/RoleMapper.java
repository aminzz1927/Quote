package com.quo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.quo.entity.Role;




@Mapper
public interface RoleMapper {

	
	List<Role> getAll();

}
