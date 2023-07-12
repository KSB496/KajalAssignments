package lab4;

import java.time.LocalDate;

public class ProjectManager extends PermanentEmployee {

	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(String empFirstName, String empLastName, double empSalary, String empGrade,
			LocalDate empDate) {
		super(empFirstName, empLastName, empSalary, empGrade, empDate);
		// TODO Auto-generated constructor stub
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
		return "PermanentEmployee [peId=" + getPeId() + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", EmpSalary=" + getEmpSalary() + ", EmpMediclaim=" + mediclaim() + "]";
	}
}
