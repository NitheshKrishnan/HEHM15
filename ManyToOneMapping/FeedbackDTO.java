package edu.jspiders.manytoonemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="feedback")
public class FeedbackDTO
{
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Id
	@Column(name="feedback_id")
	private int feedbackId;
	@Column(name="comment")
	private int comment;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="batches_batch_code")
	private BatchesDTO batch;
	
	public FeedbackDTO() 
	{
		
	}

	public FeedbackDTO(int comment) {
		this.comment = comment;
	}

	public BatchesDTO getBatch() {
		return batch;
	}

	public void setBatch(BatchesDTO batch) {
		this.batch = batch;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "FeedbackDTO [feedbackId=" + feedbackId + ", comment=" + comment + "]";
	}
}
