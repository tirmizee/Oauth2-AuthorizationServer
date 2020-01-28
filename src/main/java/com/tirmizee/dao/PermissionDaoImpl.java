package com.tirmizee.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.tirmizee.entities.Permission;

@Repository
public class PermissionDaoImpl extends BaseDao implements PermissionDao {

	@Override
	public List<Permission> findByUsername(String username) {
		String query = queries.get("PERMISSTION.FIND_BY_USERNAME");
		SqlParameterSource params = new MapSqlParameterSource("username", username);
		return mamedParameterJdbcOperations.query(query, params, BeanPropertyRowMapper.newInstance(Permission.class));
	}

}
