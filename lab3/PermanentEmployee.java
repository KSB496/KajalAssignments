package lab3;

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
	
	@Override
	public double getEmpSalary() {
		return empSalary;
	}
	public static int getPempId() {
		return pempId;
	}
	public static void setPempId(int pempId) {
		PermanentEmployee.pempId = pempId;
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [peId=" + peId + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", EmpSalary=" + getEmpSalary() + "]";
	}
	
	
	

	
	
	
	
}
