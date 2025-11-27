package Medium_number_programs;

import java.util.Scanner;

public class sum_of_smallest_largest_digit {
	
	public static int smallest_digit(int num) {
		int smallest=9;
		while(num>0) {
			int ld =num%10;
			if(smallest>ld) {
				smallest=ld;
			}
			num=num/10;
		}
		return smallest;
	}
	public static int largest_digit(int num) {
		int largest=0;
		while(num>0) {
			int ld =num%10;
			if(largest<ld) {
				largest=ld;
			}
			num=num/10;
		}
		return largest;
	}
	
	public static void sum_smallest_largest(int num) {
		int largest=largest_digit(num);
		int smallest=smallest_digit(num);
		int sum=largest+smallest;
		System.out.println("Sum of the both largest and smallest digits: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sum_smallest_largest(num);
	}
}
