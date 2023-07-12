package lab4;

import java.time.LocalDate;

public class PermanentEmployee extends Employee {
	
	private static int pempId;
	private int peId;
	
	public PermanentEmployee() {
		super();
	}
	public PermanentEmployee(String empFirstName, String empLastName, double empSalary, String empGrade,
			LocalDate empDate) {
		super(empFirstName, empLastName, empSalary, empGrade, empDate);
		pempId++;
		peId = pempId;
		
	}
	
	public static int getPempId() {
		return pempId;
	}
	public static void setPempId(int pempId) {
		PermanentEmployee.pempId = pempId;
	}	

	public int getPeId() {
		return peId;
	}
	public void setPeId(int peId) {
		this.peId = peId;
	}
	@Override
	public double getEmpSalary() {
		return empSalary;
	}
	@Override
	public double mediclaim() {
		return  this.getEmpSalary();
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [peId=" + peId + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", EmpSalary=" + getEmpSalary() + "]";
	}
	
	
	

	
	
	
	
}
