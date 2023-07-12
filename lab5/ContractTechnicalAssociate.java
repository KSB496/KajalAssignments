package lab5;

import java.time.LocalDate;

public class ContractTechnicalAssociate extends ContractBasedEmployee {

	public ContractTechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractTechnicalAssociate(String empFirstName, String empLastName, String empGrade,
			LocalDate empDate, String contractorName, double ratePerHour, double noOfHours) {
		super(empFirstName, empLastName, empGrade, empDate, contractorName, ratePerHour, noOfHours);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		if(noOfHours <= 40)
			return ratePerHour * noOfHours;
		else
			return 40 * ratePerHour + (noOfHours-40) * ratePerHour * 2;
	}

	@Override
	public String toString() {
		return "ContractBasedTechnicalAssociateEmployee [ceId=" + getCeId() + ", EmpName="
				+ getEmpName() + ", contractorName=" + contractorName + ", Designation=" + "TA-C" + "]";
	}
}
