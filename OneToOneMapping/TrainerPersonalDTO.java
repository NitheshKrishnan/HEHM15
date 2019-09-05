package edu.jspiders.onetoonemapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trainer_personal")
public class TrainerPersonalDTO 
{
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Id
	@Column(name="personal_id")
	private int personalId;
	@Column(name="mother_tongue")
	private String motherTongue;
	@Column(name="hometown")
	private String hometown;
	@Column(name="status")
	private String status;
	
	public TrainerPersonalDTO()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public TrainerPersonalDTO(String motherTongue, String hometown, String status) {
		
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		this.motherTongue = motherTongue;
		this.hometown = hometown;
		this.status = status;
	}
	
	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TrainerPersonalDTO [personalId=" + personalId + ", motherTongue=" + motherTongue + ", hometown="
				+ hometown + ", status=" + status + "]";
	}
}