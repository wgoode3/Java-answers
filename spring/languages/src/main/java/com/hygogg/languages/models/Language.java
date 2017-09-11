package com.hygogg.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Language {
	
	@Id
    @GeneratedValue
    private Long id;
	
	@Column
	@Size(min = 1, max = 20)
	private String name;
	
	@Column
	@Size(min = 2, max = 20)
	private String creator;
	
	@Column(nullable = false)
	@Size(min = 1, max = 20)
	private String version;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date created_at;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updated_at;
	
	public Language() {
	}
	
	public Language(String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}