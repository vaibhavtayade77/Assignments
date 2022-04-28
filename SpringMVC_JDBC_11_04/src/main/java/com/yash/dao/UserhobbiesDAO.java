package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Hobbies;
import com.yash.model.Userhobbies;

public class UserhobbiesDAO {
	
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	 public int saveUserhobbies(Userhobbies obju)
	 {
		 String sql="insert into userhobbies (uhid,hoid,userid) values(?,?,?)";
		 return objJdbc.update(sql, obju.getUhid(),obju.getHoid(),obju.getUserid());

	 }
	 
	 public int updateuserhobbies(Userhobbies objE) {

			String query = "update userhobbies set hoid='" + objE.getHoid()+"',userid="+objE.getUserid() 
			
					+ "' Where uhid=" + objE.getUhid();
			return objJdbc.update(query);

		}

		public int deletehobbies(String id) {
			String query = "delete from userhobbies where uhid=" + Integer.parseInt(id);
			System.out.println(query);
			return objJdbc.update(query);
		}
	   public List<Userhobbies> getAllUserhobbies()
	   {	   
		  return objJdbc.query("select * from userhobbies",new RowMapper <Userhobbies>() 		{
			  public Userhobbies mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  Userhobbies obju = new Userhobbies();
				  obju.setUhid(rs.getInt("hoid"));
				  obju.setHoid(rs.getInt("hoid"));
				  obju.setUserid(rs.getInt("userid"));
				 
				  
				  		
				 
				  return obju;
			  }
		  	}  );
	   }
	}



