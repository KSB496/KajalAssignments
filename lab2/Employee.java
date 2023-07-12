package lab2;

import java.time.LocalDate;

public class Employee {

	private static int empId;
	private String empName;
	protected double empSalary;
	private String empGrade;
	private LocalDate empDate;
	private int eId;
	

	public Employee(String empFirstName, String empLastName, double empSalary, String empGrade, LocalDate empDate) {
		super();
		empId++;
		eId = empId;
		this.empName = empFirstName + empLastName;
		this.empSalary = empSalary;
		this.empGrade = empGrade;
		this.empDate = empDate;
		
	}
	
	public Employee() {
		super();
		
	}

	public static int getEmpId() {
		return empId;
	}

	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}

	@Override
	public String toString() {

		return "Employee [ empId=" + eId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade=" + empGrade + ", empDate="
				+ empDate + "]";
	}
	
}
