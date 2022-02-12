// E7321008
package ca.one;

import java.util.Scanner;
// Creating a public class Handshake
public class Handshake {

	public static void main(String[] args) {
		// Getting the number of inputs to be given 
		System.out.println("Enter the number of inputs to be given: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		for(int i=0;i<num;i++) {
			// Getting number of persons in the party
			System.out.println("Enter the number of persons in the party: ");
			int num_person=input.nextInt();
			// Calculating the minimum time required for handshake
			int min_time=num_person * (num_person - 1) / 2;
			System.out.println(min_time);
		}

	}

}
