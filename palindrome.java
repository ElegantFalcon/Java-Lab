import java.util.Scanner;
public class palindrome{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num,rem,temp,sum=0;
		System.out.println("Enter a number : ");
		num=in.nextInt();
		temp=num;
		while(num!=0){
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
			}
		if(sum==temp)
		System.out.println("Palindrome number");
		else
		System.out.println("Not a palindrome number");
		}
		}
		
			
