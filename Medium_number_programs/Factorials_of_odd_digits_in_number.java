package Medium_number_programs;

import java.util.Scanner;

public class Factorials_of_odd_digits_in_number {
	public static void odd_factorials(int num) {
		while(num>0) {
			int factorial=1;
			int ld=num%10;
			if(ld%2==1) {
				for(int i=1;i<=ld;i++) {
					factorial=factorial*i;	
				}
				System.out.println("Factorial of the "+ld+" is "+factorial);
			}
			num=num/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		odd_factorials(num);
	}
}
