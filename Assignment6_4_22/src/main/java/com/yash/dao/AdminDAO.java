package com.yash.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.Model.Admin;



public class AdminDAO {
	
	@Autowired
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}

	public int saveAdmin(Admin obju) {
		String sql = "insert into admin(username,name,password) values(?,?,?)";
		return objJdbc.update(sql, obju.getUsername(), obju.getName(), obju.getPassword());

	}

}


