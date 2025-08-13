package array;
import java.util.Scanner;
public class MatrixAddition {
	public static void main(String [] args) {
		int row1,col1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size:");
		row1 = sc.nextInt();
		System.out.println("Enter the column size:");
		col1 = sc.nextInt();
		int[][] matrix1 = new int[row1][col1];
		System.out.println("Enter the first matrix elements:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}


		int row2,col2;
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the row size:");
		row2 = sc.nextInt();
		System.out.println("Enter the column size:");
		col2 = sc.nextInt();
		int[][] matrix2 = new int[row2][col2];
		System.out.println("Enter the second matrix elements:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				matrix2[i][j] = cs.nextInt();
			}
		}
		System.out.println("The first matrix:\n");
		 for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					System.out.print(matrix1[i][j]+"\t");
				}
				System.out.println("\n");}
		 System.out.println("The second matrix:\n");
		 for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					System.out.print(matrix2[i][j]+"\t");
				}
				System.out.println("\n");}

		if(row1 == row2 && col1 == col2) {
			int [][] matrix3 = new int[row1][col1];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
			       matrix3[i][j] = matrix1[i][j] + matrix2[i][j] ;
			       }
			}
			System.out.println("The resultant matrix:\n");
			       for(int i=0;i<row1;i++) {
						for(int j=0;j<col1;j++) {
							System.out.print(matrix3[i][j]+"\t");
						}
						System.out.println("\n");
		
				
	
}
			       }
		else {
			System.out.println("Addition is not possible");
		}
			
		
		
	}
}
		
	
