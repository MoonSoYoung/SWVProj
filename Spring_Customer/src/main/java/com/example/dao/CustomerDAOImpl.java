package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.customerMapper";
	
	@Override
	public List<CustomerVO> selectCustomer() throws Exception {

		return sqlSession.selectList(Namespace+".selectCustomer");
	}

}
