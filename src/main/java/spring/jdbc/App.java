package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.jdbc.config.JdbcConfig;
import spring.jdbc.dao.StudentDao;
import spring.jdbc.dataCall.DataCall;
import spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DataCall inser=new DataCall();
       // inser.insertData();
        inser.readStudent();
        
        //ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
//        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        
//        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        
//        Student student= new Student();
//        
//        student.setId(124);
//        student.setName("ram");
//        student.setCity("mumbai");
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println("Student added "+ result);
        
    }
}
