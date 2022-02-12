// E7321008
package ca.one;

import java.util.Scanner;

public class Occurance {

	static int count_num(int num)
	{
		int count = 0;
		while (num > 0)
			{
				if (num % 10 == 3)
					{
						count++;
					}
		num = num / 10;
			}
		return count;
	}

	static int count_index(int indx)
	{
	int count = 0 ;
	for (int i = 2; i <= indx; i++)
		{
			count += count_num(i);
		}
	return count;
	}
	
	
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = input.nextInt();
		System.out.print(count_index(number));
	}

}
