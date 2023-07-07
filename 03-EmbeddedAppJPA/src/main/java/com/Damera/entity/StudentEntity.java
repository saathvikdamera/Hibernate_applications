package com.Damera.entity;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_stud")
public class StudentEntity {

	@EmbeddedId
	private StudentCompositeKey compositeKey;

	@Column(name = "sname")
	private String studentName;

	private Integer marks;

	public StudentEntity(StudentCompositeKey compositeKey, String studentName, Integer marks) {
		super();
		this.compositeKey = compositeKey;
		this.studentName = studentName;
		this.marks = marks;
	}

	public StudentCompositeKey getCompositeKey() {
		return compositeKey;
	}

	public void setCompositeKey(StudentCompositeKey compositeKey) {
		this.compositeKey = compositeKey;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
