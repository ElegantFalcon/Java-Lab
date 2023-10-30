import java.util.Scanner; 
class BankFunction{
	String name;
	long accNo;
	String accType;
	long balance;
	Scanner in = new Scanner(System.in);
	public void initAcc(){
		System.out.println("Enter your name : ");
		name=in.nextLine();
		System.out.println("Enter the account number : ");
		accNo=in.nextLong();
		System.out.println("Enter the account type : ");
		accType=in.next();
		System.out.println("Enter the balance amount   : ");
		balance=in.nextLong();
		}
		
	public void displayAcc(){
		System.out.println("Name : " + name);
		System.out.println("Account number : "+ accNo);
		System.out.println("Account type : " + accType);
		System.out.println("Balance amount   : " + balance);
		}
		
        public void deposit() {  
		long amt;  
		System.out.println("Enter the amount you want to deposit: ");  
		amt = in.nextLong();  
		balance = balance + amt;  
	    }  
    
    	public void withdrawal() {  
		long amt;  
		System.out.println("Enter the amount you want to withdraw: ");  
		amt = in.nextLong();  
		if (balance >= amt) {  
		    balance = balance - amt;  
		    System.out.println("Balance after withdrawal: " + balance);  
		} else {  
		    System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
		}  
	    }  
	}
	
	public class bank {  
        public static void main(String arg[]) {  
        Scanner in = new Scanner(System.in);         
        BankFunction p1 = new BankFunction();  
       
        int ch;            
            System.out.println("-------------------------------------Bank----------------------------------- ");  
             p1.initAcc();  
        
            
                
	      p1.displayAcc();                           
	     
			
		p1.deposit();  
		p1.displayAcc();
		
		p1.withdrawal();  
		p1.displayAcc();
		                                                                    


		
		
                }  
              
            }  
           
        
    
