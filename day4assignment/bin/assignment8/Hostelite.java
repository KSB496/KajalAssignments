package assignment8;

public class Hostelite extends Student{

	private String hostelName;
	private int roomNumber;
	
	public Hostelite() {
		super();
	}
	public Hostelite(int studentId, char studentType, String firstName, String lastName, double feesPerMonth, String hostelName, int roomNumber) {
		super(studentId, studentType, firstName, lastName, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Hostel Name : " + hostelName);
		System.out.println("Room Number : " + roomNumber);
	}
	@Override
	protected void calculateFees(double semesterFees) {
		// TODO Auto-generated method stub
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + 1200;
	}
}
