package assignment3;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		String arr[][] = new String[4][];
		
		arr[0] = new String[] {"Tony", "JAVA", "C" ,"C++"};
		arr[1] = new String[] {"Thomas", "JAVA", "UNIX"};
		arr[2] = new String[] {"Dinil", "Linux", "Oracle"};
		arr[3] = new String[] {"Delvin", "RDBMS", "C#" ,"ORACLE"};
		
		
		for (int i=0; i< arr.length; i++) {
			for (int j=0;j<arr[i].length;j++) {
				if(arr[i][0] == "Delvin"){
				System.out.print(arr[i][j] + " "); }
			}
			System.out.println();
		}	

	}

}
