package lab6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractTechnicalAssociate extends ContractBasedEmployee implements Certification {

	private List<String> ctaCertificate;
	
	public ContractTechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractTechnicalAssociate(String empFirstName, String empLastName, String empGrade,
			LocalDate empDate, String contractorName, double ratePerHour, double noOfHours, List<String> ctaCertificate) {
		super(empFirstName, empLastName, empGrade, empDate, contractorName, ratePerHour, noOfHours);
		// TODO Auto-generated constructor stub
		this.ctaCertificate = ctaCertificate;
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
				+ getEmpName() + ", contractorName=" + contractorName + ", Designation=" + "TA-C" + ", EmpCertiList=" + certiList() + "]";
	}

	@Override
	public List<String> certiList() {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.addAll(ctaCertificate);
		return a1;
	}
}
