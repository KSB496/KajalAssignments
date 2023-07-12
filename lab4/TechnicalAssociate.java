package lab4;

import java.time.LocalDate;

public class TechnicalAssociate extends PermanentEmployee {

	public TechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalAssociate(String empFirstName, String empLastName, double empSalary, String empGrade,
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
		return  this.getEmpSalary()*2;
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [peId=" + getPeId() + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", EmpSalary=" + getEmpSalary() + ", EmpMediclaim=" + mediclaim() + "]";
	}
}
