import java.util.Scanner;

public class Searchh {

	public static void main(String[] args) {
		int flag=-1;
		Scanner c=new Scanner(System.in);
		int size=c.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=c.nextInt();
		int key=c.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=i;
				break;
			}
		}
    if(flag!=-1)
	   System.out.println("Index postition of "+ key +"is:"+flag);
    else
	   System.out.println("Element not found");
	}

}