package com.seed.employee.contract;

import java.time.LocalDate;

import com.seed.employee.Employee;

public class ContractBasedEmployee extends Employee {
	
	protected String contractorName;
	protected double wage;
	protected double noOfHours;
	private static int cempId;
	private int ceId;

	public ContractBasedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractBasedEmployee(String empFirstName, String empLastName, LocalDate empDate, String contractorName, double wage, double noOfHours) {
		super(empFirstName, empLastName, empDate);
		this.contractorName = contractorName;
		this.wage = wage;
		this.noOfHours = noOfHours;
		cempId++;
		ceId=cempId;
	}
	
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}
	public static int getCempId() {
		return cempId;
	}
	public static void setCempId(int cempId) {
		ContractBasedEmployee.cempId = cempId;
	}
	public int getCeId() {
		return ceId;
	}
	public void setCeId(int ceId) {
		this.ceId = ceId;
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return wage * noOfHours;
	}
	@Override
	public String toString() {
		return "ContractBasedEmployee [contractorName=" + contractorName + ", wage=" + wage + ", noOfHours=" + noOfHours
				+ ", ceId=" + ceId + "]";
	}
	
	
}
