package com.Damera.client;

import java.util.Iterator;
import java.util.List;

import com.Damera.dao.StudentDAO;
import com.Damera.dao.impl.StudentDAOImpl;
import com.Damera.entity.StudentEntity;

public class test {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		List<StudentEntity> students = dao.fetchStudents();
		Iterator<StudentEntity> it = students.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
