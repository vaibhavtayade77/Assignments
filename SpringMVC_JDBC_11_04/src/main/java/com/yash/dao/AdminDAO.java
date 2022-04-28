package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Admin;



public class AdminDAO {
	
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	 public int saveAdmin(Admin obju)
	 {
		 String sql="insert into admin (adminid,adminname,password) values(?,?,?)";
		 return objJdbc.update(sql, obju.getAdminid(),obju.getAdminname(),obju.getPassword());

	 }
	   public List<Admin> getAllAdmin()
	   {	   
		  return objJdbc.query("select * from admin",new RowMapper <Admin>() 		{
			  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  Admin obju = new Admin();
				  obju.setAdminid(rs.getInt("adminid"));
				  obju.setAdminname(rs.getString("adminname"));
				  obju.setPassword(rs.getString("password"));
				 
				  return obju;
			  }
		  	}  );
	   }
	}


