import java.util.*;
public class season
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a month");
		int num = scn.nextInt();
		if(num==1 || num==2 || num==12)
		{
			System.out.println("Winter");
		}
		else if(num==3 || num==4 || num==5)
		{
			System.out.println("Spring");
		}
		else if(num==6 || num==7 || num==8)
		{
			System.out.println("Summer");
		}
		else if(num==9 || num==10 || num==11)
		{
			System.out.println("Autumn");
		}
		else
		{
			System.out.println("Bogus month");
		}
	}
}


