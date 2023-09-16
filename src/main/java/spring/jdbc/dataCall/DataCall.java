package spring.jdbc.dataCall;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.jdbc.DaoImpl.StudentDaoImpl;
import spring.jdbc.config.JdbcConfig;
import spring.jdbc.dao.StudentDao;
import spring.jdbc.entities.Student;

public class DataCall {
	
	//StudentDao studentDao;

	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

	public void insertData() {

		Student student = new Student();

		student.setId(128);
		student.setName("ram");
		student.setCity("mumbai");

		int result = studentDao.insert(student);

		System.out.println("Student added " + result);

	}

	public  void readStudent( ) {
		List<Student> student = studentDao.read(124);

		
		
		System.out.println("read data "+ student);
		
		

	}

}
