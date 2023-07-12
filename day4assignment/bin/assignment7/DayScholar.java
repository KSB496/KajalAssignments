package assignment7;

public final class DayScholar extends Student {
	
	private String residentialAddress;
	
	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DayScholar(int sId, char sType, String sName, double feesPerMonth,String residentialAddress) {
		super();
		this.residentialAddress = residentialAddress;
	}

	public void setResAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public void displayDaySDetails() {
		System.out.println("Residential Address : " +residentialAddress);
	}

}
