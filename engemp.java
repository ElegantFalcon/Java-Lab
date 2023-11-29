class Employee{
	void display(){
		System.out.println("Name of the class is Employee");
	}
	void calcSalary(){
		System.out.println("Salary of Employee is 1111");
	}
}

class Engineer extends Employee{
	
	void displayrandom(){
	super.display();
	super.calcSalary();
	}
	
	void display(){
	
		System.out.println("Name of the class is Engineer");
	}
	void calcSalary(){
	
		System.out.println("Salary of Engineer is 222222");
	}
	
}

public class engemp{
	public static void main(String args[]){
		Engineer e = new Engineer();
		e.displayrandom();
		e.display();
		e.calcSalary();
		
	}
}
