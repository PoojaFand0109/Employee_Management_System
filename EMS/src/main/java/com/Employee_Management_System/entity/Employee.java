package com.Employee_Management_System.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ename", nullable = false)
	private String eName;

	@Column(name = "edepartment")
	private String eDepartment;

	@Column(name = "esalary")
	private double eSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, String eDepartment, double eSalary) {
		super();
		this.eName = eName;
		this.eDepartment = eDepartment;
		this.eSalary = eSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", eDepartment=" + eDepartment + ", eSalary=" + eSalary
				+ "]";
	}

}
