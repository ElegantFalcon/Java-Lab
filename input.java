import java.util.*;
public class input{
	public static void main(String[] args) 
		{
		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int height = scn.nextInt();
		double hypotenuse = Math.sqrt((base*base)+(height*height));
		System.out.println("Entered base : " + base);
		System.out.println("Entered height : " + height);
		System.out.println("Hypotenuse : " + hypotenuse);
		}
}


