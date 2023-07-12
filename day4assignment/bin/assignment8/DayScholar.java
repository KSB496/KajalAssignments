package assignment8;

public class DayScholar extends Student {

	private String residentialAddress;

	public DayScholar() {
		super();
	}

	public DayScholar(int studentId, char studentType, String firstName, String lastName, double feesPerMonth, String residentialAddress) {
		super(studentId, studentType, firstName, lastName, feesPerMonth);
		this.residentialAddress = residentialAddress;
		// TODO Auto-generated constructor stub
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residential Address : " + residentialAddress);
	}

	@Override
	protected void calculateFees(double semesterFees) {
		// TODO Auto-generated method stub
		feesPerMonth = semesterFees / 6.0;
	}
}
