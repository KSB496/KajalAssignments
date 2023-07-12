package lab3;

import java.time.LocalDate;

public class ContractBasedEmployee extends Employee {
	
	private String contractorName;
	private double ratePerHour;
	private double noOfHours;
	private static int cempId;
	private int ceId;

	public ContractBasedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractBasedEmployee(String empFirstName, String empLastName, double empSalary, String empGrade,
			LocalDate empDate, String contractorName, double ratePerHour, double noOfHours) {
		super(empFirstName, empLastName, empSalary, empGrade, empDate);
		this.contractorName = contractorName;
		this.ratePerHour = ratePerHour;
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
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
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
	
	@Override
	public double getEmpSalary() {
		return ratePerHour * noOfHours;
	}
	@Override
	public String toString() {
		return "ContractBasedEmployee [ceId=" + ceId + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", contractorName=" + contractorName + ", ratePerHour=" + ratePerHour
						+ ", noOfHours=" + noOfHours + ", empSalary=" + this.getEmpSalary() + "]";
	}
	
	 
	
	
	
}
