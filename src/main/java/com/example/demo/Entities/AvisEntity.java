package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="feedback")

public class AvisEntity {
	@Id
   // @GeneratedValue(strategy= GenerationType.SEQUENCE)
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
	  @SequenceGenerator(name = "auto_gen")
	private Integer id;
	
	private String message;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AvisEntity(Integer id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public AvisEntity() {
		super();
	}	
	
	
	

}
