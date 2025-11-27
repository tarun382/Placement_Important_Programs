package Medium_number_programs;

import java.util.Scanner;

public class count_of_digits_from_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("Count of digits of a given number is: "+count);
	}
}
