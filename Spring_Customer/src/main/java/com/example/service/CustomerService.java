package com.example.service;

import java.util.List;

import com.example.dto.CustomerVO;

public interface CustomerService {
	
	public List<CustomerVO> selectCustomer() throws Exception;
}
