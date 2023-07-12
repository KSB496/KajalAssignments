package com.seed.employee.contract;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.seed.employee.Certification;

public class ContractTechnicalAssociate extends ContractBasedEmployee implements Certification {

	private List<String> ctaCertificate;
	
	public ContractTechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractTechnicalAssociate(String empFirstName, String empLastName,	LocalDate empDate, String contractorName, double wage, double noOfHours, List<String> ctaCertificate) {
		super(empFirstName, empLastName, empDate, contractorName, wage, noOfHours);
		// TODO Auto-generated constructor stub
		this.ctaCertificate = ctaCertificate;
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		if(noOfHours <= 40)
			return wage * noOfHours;
		else
			return 40 * wage + (noOfHours-40) * wage * 2;
	}

	@Override
	public String toString() {
		return "ContractBasedTechnicalAssociateEmployee [ceId=" + getCeId() + ", EmpName="
				+ getEmpName() + ", contractorName=" + contractorName + ", Designation=" + "TA-C" + ", EmpCertiList=" + certiList() + ", EmpSalary=" + calculateSalary() + "]";
	}

	@Override
	public List<String> certiList() {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.addAll(ctaCertificate);
		return a1;
	}
}
