package lab6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalAssociate extends PermanentEmployee implements Certification {

	private int yearsExperience;
	private int noOfCerti;
	private List<String> taCertificate;
	
	public TechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalAssociate(String empFirstName, String empLastName, String empGrade,
			LocalDate empDate, int yearsExperience, int noOfCerti, List<String> taCertificate) {
		super(empFirstName, empLastName, empGrade, empDate);
		// TODO Auto-generated constructor stub
		this.yearsExperience = yearsExperience;
		this.noOfCerti = noOfCerti;
		this.taCertificate = taCertificate;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return (5000 * yearsExperience) + (1000 * noOfCerti);
	}
	@Override
	public double mediclaim() {
		return  calculateSalary()*2;
	}
	
	@Override
	public String toString() {
		return "PermanentTechnicalAssociateEmployee [peId=" + getPeId() + ", EmpName="
				+ getEmpName() + ", Designation=" + "TA-P" + ", YearsOfExperience=" + yearsExperience + ", EmpCertiList=" + certiList() + "]";
	}

	@Override
	public List<String> certiList() {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.addAll(taCertificate);
		return a1;
	}
}
