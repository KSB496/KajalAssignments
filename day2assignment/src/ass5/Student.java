package ass5;

public class Student {

	private int studentId;
	public Student() {
		super();
		studentId = 10;
		studentType = 'F';
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
