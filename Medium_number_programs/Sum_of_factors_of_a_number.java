package Medium_number_programs;

import java.util.Scanner;

public class Sum_of_factors_of_a_number {
	public static void sum_factors(int num) {
		int sum=0;
		for(int j=1;j<=num;j++) {
			if(num%j==0) {
				sum=sum+j;
				
			}
		}
		System.out.println("Sum of a factors: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring number...");
		int num = sc.nextInt();
		sum_factors(num);
	}
}

