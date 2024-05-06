package com.Employee_Management_System.service;

import java.util.List;

import com.Employee_Management_System.entity.Employee;

public interface EmployeeService {

	Employee getEmployeeById(Long id);

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(Employee existingEmployee);

	void deleteEmployeeById(Long id);

	Object getAllemployees();

	
}
