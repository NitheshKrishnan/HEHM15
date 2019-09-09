package edu.jspiders.manytoonemapping.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="batches_table")
public class BatchesDTO 
{
	@Id
	@Column(name="batch_code")
	private String batchCode;
	@Column(name="subject")
	private String subject;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="batch")
	@JoinColumn(name="batches_batch_code")
	private List<FeedbackDTO> feedbacks;
	
	public void addFeedback(FeedbackDTO feeedback)
	{
		if(feedbacks == null)
			feedbacks = new ArrayList<FeedbackDTO>();
		
		feedbacks.add(feeedback);
	}
	
	public BatchesDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public BatchesDTO(String batchCode, String subject)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.batchCode = batchCode;
		this.subject = subject;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "BatchesDTO [batchCode=" + batchCode + ", subject=" + subject + "]";
	}
}