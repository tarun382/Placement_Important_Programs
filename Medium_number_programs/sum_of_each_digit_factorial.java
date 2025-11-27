package Medium_number_programs;

import java.util.Scanner;

public class sum_of_each_digit_factorial {
	public static void Sum_of_factorials(int num) {
		int sum=0;
		while(num>0) {
			int factorial=1;
			int ld=num%10;
			for(int i=1;i<=ld;i++) {
				factorial=factorial*i;
				
			}
			sum=sum+factorial;
			num=num/10;
			System.out.println("Factorial of the "+ld+" is "+factorial);
		}
		System.out.println("Sum of Each factorial: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		Sum_of_factorials(num);
	}
}
