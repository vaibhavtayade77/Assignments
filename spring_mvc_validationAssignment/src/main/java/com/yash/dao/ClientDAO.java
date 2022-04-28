package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.controller.Client;

public class ClientDAO<ProductRepository> {

	@Autowired
	JdbcTemplate objJdbc;
	

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}

	public int saveClient(Client obju) {
		String sql = "insert into client (cname,password,email,cityaddress,contactno) values(?,?,?,?,?)";
		return objJdbc.update(sql, obju.getCname(), obju.getPassword(), obju.getEmail(), obju.getCityaddress(),
				Long.parseLong(obju.getContactno()));

	}

	public int update(Client objE) {

		String query = "update client set cname='" + objE.getCname() + "',password='" + objE.getPassword()+"',email='"+objE.getEmail()+"',cityaddress='"+objE.getCityaddress()+"',contactno='"+objE.getContactno()
				+ "' Where cid=" + objE.getCid();
		return objJdbc.update(query);

	}

	public int delete(String id) {
		String query = "delete from client where cid=" + Integer.parseInt(id);
		System.out.println(query);
		return objJdbc.update(query);
	}

	public List<Client> getAllEmp() {
		return objJdbc.query("select * from client", new RowMapper<Client>() {
			public Client mapRow(ResultSet rs, int rowno) throws SQLException {
				Client obju = new Client();
				obju.setCid(rs.getInt("cid"));
				obju.setCname(rs.getString("cname"));
				obju.setEmail(rs.getString("email"));
				obju.setCityaddress(rs.getString("cityaddress"));
				obju.setContactno("" + rs.getLong("contactno"));
				return obju;
			}});
		
	}
		
	

	}


