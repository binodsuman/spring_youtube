package binod.suman.spring_orm_demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

import binod.suman.spring_orm_demo.entity.Student;

public class StudentDAO {

	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	public int insert(Student student) {
		int n = (Integer)hibernateTemplate.save(student);
		return n;
	}
	
	public void update(Student student) {
		hibernateTemplate.update(student);
    }
	
	public Student getStudent(int roll) {
		Student student = hibernateTemplate.get(Student.class, roll);
		return student;
	}
	
	public void delete(int roll) {
		hibernateTemplate.delete(getStudent(roll));
	}
	
	
	
	public List<Student> getAllStudent(){
		return (List<Student>) hibernateTemplate.find("from Student");
	}
	
}
