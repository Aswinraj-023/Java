// E7321008
package ca.one;
import java.util.Scanner;

class Work{
	String name;
	int empnum;
	Work(int employee_number,String employee_name){
		empnum=employee_number; 
		name=employee_name; 
		}
void display(){
	System.out.println("Employee number : "+empnum);
	System.out.println("Employee name: "+name);
	}
}
class DailyWorker extends Work{
int salary;
DailyWorker(int employee_number,String employee_name,int wage){
super(employee_number,employee_name);
salary=wage;
}
// taking hours as 15 as the the wages are calculated per day.
int hour=15;
void ComPay(){
	System.out.println("------------------------------------");
	display();
	// Calculating the salary
	System.out.println("Salary : "+(salary*hour));
}
}
class SalariedWorker extends Work{
int salary;
SalariedWorker(int employee_number,String employee_name,int wage){
super(employee_number,employee_name);
salary=wage;
}
// taking hours as 40 from the given question
int hour=40;
void ComPay(){
	System.out.println("------------------------------------");
	display();
	// Calculating the salary
	System.out.println("Salary : "+(salary*hour));
}
}

public class Worker {

	public static void main(String[] args) {
	DailyWorker dw=new DailyWorker(1618,"Rama",900);
	SalariedWorker sw=new SalariedWorker(1619,"Ranjani",400);
	dw.ComPay();
	sw.ComPay();	

	}

}
