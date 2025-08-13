package array;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String [] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size:");
		m = sc.nextInt();
		System.out.println("Enter the column size:");
		n = sc.nextInt();
		int[][] matrix = new int[m][n];
		System.out.println("Enter the matrix elements:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Matrix:\n");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("Transpose matrix:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println("\n");	
		
		
		
	}

}}
