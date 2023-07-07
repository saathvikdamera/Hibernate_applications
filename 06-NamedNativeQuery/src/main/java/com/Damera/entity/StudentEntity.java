package com.Damera.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_student")
@Data
@NamedNativeQuery(name = "query1", query = "select * from tbl_student" ,resultClass = StudentEntity.class)
public class StudentEntity {
	
	@Column(name = "SID")
	private Integer studentId;
	
	@Column(name = "SNAME")
	private String studentName;

	private Integer marks;

}
