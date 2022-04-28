package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.Booktitle;
import com.yash.model.Publisher;


@Component
public class PublisherDAO {
	
	 @Autowired
	  JdbcTemplate jdbc;
	public int addPublisher(Publisher objuser)
	{
		if(jdbc!=null)
		{
		int pd;
		pd= jdbc.update("insert into publisher (pubid,publishername,emailid,address) values(?,?,?,?)",objuser.getPubid(),objuser.getPublishername(),objuser.getEmailid(),objuser.getAddress());
		return pd;
		}
		return 0;

}
	
	
	public int updatepub(Publisher objE) {

		String query = "update publisher set publishername='" + objE.getPublishername() + "',emailid='" + objE.getEmailid()+"',address='"+objE.getAddress()+"' Where pubid=" + objE.getPubid();
		return jdbc.update(query);

	}
	public int deletepub(String id) {
		String query = "delete from publisher where pubid=" + Integer.parseInt(id);
		System.out.println(query);
		return jdbc.update(query);
	}

	

	public List<Publisher> getAllPublisher()
	{
		return jdbc.query("select * from publisher", new RowMapper<Publisher>() {
			public Publisher mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Publisher obju = new Publisher();
				obju.setPubid(rs.getInt("pubid"));
				obju.setPublishername(rs.getString("publishername"));
				obju.setEmailid(rs.getString("emailid"));
				obju.setAddress(rs.getString("address"));
				return obju;
			}
		});		
	}}
