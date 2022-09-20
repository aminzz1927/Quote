package com.quo.service;

import java.util.List;

import com.quo.entity.Customer;
import com.quo.entity.Customer2;
import com.quo.entity.Customer3;
import com.quo.entity.Emp;
import com.quo.entity.EmpRole;
import com.quo.entity.ProductSeries2;
import com.quo.entity.Role;

/**
 * 
 * @author 韩宛廷
 *
 */

public interface CustomerService {
	
	  //获取所有的顾客信息
	List<Customer2> getAll();
	//获取单个顾客信息
	Customer getByCid(int cid);
	//获取职位
	EmpRole getRidByEno(int eno);
	//权限低的人只能看到自己的顾客信息
	Customer3 getCustomerByEno(int eno);
}
