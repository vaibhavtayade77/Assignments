package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Hobbies;
import com.yash.model.User;


public class HobbiesDAO {
	
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	 public int saveHobbies(Hobbies obju)
	 {
		 String sql="insert into hobbies (hoid,hobbiesname) values(?,?)";
		 return objJdbc.update(sql, obju.getHoid(),obju.getHobbiesname());

	 }
	 
	 public int updatehobbies(Hobbies objE) {

			String query = "update user set hobbiesname='" + objE.getHobbiesname() 
			
					+ "' Where hoid=" + objE.getHoid();
			return objJdbc.update(query);

		}

		public int deletehobbies(String id) {
			String query = "delete from hobbies where hoid=" + Integer.parseInt(id);
			System.out.println(query);
			return objJdbc.update(query);
		}
	   public List<Hobbies> getAllHobbies()
	   {	   
		  return objJdbc.query("select * from hobbies",new RowMapper <Hobbies>() 		{
			  public Hobbies mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  Hobbies obju = new Hobbies();
				  obju.setHoid(rs.getInt("hoid"));
				  obju.setHobbiesname(rs.getString("hobbiesname"));
				 
				  
				  
				  		
				 
				  return obju;
			  }
		  	}  );
	   }
	}


