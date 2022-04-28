package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.Author;

@Component
public class AuthorDAO {

	@Autowired
	JdbcTemplate jdbc;

	public int addAuthor(Author objuser) {
		if (jdbc != null) {
			int ad;
			ad = jdbc.update("insert into author (auid,authorname,email) values(?,?,?)", objuser.getAuid(),
					objuser.getAuthorname(), objuser.getEmail());
			return ad;
		}
		return 0;

	}

	public int updateauth(Author objE) {

		String query = "update author set authorname='" + objE.getAuthorname() + "',email='" + objE.getEmail()
				+ "' Where auid=" + objE.getAuid();
		return jdbc.update(query);

	}

	public int deleteauth(String id) {
		String query = "delete from author where auid=" + Integer.parseInt(id);
		System.out.println(query);
		return jdbc.update(query);
	}

	public List<Author> getAllAuthor() {
		return jdbc.query("select * from author", new RowMapper<Author>() {
			public Author mapRow(ResultSet rs, int rowno) throws SQLException {
				Author obju = new Author();
				obju.setAuid(rs.getInt("auid"));
				obju.setAuthorname(rs.getString("authorname"));
				obju.setEmail(rs.getString("email"));

				return obju;
			}
		});
	}
}
