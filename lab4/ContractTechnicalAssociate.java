package lab4;

import java.time.LocalDate;

public class ContractTechnicalAssociate extends ContractBasedEmployee {

	public ContractTechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractTechnicalAssociate(String empFirstName, String empLastName, double empSalary, String empGrade,
			LocalDate empDate, String contractorName, double ratePerHour, double noOfHours) {
		super(empFirstName, empLastName, empSalary, empGrade, empDate, contractorName, ratePerHour, noOfHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContractBasedEmployee [ceId=" + getCeId() + ", EmpName="
				+ getEmpName() + ", EmpGrade=" + getEmpGrade() + ", EmpDate=" + getEmpDate() + ", contractorName=" + contractorName + ", ratePerHour=" + ratePerHour
						+ ", noOfHours=" + noOfHours + ", empSalary=" + this.getEmpSalary() + "]";
	}
}
