import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		 int n;
		    n=ab.nextInt();
		    if((n&1)==1)
				System.out.println("odd");
			else
				System.out.println("even");
	
	}

}