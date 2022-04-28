package com.yashproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yashproject.model.Student;

public class StudentDAO {
	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}

	public int saveStud(Student objE) {
		String query = "insert into student (firstname,lastname,fathername,mothername,classname,section,phoneno_student,dob,dateofsubmission,gender,add1,add2,cityid,phoneno_parent,email_parent) "
				+ "values ('" + objE.getFirstname() + "','" + objE.getLastname() + "','" + objE.getFathername() + "','"
				+ objE.getMothername() + "','" + objE.getClassname() + "','" + objE.getSection() + "','"
				+ objE.getPhoneno_student() + "','" + objE.getDob() + "','" + objE.getDateofsubmission() + "','"
				+ objE.getGender() + "','" + objE.getAdd1() + "','" + objE.getAdd2() + "'," + objE.getCityid() + ",'"
				+ objE.getPhoneno_parent() + "','" + objE.getEmail_parent() + "')";

		int no;
		no = objJDBC.update(query);
		return no;
	}

	public int updateStud(Student objE) {
		String query = "update student set firstname='" + objE.getFirstname() + "',lastname=" + objE.getLastname()
				+ "',fathername=" + objE.getFathername() + "',mothername=" + objE.getMothername() + "',classname="
				+ objE.getClassname() + "',section=" + objE.getSection() + "',phoneno_student="
				+ objE.getPhoneno_student() + "',dob=" + objE.getDob() + "',dateofsubmission="
				+ objE.getDateofsubmission() + "',gender=" + objE.getGender() + "',add1=" + objE.getAdd1() + "',add2="
				+ objE.getAdd2() + "',cityid=" + objE.getCityid() + "',phoneno_parent=" + objE.getPhoneno_parent()
				+ "',email_parent=" + objE.getEmail_parent() + ")";

		int no;
		no = objJDBC.update(query);
		return no;

	}

	public int deleteStud(int sid) {

		String query = "delete from student where sid= " + sid;
		return objJDBC.update(query);
	}

//	public List<Student> getAllEmpByRowMapper() {
//		return objJDBC.query("select * from employee", new RowMapper<Student>() {
//			public Student mapRow1(ResultSet rs, int rowno) throws SQLException {
//				Student e = new Student();
//
//				e.setSid(rs.getInt("sid"));
//				e.setFirstname(rs.getString("firstname"));
//				e.setLastname(rs.getString("lastname"));
//				e.setFathername(rs.getString("fathername"));
//				e.setMothername(rs.getString("mothername"));
//				e.setClassname(rs.getString("classname"));
//				e.setPhoneno_student(rs.getString("phoneno_student"));
//				e.setDob(rs.getString("dob"));
//				e.setDateofsubmission(rs.getString("dateofsubmission"));
//				e.setGender(rs.getString("gender"));
//				e.setAdd1(rs.getString("add1"));
//				e.setAdd2(rs.getString("add2"));
//				e.setCityid(rs.getInt("cityid"));
//				e.setPhoneno_parent(rs.getString("phoneno_parent"));
//				e.setEmail_parent(rs.getString("email_parent"));
//
//				return e;
			
//
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		

	
	public List<Student> getAllRecordEmp()
	{
		return objJDBC.query("select * from employee", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Student e = new Student();
				e.setSid(rs.getInt("sid"));
				e.setFirstname(rs.getString("firstname"));
				e.setLastname(rs.getString("lastname"));
				e.setFathername(rs.getString("fathername"));
				e.setMothername(rs.getString("mothername"));
				e.setClassname(rs.getString("classname"));
				e.setPhoneno_student(rs.getString("phoneno_student"));
				e.setDob(rs.getString("dob"));
				e.setDateofsubmission(rs.getString("dateofsubmission"));
				e.setGender(rs.getString("gender"));
				e.setAdd1(rs.getString("add1"));
				e.setAdd2(rs.getString("add2"));
				e.setCityid(rs.getInt("cityid"));
				e.setPhoneno_parent(rs.getString("phoneno_parent"));
				e.setEmail_parent(rs.getString("email_parent"));
			
				return e;				
			}			
		});

}}

