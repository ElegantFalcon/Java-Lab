import java.util.Scanner;
 
public class streverse
{
	public static void main(String args[])
	{
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();
		int length = str.length();
		for ( int i = length - 1; i >= 0; i-- )
		rev = rev + str.charAt(i);
		System.out.println("The reverse string is : " + rev);
}
}
