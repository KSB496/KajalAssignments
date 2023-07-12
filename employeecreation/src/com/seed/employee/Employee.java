package com.seed.employee;

import java.time.LocalDate;

public class Employee extends EmployeeSalary {

	private String empName;
	protected double empSalary;
	private LocalDate empDate;

	public Employee(String empFirstName, String empLastName, LocalDate empDate) {
		super();
		this.empName = empFirstName + empLastName;	
		this.empDate = empDate;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double mediclaim() {
		return  empSalary;
	}

	@Override
	public String toString() {

		return "Employee [ empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return empSalary;
	}

}
