package assignment8;

public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	public Student() {
		super();
	}

	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName + lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + lastName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
		//System.out.println("Semester Fees per Month : "+feesPerMonth);
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees/6.0;
		feesPerMonth = feesPerMonth + hostelFees;
		//System.out.println("Fees per Month : "+feesPerMonth );
	}
	
	
	
	
}
