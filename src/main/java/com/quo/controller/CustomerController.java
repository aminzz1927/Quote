package com.quo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quo.entity.Customer;
import com.quo.entity.Customer2;
import com.quo.entity.Customer3;
import com.quo.entity.Dept;
import com.quo.entity.Emp;
import com.quo.entity.EmpRole;
import com.quo.entity.ProductSeries2;
import com.quo.service.CustomerService;
import com.quo.service.DeptService;
import com.quo.utils.Result;
import com.quo.utils.ResultCode;
/**
 * 
 * @author 韩宛廷
 *
 */
@RestController("customerController")
@RequestMapping(value="/api")
public class CustomerController {
	@Autowired
	public CustomerService cService;
	
	
	/**
	 * 获取所有的顾客信息
	 * 
	 */
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	  public Result findCustomerAll(@CookieValue(name = "a", required = false) String enostr) {
	//获取职位id，如果id权限高，把所有权限给他，低只给自己得信息
		Result result = new Result();
		int eno;
		try {
			eno = Integer.parseInt(enostr);
		} catch (NumberFormatException n) {
			result = new Result(ResultCode.FAIL);
			result.setMessage("IDまたはパスワードが正しくありません。");
			return result;
		}
	EmpRole emp= cService.getRidByEno(eno);
   int rid= emp.getRid();
   if(rid==1001) {
	   List<Customer2> clist = cService.getAll();
		result = new Result(ResultCode.SUCCESS);
		System.out.println(clist);
		result.setData(clist);
		return result;
   }else if(rid==1002) {
	   List<Customer2> clist = cService.getAll();
	 		result = new Result(ResultCode.SUCCESS);
	 		System.out.println(clist);
	 		result.setData(clist);
	 		return result;
   }else if(rid==2001) {
	   List<Customer2> clist = cService.getAll();
		result = new Result(ResultCode.SUCCESS);
		System.out.println(clist);
		result.setData(clist);
		return result;
   }else if(rid==1003) {
	   Customer3 customer=   cService.getCustomerByEno(eno);
	    result = new Result(ResultCode.SUCCESS);
		result.setData(customer);
		return result;
   }else  if(rid==3001) {
	   Customer3 customer=   cService.getCustomerByEno(eno);
	    result = new Result(ResultCode.SUCCESS);
		result.setData(customer);
		return result;
   }
   return result;
		
	}
	
	@RequestMapping(value = "/customer/{cid}", method = RequestMethod.GET)
	public Result findByCid(@PathVariable(value = "cid") int cid) {
        Customer customer=  cService.getByCid(cid);
	
		Result result = new Result(ResultCode.SUCCESS);
		result.setData(customer);
		return result;

	}
}
