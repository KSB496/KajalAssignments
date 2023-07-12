package selfreview;

public class Example1 {

	public static void main(String[] args) {
		
		int intValOne = 0;
		int intValTwo = 0;
		for(short index=0; index < 5; index++) {
			if((++intValOne > 2) || (++intValTwo > 2)) {
				System.out.println(intValOne + " " + intValTwo);
				intValOne++;
				System.out.println("inside " + intValOne);
			}
		}
		System.out.println("Outside : " + intValOne + " " + intValTwo);
	}

}
