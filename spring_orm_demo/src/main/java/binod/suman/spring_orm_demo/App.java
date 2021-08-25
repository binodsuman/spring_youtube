package binod.suman.spring_orm_demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import binod.suman.spring_orm_demo.dao.StudentDAO;
import binod.suman.spring_orm_demo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World 2!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO studentDAO = context.getBean("studentDao",StudentDAO.class);
        Student student = new Student(129,"Binod","Karnataka");
        System.out.println("------- CREATE  ----------");
        int id = studentDAO.insert(student);
        System.out.println("Data Inserted :"+id);
        System.out.println("------ READ ---------------");
        student = studentDAO.getStudent(120);
        System.out.println(student);
        System.out.println("------ UPDATE ---------------");
        student = new Student(120,"Pramod Modi","Bangalore");
        studentDAO.update(student);
        student = studentDAO.getStudent(120);
        System.out.println(student);
        System.out.println("------ DELETE ---------------");
        studentDAO.delete(124);
        System.out.println("--------- SHOW ALL RECORD -----------");
        List<Student> students = studentDAO.getAllStudent();
        for(Student s : students) {
        	System.out.println(s);
        }
        
        
        
    }
}
