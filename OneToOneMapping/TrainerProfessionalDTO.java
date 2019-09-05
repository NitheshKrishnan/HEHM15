package edu.jspiders.onetoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trainer_professional")
public class TrainerProfessionalDTO 
{
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Id
	@Column(name="trainer_id")
	private int trainerId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_personal_id")
	private TrainerPersonalDTO personal;
	
	public TrainerProfessionalDTO() 
	{
		
	}

	public TrainerProfessionalDTO(String firstName, String lastName, String designation, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public TrainerPersonalDTO getPersonal() {
		return personal;
	}

	public void setPersonal(TrainerPersonalDTO personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "TrainerProfessionalDTO [trainerId=" + trainerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}
}
