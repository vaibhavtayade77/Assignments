package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.Model.Category;



public class CategoryDAO {
	
	
	@Autowired
	JdbcTemplate objJdbc;
	

	public void setObjJdbc(JdbcTemplate objJdbc) {
	}
	public int saveCategory(Category obju) {
		String sql = "insert into category(catid,categoryname) values(?,?)";
		return objJdbc.update(sql, obju.getCatid(), obju.getCategoryname());
	}

	

	public List<Category> getAllCategory() {
		return objJdbc.query("select * from category", new RowMapper<Category>() {
			public Category mapRow(ResultSet rs, int rowno) throws SQLException {
				Category obju = new Category();
				obju.setCatid(rs.getInt("itemid"));
				obju.setCategoryname(rs.getString("catname"));

				return obju;
			}
		});
	}
	
	
	

}


