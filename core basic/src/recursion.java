import java.util.Scanner;

public class recursion {
	
	static int count_digit(int digits)
	{
		if(digits<=9)
		{
			return 1;
		}
		else
		{
			return 1+count_digit(digits/10);
		}
	}
	public static void main(String[] args)
	{
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the digits");
		int digits = san.nextInt();
		int total_digits=count_digit(digits);
		System.out.println("Total number of digits is" +total_digits);
	}

}