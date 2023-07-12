package ass4;

public class CourseManagement {

	public static void main(String[] args) {
		
		int id = 101;
		char type = 'A';
		Student student = new Student();
		
		student.setStudentId(id);
		student.setStudentType(type);
		
		System.out.println("Student Id : " + student.getStudentId() + "\nStudent Type : " + student.getStudentType());
	}

}
