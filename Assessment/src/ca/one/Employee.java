// E7321008
package ca.one;
import java.util.Scanner;
class EmployeeDetails {
	
	String emp_name, Address, mail_id;
	int emp_ID;
	long mobile_number;
	Scanner sc = new Scanner(System.in);
	// Getting details from the Employee
	void details() 
	{
		System.out.println("Enter name of the Employee");
		emp_name = sc.next();
		System.out.println("Enter the Mail ID : ");
		mail_id=sc.next();
		System.out.println("Enter Address of Employee : ");
		Address = sc.next();
		System.out.println("Enter Employee Id");
		emp_ID = sc.nextInt();
		System.out.println("Enter Mobile Number");
		mobile_number = sc.nextLong();
		
	}
	// Printing the details of employee using display() method
	void display() 
	{
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee Id : "+emp_ID);
		System.out.println("Mail ID : "+mail_id);
		System.out.println("Address : "+Address);
		System.out.println("Mobile Number : "+mobile_number);
	}
}
	// Inheriting attributes of  Employee Details to Assistant professor
class AsstProfessor extends EmployeeDetails {
		double salary,bp,da,hra,pf,club,net,gross;
		// Getting Basic Pay
		void asstprof_BasicPay() 
		{
			System.out.println("Enter Basic Pay");
			bp = sc.nextDouble();
		}
		// Calculating the pay bill for assistant professor
		void calc_AsstProf() 
		{
			hra = (0.10*bp);
			da = (0.97*bp);
			pf = (0.12*bp);
			club=(0.1*bp);
			gross=(bp+da+hra);
			net=(gross-pf-club);
			// Printing the calculated bill
			System.out.println("\n********************** Pay Slip For Assistant Professor **********************\n");
			System.out.println("Basic Pay : "+bp);
			System.out.println("HRA : "+hra);
			System.out.println("DA : "+da);
			System.out.println("PF : "+pf);
			System.out.println("CLUB : "+club);
			System.out.println("GROSS PAY : "+gross);
			System.out.println("NET PAY : "+net);
		}
	}

//Inheriting attributes of  Employee Details to Associate professor
class AssocProfessor extends EmployeeDetails {
		double salary,bp,da,hra,pf,club,net,gross;
		// Getting Basic Pay
		void associateprof_BasicPay() 
		{
			System.out.println("Enter Basic Pay");
			bp = sc.nextDouble();
		}
		// Calculating the pay bill for associate professor
		void calc_AssociateProf() 
		{
			hra = (0.12*bp);
			da = (0.97*bp);
			pf = (0.14*bp);
			club=(0.1*bp);
			gross=(bp+da+hra);
			net=(gross-pf-club);
			System.out.println("\n********************** Pay Slip For Associate Professor **********************\n");
			System.out.println("Basic Pay : "+bp);
			System.out.println("HRA : "+hra);
			System.out.println("DA : "+da);
			System.out.println("PF : "+pf);
			System.out.println("CLUB : "+club);
			System.out.println("GROSS PAY : "+gross);
			System.out.println("NET PAY : "+net);
		}
	}



public class Employee {

	public static void main(String[] args) {
		int choice, cont;
		do
		{
			System.out.println("1.ASSISTANT PROFESSOR \t 2.ASSOCIATE PROFESSOR");
			System.out.println("Enter Your Choice : ");
					Scanner sc = new Scanner(System.in);			
					choice=sc.nextInt();
					switch(choice)
					{
					
					case 1:

					{
						//Creating object for class AsstProfessor
						AsstProfessor asst = new AsstProfessor();
						// Calling the required methods using the class reference object
						asst.details();
						asst.asstprof_BasicPay();
						asst.display();
						asst.calc_AsstProf();
						break;	
					}
					
					case 2:
					{
						//Creating object for class AssociateProfessor
						AssocProfessor asst = new AssocProfessor();
						// Calling the required methods using the class reference object
						asst.details();
						asst.associateprof_BasicPay();
						asst.display();
						asst.calc_AssociateProf();
						break;	
					}
					
		}
					System.out.println("Please enter 0 to quit and 1 to continue:  ");
					cont=sc.nextInt();
					}while(cont==1);
		
	}

}
