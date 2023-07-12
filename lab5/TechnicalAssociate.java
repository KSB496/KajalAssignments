package lab5;

import java.time.LocalDate;

public class TechnicalAssociate extends PermanentEmployee {

	private int yearsExperience;
	private int noOfCerti;
	
	public TechnicalAssociate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalAssociate(String empFirstName, String empLastName, String empGrade,
			LocalDate empDate, int yearsExperience, int noOfCerti) {
		super(empFirstName, empLastName, empGrade, empDate);
		// TODO Auto-generated constructor stub
		this.yearsExperience = yearsExperience;
		this.noOfCerti = noOfCerti;
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
				+ getEmpName() + ", Designation=" + "TA-P" + ", YearsOfExperience=" + yearsExperience + "]";
	}
}
