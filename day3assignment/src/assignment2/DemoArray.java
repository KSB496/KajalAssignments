package assignment2;

public class DemoArray {

	public static void main(String[] args) {
		
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		int sum=0;
		
		System.out.println("Matrix 1");
		
		for(int i=0;i<firstArrayMatrix.length;i++) {
			
			for (int j=0;j<firstArrayMatrix[i].length;j++) {
				System.out.print(firstArrayMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatrix 2");
		
		for(int i=0;i<secondArrayMatrix.length;i++) {
			
			for(int j=0;j<secondArrayMatrix[i].length;j++) {
				System.out.print(secondArrayMatrix[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("\nSum of the Matrices");
		
		for(int i=0; i<2; i++) {
			for(int j=0;j<3; j++) {
				
				sum = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}

	}

}
