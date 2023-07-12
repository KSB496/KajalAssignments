package ass7;

public class Student {

	public Student(int studentId, char studentType) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
	}
	private int studentId;
	public Student() {
		super();
		studentId = 10;
		studentType = 'F';
		System.out.println("Inside Student Constructor");
	}
	private char studentType;
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
	
	
}
