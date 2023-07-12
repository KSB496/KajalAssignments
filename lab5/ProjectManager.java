package lab5;

import java.time.LocalDate;

public class ProjectManager extends PermanentEmployee {

	private int yearsExperience;
	
	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(String empFirstName, String empLastName, String empGrade,
			LocalDate empDate, int yearsExperience) {
		super(empFirstName, empLastName, empGrade, empDate);
		// TODO Auto-generated constructor stub
		this.yearsExperience = yearsExperience;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return 10000 * yearsExperience;
	}
	@Override
	public double mediclaim() {
		return  calculateSalary();
	}
	
	@Override
	public String toString() {
		return "PermanentProjectManagerEmployee [peId=" + getPeId() + ", EmpName="
				+ getEmpName() + ", Designation=" + "PM" + ", YearsOfExperience=" + yearsExperience + "]";
	}
}
