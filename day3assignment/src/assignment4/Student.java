package assignment4;

public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	
	public Student() {
		super();
		studentId = 10;
		studentType = 'F';
	}
	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		studentName = firstName + lastName;
		System.out.println(studentName);
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
	
}
