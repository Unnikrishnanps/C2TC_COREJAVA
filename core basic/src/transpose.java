
import java.util.Scanner;

public class transpose {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row=sc.nextInt();
        System.out.println("enter number of coloum:");
        int col=sc.nextInt(); 
        int i;
        int j;
        int[][] matA=new int[row][col];
        System.out.println("enter"+row*col+"values");
        System.out.println("enter matrix values");
        for(i=0;i<row;i++)
        {
        	for(j=0;j<col;j++)
        		matA[i][j]=sc.nextInt();
        }
        System.out.println("the original matrix is: ");
        for(i=0;i<row;i++)
        {
        	for(j=0;j<col;j++)
        	{
        	System.out.print(matA[i][j]+"\t");
        	}
        	System.out.println();
        }
        System.out.println("Tranpose of matrix is:");
        for(i=0;i<col;i++)
        {	
        	for(j=0;j<row;j++)
        	{
        	System.out.print(matA[j][i]+"\t");
        	}
        	System.out.println();
        	
        }
} 
    
}