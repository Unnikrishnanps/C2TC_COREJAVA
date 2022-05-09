import java.util.Arrays;
import java.util.Scanner;
public class anagrams {
	
	static boolean isAnagram(String str1, String str2)
	{
		boolean status=true;
		if(str1.length()!=str2.length())
		{
			status=false;
		}
		else
		{
			char[] ArrayS1=str1.toLowerCase().toCharArray();
			char[] ArrayS2=str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1,ArrayS2);
		}
		return status;
	}
      public static void main(String[] args) {
		Scanner arg = new Scanner(System.in);
		System.out.println("enter the strings:");
		String str1= arg.next();
		String str2= arg.next();
		boolean status=isAnagram(str1,str2);
		if(status)
			System.out.println(str1+ " and "+str2+" are anagrams");
		else
			System.out.println(str1+" and "+str2+" are not anagrams");	
		}	

}