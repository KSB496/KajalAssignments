package selfreview;

public class TestCount implements Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCount test = new TestCount();
		test.countUp();
	}

	@Override
	public void countUp() {
		// TODO Auto-generated method stub
		for(int x=6; x>counter; x--) {
			
			System.out.println(" " +counter);
		}
	}

}
