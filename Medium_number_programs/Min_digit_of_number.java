package Medium_number_programs;

import java.util.Scanner;

public class Min_digit_of_number {
	public static void Min_digit(int num) {
		int minimum=9;
		while(num>0) {
			int ld = num%10;
			if(ld<minimum) {
				minimum=ld;
			}
			num=num/10;
		}
		System.out.println("Minimun digit of number: "+minimum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Min_digit(num);
	}
}
