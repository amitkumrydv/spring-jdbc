package spring.jdbc.dao;

import java.util.List;

import spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public List<Student> read(int studentID);
	
	
	

}
