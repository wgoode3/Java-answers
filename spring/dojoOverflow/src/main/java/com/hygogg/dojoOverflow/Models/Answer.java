package com.hygogg.dojoOverflow.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min = 12)
	private String answer;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="question")
    private Question question;
	
	private Date createdAt;
	
	private Date updatedAt;

	public Answer() {
	}
	
	public Answer(String answer) {
		this.answer = answer;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
    protected void onCreate(){
		this.setCreatedAt(new Date());
    }

    @PreUpdate
    protected void onUpdate(){
    	this.setUpdatedAt(new Date());
    }
    
}