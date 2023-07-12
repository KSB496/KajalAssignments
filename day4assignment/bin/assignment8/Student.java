package assignment8;

public abstract class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	protected abstract void calculateFees(double semesterFees);
	
	public Student() {
		super();
	}
	
	public Student(int studentId, char studentType, String firstName, String lastName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		studentName = firstName + lastName;
		this.feesPerMonth = feesPerMonth;
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
		studentName = firstName + lastName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Type : " + studentType);
		System.out.println("Student Name : " + studentName);
		System.out.println("Fees Per Month : " + feesPerMonth);
	}
}
