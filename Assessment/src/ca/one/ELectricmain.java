// E7321008 
package ca.one;

import java.util.Scanner;

 class Electricbill {		
		
		int cnum,next_reading,pre_reading,tot,total_units;
		String name,connection;
		
		
		void domestic(int unit) {
			
			if(unit<=100) {
				  tot=unit*1;
				System.out.println("\nTotal Bill: "+tot);
				
			}
			if(unit>100 && unit<=200){ 
				float tot=unit*2.5f;
				System.out.println("\nTotal Bill: "+tot);
				
			}
			if(unit>200 && unit<=500){ 
				 tot=unit*4;
				System.out.println("\nTotal Bill: "+tot);
			}
			if(unit>500){ 
				 tot=unit*6;
				System.out.println("\nTotal Bill: "+tot);
			}
		}
		
		
void commercial(int unit) {
			
			if(unit<=100) {
				  tot=unit*2;
				System.out.println("\nTotal Bill: "+tot);
				
			}
			if(unit>100 && unit<=200){ 
				float tot=unit*4.5f;
				System.out.println("\nTotal Bill: "+tot);
				
			}
			if(unit>200 && unit<=500){ 
				 tot=unit*6;
				System.out.println("\nTotal Bill: "+tot);
			}
			if(unit>500){ 
				tot=unit*7;
				System.out.println("\nTotal Bill: "+tot);
			}
		}
}
public class ELectricmain extends Electricbill {
	int cnum,next_reading,pre_reading,tot,total_units;
	String name,connection;
	
	public void details() {
		Electricbill eb = new Electricbill();
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the consumer number : ");
		 cnum = input.nextInt();
		System.out.println("enter the 'd' for Domestic or 'c' Commercial ");
		 connection = input.next();
		System.out.println("Enter Consumer Name : ");
		 name = input.next();
		if (connection.equals("d")) {
			System.out.println("Enter Previous Month Reading  : ");
			 pre_reading = input.nextInt();
			System.out.println("Enter Current Month reading : ");
			 next_reading = input.nextInt();	
			 total_units=next_reading-pre_reading;
			eb.domestic(total_units);
		}
		if (connection.equals("c")) {
			System.out.println("Enter Previous Month Reading  : ");
			 pre_reading = input.nextInt();
			System.out.println("Enter Current Month reading : ");
			 next_reading = input.nextInt();	
			 total_units=next_reading-pre_reading;
			eb.commercial(total_units);
		}
	}
	
	
		public void display(){
			
			System.out.println("Consumer Number : "+cnum);
			System.out.println("Consumer Name : "+name);
			if (connection.equals("d")) {
				System.out.println("Type of Connection : Domestic ");
			}
			if (connection.equals("c")) {
				System.out.println("Type of Connection : Commercial ");
			
			}
			System.out.println("Current Month Reading : "+next_reading);
			System.out.println("Previous Month Reading : "+pre_reading);
			System.out.println("Total Units : "+total_units);
			
		}
		
		public static void main(String[] args) {
			ELectricmain eb1 = new ELectricmain();
			eb1.details();
			eb1.display();
			
		}
}

