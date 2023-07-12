package assignment5;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name : ");
		String userName = sc.nextLine();
		int userLength = userName.length();
		System.out.println("Length of String : " + userLength);
		System.out.println("Hi " + userName);
		System.out.println("Hi " + userName.toLowerCase());
		System.out.println("Hi " + userName.toUpperCase());
		if(userName.charAt(0) == 'a') {
			System.out.println("User Name starts with 'a' : " +userName);
		}
		else {
			System.out.println("User Name doesnot starts with 'a' : " +userName);
		}
		System.out.println("UserName replaced : " + userName.replace(userName, "SEED"));
		
		
	}

}
