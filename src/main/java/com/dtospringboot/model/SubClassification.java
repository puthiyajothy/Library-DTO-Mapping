package com.dtospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="subclassification")
public class SubClassification  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long subclassificationId;
	private String subclassificationName;
	
	@ManyToOne
	@JoinColumn(name="classId" , nullable=false)
	private Classification classification;

	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public Long getSubclassificationId() {
		return subclassificationId;
	}
	public void setSubclassificationId(Long subclassificationId) {
		this.subclassificationId = subclassificationId;
	}
	public String getSubclassificationName() {
		return subclassificationName;
	}
	public void setSubclassificationName(String subclassificationName) {
		this.subclassificationName = subclassificationName;
	}
	
	

	}
