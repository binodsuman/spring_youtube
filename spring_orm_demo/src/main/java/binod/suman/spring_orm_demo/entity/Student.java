package binod.suman.spring_orm_demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	
	@Id
	@Column(name="roll")
	private int rollNumber;
	@Column
	private String name;
	@Column
	private String city;
	public Student(int rollNumber, String name, String city) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}
	
	public Student() {}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	

}
