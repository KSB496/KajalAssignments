package selfreview;

public class StaticDemo1 {

	private static int num;
	
	static void display() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {		
		StaticDemo.display();
		StaticDemo1.display();
	}
	
}
