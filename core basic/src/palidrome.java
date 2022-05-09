import java.util.Scanner;

public class palidrome {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0) {
			int digit=temp%10;
			rev=(rev*10)+digit;
			temp=temp/10;
		}
		if(rev==num)
			System.out.println(num+" "+"is a pallindrome");
		else
			System.out.println(num+ " "+"is not a pallindrome");		

	}

}