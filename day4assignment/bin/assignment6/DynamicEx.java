package assignment6;

public class DynamicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dayScholar = new DayScholar();
		DayScholar ds = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		ds.setStudentId(1002);
		ds.setStudentType('A');
		ds.setStudentName("Deny");
		ds.setResAddress("181 Broadway");
		dayScholar.getDetails();
		ds.getDetails();
	}

}
