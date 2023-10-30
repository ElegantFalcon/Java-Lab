import java.util.Scanner;
public class add{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num,sum=0;
		
		do{
		System.out.println("Enter the number : ");
		num=in.nextInt();
		sum = sum + num ; 
		}
		while(num!=0);
		System.out.println("Sum is : " +sum);
		
		}
		}
		
	
		
			
