import java.util.Scanner;

public class frequency{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str;
		char ch;
		int i,count=0;
		System.out.println("Enter the string : ");
		str = in.nextLine();
		System.out.println("Enter the character : ");
		ch = in.nextLine().charAt(0);      			
		for (i = 0; i < str.length(); i++) {
            		if (ch == str.charAt(i)) {
                		count++;
		}
       	        }
       	        System.out.println("The frequency is : " + count);
		}
		}
		 	
