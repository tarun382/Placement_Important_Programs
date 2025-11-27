package Medium_number_programs;

import java.util.Scanner;

public class sum_of_digits_of_given_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}
