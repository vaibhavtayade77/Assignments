package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.Model.Customer;


public class CustomerDAO {
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	public int saveCust(Customer obju)
	 {
		 String sql="insert into customer(cusid , customername,emailid,address,mobileno) values(?,?,?,?,?)";
		 return objJdbc.update(sql, obju.getCusid(), obju.getCustomername(), obju.getEmailid(), obju.getAddress(),
					obju.getMobileno());

	 }
	public List<Customer> getAllCustomer() {
		return objJdbc.query("select * from customer", new RowMapper<Customer>() {
			public Customer mapRow(ResultSet rs, int rowno) throws SQLException {
				Customer obju = new Customer();
				obju.setCusid(rs.getInt("cusid"));
				obju.setCustomername(rs.getString("customername"));
				obju.setEmailid(rs.getString("emailid"));
				obju.setAddress(rs.getString("address"));
				obju.setMobileno(rs.getString("mobileno"));

				return obju;
			}
		});

	}
}
