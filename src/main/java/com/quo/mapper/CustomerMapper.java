package com.quo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.quo.entity.Customer;
import com.quo.entity.Customer2;
import com.quo.entity.Customer3;
import com.quo.entity.Emp;
import com.quo.entity.EmpRole;
import com.quo.entity.ProductSeries2;
import com.quo.entity.Role;




@Mapper
public interface CustomerMapper {
//获取所有顾客信息
	List<Customer2> getAll();
	//获取单个顾客信息
	Customer getByCid(int cid);
	//获取职位
	EmpRole getRidByEno(int eno);
	
	//权限低的人只能看到自己的顾客信息
		Customer3 getCustomerByEno(int eno);
}
