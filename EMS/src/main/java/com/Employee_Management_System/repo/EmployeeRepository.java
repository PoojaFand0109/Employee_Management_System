package com.Employee_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee_Management_System.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
