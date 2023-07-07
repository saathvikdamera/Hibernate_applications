package com.Damera.dao;

import java.util.List;

import com.Damera.entity.StudentEntity;

public interface StudentDAO {
	
	List<StudentEntity> fetchStudents();

}
