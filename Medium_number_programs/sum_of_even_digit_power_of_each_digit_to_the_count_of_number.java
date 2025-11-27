package Medium_number_programs;

import java.util.Scanner;

public class sum_of_even_digit_power_of_each_digit_to_the_count_of_number {
	
	public static void sum_each_power(int num) {
		int num1=num;
		int num2=num;
		int count=0;
		int sum=0;
		while(num1>0) {
			count++;
			num1=num1/10;
		}
		while(num2>0) {
			int ld=num2%10;
			int expo=1;
			if(ld%2==0) {
				for(int j=0;j<count;j++) {
					expo=expo*ld;
				}
				sum=sum+expo;
			}
			
//			System.out.println(ld+" power is: "+expo);
			num2=num2/10;
		}	
		System.out.println("Sum of all each digit powers are: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sum_each_power(num);
	}
}
