package assignment1;

public class Student {

	private int studentId;
	private char studentType;
	private String studentFirstName;
	private String studentLastName;
	private String studentName;
	
	private static int studentCount;
	
	static {
		studentCount = 10;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	/*public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}*/

	public Student() {
		super();
		studentId += 550;
		studentCount +=1;
		studentId = studentCount;
		System.out.println("StudentId " + studentId + " StudentCount " +studentCount);
	}

	public Student(char studentType, String studentFirstName, String studentLastName) {
		// super();
		this();
		this.studentType = studentType;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;

		studentName = studentFirstName + studentLastName;
		System.out.println(studentName);
	}

	public void DisplayDetails(Student st) {
		System.out.println("Student ID : " + st.studentId + " Student Type : " + st.studentType + " Student Name : "
				+ st.studentName);

	}

	public static void main(String[] args) {

		//Student st = new Student();
		Student st1 = new Student('M', "Kajal", "Bhagat");
		Student studentOne = new Student('D', "Bony", "Thomas");
		Student studentTwo = new Student('H', "Dinil", "Bose");

		st1.DisplayDetails(st1);
		studentOne.DisplayDetails(studentOne);
		studentTwo.DisplayDetails(studentTwo);

	}

}
