package assignment8;

public class CourseManagement {

	public static void main(String[] args) {

		Student student = new Student(101,'A',"Kajal","Bhagat");

		student.setResidentialStatus("Day Scholar");
		String rs = student.getResidentialStatus();
		if(rs == "Day Scholar") {
			student.calculateFees(1000);
		}
		else { student.calculateFees(1000, 1500); }
		
		System.out.println("Student Id : " + student.getStudentId() 
		+ "\nStudent Type : " + student.getStudentType()
 		+ "\nStudent Name : " + student.getStudentName()
		+ "\nStudent Residential Status : " + student.getResidentialStatus() 
		+ "\nStudent Fees : " + student.getFeesPerMonth() + "\n");


	}
}
