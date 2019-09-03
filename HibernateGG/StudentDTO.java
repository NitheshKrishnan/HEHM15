package edu.jspiders.hibernategg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_info")
public class StudentDTO 
{
	//@GenericGenerator(name="myGen", strategy= "increment") // create the Generator
	@GenericGenerator(name="customGen", strategy="edu.jspiders.hibernategg.generator.MyCustomGenerator")
	
	@GeneratedValue(generator="customGen") // use the Generator
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="marks")
	private double marks;
	
	public StudentDTO() 
	{
		
	}

	public StudentDTO(int studentId, String firstName, String middleName, String lastName, double marks) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", marks=" + marks + "]";
	}
}