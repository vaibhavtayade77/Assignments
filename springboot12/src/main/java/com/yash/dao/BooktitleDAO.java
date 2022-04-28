package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.Author;
import com.yash.model.Booktitle;


@Component
public class BooktitleDAO {
	
	 @Autowired
	  JdbcTemplate jdbc;
	public int addBooktitle(Booktitle objuser)
	{
		if(jdbc!=null)
		{
		int bt;
		bt= jdbc.update("insert into booktitle (btid,title,auid1,auid2,auid3,pubid,price) values(?,?,?,?,?,?,?)",objuser.getBtid(),objuser.getTitle(),objuser.getAuid1(),objuser.getAuid2(),objuser.getAuid3(),objuser.getPubid(),objuser.getPrice());
		return bt;
		}
		return 0;

}
	
	public int updatebook(Booktitle objE) {

		String query = "update booktitle set title='" + objE.getTitle() + "',auid1='" + objE.getAuid1()+"',auid2='"+objE.getAuid2()+"',auid3='"+objE.getAuid3()+"',pubid='"+objE.getPubid()+"',price='"+objE.getPrice()
				+ "' Where btid=" + objE.getBtid();
		return jdbc.update(query);

	}
	public int deletebt(String id) {
		String query = "delete from booktitle where btid=" + Integer.parseInt(id);
		System.out.println(query);
		return jdbc.update(query);
	}

	
	public List<Booktitle> getAllBooktitle()
	{
		return jdbc.query("select * from booktitle", new RowMapper<Booktitle>() {
			public Booktitle mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Booktitle obju = new Booktitle();
				obju.setBtid(rs.getInt("btid"));
				obju.setTitle(rs.getString("title"));
				obju.setAuid1(rs.getInt("auid1"));
				obju.setAuid2(rs.getInt("auid2"));
				obju.setAuid3(rs.getInt("auid3"));
				obju.setPubid(rs.getInt("pubid"));
				obju.setPrice(rs.getInt("price"));
				 
				return obju;
			}
		});		
	}}
