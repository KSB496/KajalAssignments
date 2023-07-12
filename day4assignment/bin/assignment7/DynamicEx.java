package assignment7;

public class DynamicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Robert", "Thomas");
		dayScholar.setResAddress("181 Broadway");
		dayScholar.calculateFees();
		dayScholar.displayDetail();
		dayScholar.displayDaySDetails();
	}

}
