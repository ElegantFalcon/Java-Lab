import java.util.Scanner; 
public class prime {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int num,i,count=0;
		System.out.println("Enter the number : ");
		num=in.nextInt();
		for (i = 1; i <= num; i++) {
			if(num%i==0)
			count++;
		}
		if(count==2)
	        System.out.println(num + " is a prime number");
	        else
	        System.out.println(num + " is not a prime number");
	        }
	        }
		
		
