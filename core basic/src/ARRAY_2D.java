

import java.util.Scanner;

public class ARRAY_2D {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){                         //create input
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();	
		}
      }
		for(int i=0;i<rows;i++){                       //print input
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<rows;i++){                       //print transpose
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}