import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String A, B;
		Scanner sc=new Scanner(System.in);
		A=sc.nextLine();
		B=sc.nextLine();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(A.substring(0,1).toUpperCase()
				+A.substring(1)
				+" "
				+Character.toUpperCase(B.charAt(0))
				+B.substring(1));
	}
}