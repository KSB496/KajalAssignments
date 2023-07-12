package assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		
		int id = 101;
		char type = 'A';
		String firstName = "Kajal";
		String lastName = "Bhagat";
		Student student = new Student();
		
		student.setStudentId(id);
		student.setStudentType(type);
		student.setStudentName(firstName, lastName);
		
		System.out.println("Student Id : " + student.getStudentId() + "\nStudent Type : " + student.getStudentType()
						+ "\nStudent studentName : " + student.getStudentName() + "\n");
		
		Student student1 = new Student(102,'A',"Kishu","Patel");
		System.out.println("\nStudent Id : " + student1.getStudentId() + "\nStudent Type : " + student1.getStudentType()
		+ "\nStudent StudentName : " + student1.getStudentName());

	}
}
