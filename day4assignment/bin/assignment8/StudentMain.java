package assignment8;

public class StudentMain {

	public static void main(String[] args) {
		Student st;
		
		String residentialStatus = args[0];
		
		if(residentialStatus.equals("Hostelite")) {
			Hostelite student = new Hostelite(101,'A',"Kajal","Bhagat",700.00,"NJIT",202);
			student.calculateFees(12000);
			student.displayStudentDetails();
		}
		else {
			DayScholar student = new DayScholar(102,'A',"Krishna","Patel",1000.00,"Martin Jr. Bvld");
			student.calculateFees(12000);
			student.displayStudentDetails();
		}
		
	}

}
