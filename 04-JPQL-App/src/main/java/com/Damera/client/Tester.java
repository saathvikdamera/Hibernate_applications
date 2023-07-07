package com.Damera.client;

import java.util.Iterator;
import java.util.List;

import com.Damera.DAO.EmployeeDAO;
import com.Damera.DAO.Impl.EmployeeDAOImpl;
import com.Damera.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		List<Object[]> namesAndSalaries = dao.fetchEmployeeNamesAndSalaries();
		Iterator<Object[]> it = namesAndSalaries.iterator();
		while(it.hasNext()) {
			Object[] o = it.next();
			System.out.println("Employee name : "+o[0]+"," + "Employee salary : "+o[1]);
		}
	}

}
