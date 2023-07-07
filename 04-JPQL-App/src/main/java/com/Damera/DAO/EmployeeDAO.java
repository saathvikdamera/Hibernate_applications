package com.Damera.DAO;

import java.util.List;

import com.Damera.entity.EmployeeEntity;

public interface EmployeeDAO {
	
	EmployeeEntity fetchEmployeeById(Integer empNumber);
	
	List<EmployeeEntity> fetchEmployees();
	
	List<Object[]> fetchEmployeeNamesAndSalaries();

}
