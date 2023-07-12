package lab5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.runner.Request;

public class Employee extends EmployeeSalary {

	protected static int empId;
	private String empName;
	protected double empSalary;
	private String empGrade;
	private LocalDate empDate;
	protected int eId;

	public Employee(String empFirstName, String empLastName, String empGrade, LocalDate empDate) {
		super();
		empId++;
		eId = empId;
		this.empName = empFirstName + empLastName;
		this.empGrade = empGrade;
		//this.empDate = empDate;
		//date1 = new SimpleDateFormat("dd-mm-yyyy").parse(empDate);
		this.empDate = empDate;
		
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getEmpId() {
		return empId;
	}
	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}
	public LocalDate getEmpDate() {
		return empDate;
	}
	public void setEmpDate(LocalDate empDate) {
		this.empDate = empDate;
	}
	
	public double mediclaim() {
		return  empSalary;
	}

	@Override
	public String toString() {

		return "Employee [ empId=" + eId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade=" + empGrade + ", empDate="
				+ empDate + "]";
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return empSalary;
	}

}
