package com.hygogg.dojoOverflow.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min = 2)
	private String subject;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	public Tag() {
	}
	
	public Tag(String subject) {
		this.subject = subject;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tags_questions", 
        joinColumns = @JoinColumn(name = "tag_id"), 
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private List<Question> questions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
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