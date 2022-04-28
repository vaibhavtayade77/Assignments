package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.User;



public class UserDAO {
	
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	 public int saveUser(User obju)
	 {
		 String sql="insert into user (userid,fname,lname,email,password,gender,dob,dor,sec_question,sec_answer) values(?,?,?,?,?,?,?,?,?,?)";
		 return objJdbc.update(sql, obju.getUserid(),obju.getFname(),obju.getLname(),obju.getEmail(),obju.getPassword(),obju.getGender(),obju.getDob(),obju.getDor(),obju.getSec_question(),obju.getSec_answer());

	 }
	 
	 public int updateuser(User objE) {

			String query = "update user set fname='" + objE.getFname() + "',lname='" + objE.getLname()+ "',email='" + objE.getEmail()+ "',password='" + objE.getPassword()+ "',gender='" + objE.getGender()+ "',dob='" + objE.getDob()+ "',dor='" + objE.getDor()+ "',sec_question='" + objE.getSec_question()
			+ "',sec_answer='" + objE.getSec_answer()
					+ "' Where userid=" + objE.getUserid();
			return objJdbc.update(query);

		}

		public int deleteuser(String id) {
			String query = "delete from user where userid=" + Integer.parseInt(id);
			System.out.println(query);
			return objJdbc.update(query);
		}

	   public List<User> getAllUser()
	   {	   
		  return objJdbc.query("select * from user",new RowMapper <User>() 		{
			  public User mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  User obju = new User();
				  obju.setUserid(rs.getInt("userid"));
				  obju.setFname(rs.getString("fname"));
				  obju.setLname(rs.getString("lname"));
				  obju.setEmail(rs.getString("email"));
				  obju.setPassword(rs.getString("password"));
				  obju.setGender(rs.getString("gender"));
				  obju.setDob(rs.getString("dob"));
				  obju.setDor(rs.getString("dor"));
				  obju.setSec_question(rs.getString("sec_question"));
				  obju.setSec_answer(rs.getString("sec_answer"));
				  
				  
				  		
				 
				  return obju;
			  }
		  	}  );
	   }
	}


