package com.cozentus.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cozentus.SpringJDBC.Dao.StudentDAO;
import com.cozentus.SpringJDBC.Model.Student;

public class StudentJdbcExec {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanfile.xml");
		StudentDAO studentDAO = (StudentDAO) ac.getBean("studentDAO");
		Student student = new Student();
		student.setId(12);
		student.setName("Dhanush");
		student.setScore(85);
		int results = studentDAO.insertStudent(student);
		System.out.println(results+ " Data Inserted Successfully !!");
	}
}
