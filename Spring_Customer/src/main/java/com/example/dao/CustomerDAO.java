package com.example.dao;

import java.util.List;

import com.example.dto.CustomerVO;

public interface CustomerDAO {
	
	public List<CustomerVO> selectCustomer() throws Exception;
}
