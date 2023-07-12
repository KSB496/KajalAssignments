package assignment7;

public class CourseManagement {

	public static void main(String[] args) {

		int id = Integer.parseInt(args[0]);
		String firstName = args[1];
		String lastName = args[2];
		String residentialStatus = args[3];
		long semesterFees = Long.parseLong(args[4]);
		long HostelFees = Long.parseLong(args[5]);

		Student student = new Student();

		student.setStudentId(id);
		student.setStudentName(firstName, lastName);
		student.setResidentialStatus(residentialStatus);
		if(residentialStatus.equals("Hostelite")) {
			student.setFeesPerMonth(HostelFees);
		}
		else { student.setFeesPerMonth(semesterFees); }
		
		System.out.println("Student Id : " + student.getStudentId() 
		+ "\nStudent Name : " + student.getStudentName()
		+ "\nStudent Residential Status : " + student.getResidentialStatus() 
		+ "\nStudent Fees : " + student.getFeesPerMonth() + "\n");

	}
}
