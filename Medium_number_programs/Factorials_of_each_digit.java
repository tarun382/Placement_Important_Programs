package Medium_number_programs;

import java.util.Scanner;

public class Factorials_of_each_digit {
	public static void factorials(int num) {
		while(num>0) {
			int factorial=1;
			int ld=num%10;
			for(int i=1;i<=ld;i++) {
				factorial=factorial*i;	
			}
			num=num/10;
			System.out.println("Factorial of the "+ld+" is "+factorial);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		factorials(num);
	}
}
