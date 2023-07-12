package ass3;

public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch(grade) {
		case 'A':
				System.out.println("Range of marks is 80 to 100");
				break;
		case 'B':
				System.out.println("Range of marks is 73 to 79");
				break;
		case 'C':
				System.out.println("Range of marks is 65 to 72");
				break;
		case 'D':
				System.out.println("Range of marks is 55 to 64");
				break;
		case 'E':
				System.out.println("Range of marks is less than 55");
				break;
		}
		

	}

}
