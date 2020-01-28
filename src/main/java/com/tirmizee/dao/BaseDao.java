package com.tirmizee.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	
	@Autowired
	protected Map<String, String> queries;
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	@Autowired
	protected NamedParameterJdbcOperations mamedParameterJdbcOperations;
	
}
