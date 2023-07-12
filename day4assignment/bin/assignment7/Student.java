package assignment7;

public class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setStudentId(int sId) {
		this.studentId = sId;
	}
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	public void setStudentName(String firstName,String lastName) {
		this.studentName = firstName + lastName;
	}
	
	public void calculateFees() {
		feesPerMonth = (int) (semesterFees / 6.0);
	}
	
	public void displayDetail() {
		System.out.println("Student ID : " +studentId);
		System.out.println("Student Type : " +studentType);
		System.out.println("Student Name : " +studentName);
		System.out.println("Student Semester Fees : " +semesterFees);
		System.out.println("Student Fees per Month : " +feesPerMonth);
	}
	
}
