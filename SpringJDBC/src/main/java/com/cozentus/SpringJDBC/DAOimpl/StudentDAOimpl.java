package com.cozentus.SpringJDBC.DAOimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cozentus.SpringJDBC.Dao.StudentDAO;
import com.cozentus.SpringJDBC.Model.Student;

public class StudentDAOimpl implements StudentDAO{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertStudent(Student student) {
		String query = "insert into students values(?,?,?);";
		int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getScore());
		return result;
	}	
}
