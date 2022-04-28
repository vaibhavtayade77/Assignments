package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.Model.Item;


public class ItemDAO {
	@Autowired	
	JdbcTemplate objJdbc;

	public void setObjJdbc(JdbcTemplate objIJdbc) {
	}
	public int saveitem(Item obju)
	 {
		 String sql="insert into item(itemid,catid,itemname,price,dom,doe ) values(?,?,?,?,?,?)";
		 return objJdbc.update(sql, obju.getItemid(), obju.getCatid(), obju.getItemname(), obju.getPrice(),
					obju.getDom(), obju.getDoe());

	 }
	 public List<Item> getAllItem()
	   {	   
		  return objJdbc.query("select * from item",new RowMapper <Item>() 		{
			  public Item mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  Item obju = new Item();
					obju.setItemid(rs.getInt("itemid"));
					obju.setCatid(rs.getInt("catid"));
					obju.setItemname(rs.getString("itemname"));
					obju.setPrice(rs.getInt("price"));
					obju.setDom(rs.getString("dom"));
					obju.setDoe(rs.getString("doe"));
					return obju;
				  
			  }
		  	}  );
	   }
	
}
