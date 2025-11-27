package Medium_number_programs;

import java.util.Scanner;

public class power_of_each_digit_to_the_count_of_number {
	
	public static void each_power(int num) {
		int num1=num;
		int num2=num;
		int count=0;
		while(num1>0) {
			count++;
			num1=num1/10;
		}
		while(num2>0) {
			
			int ld=num2%10;
			int expo=1;
				for(int j=0;j<count;j++) {
					expo=expo*ld;
				}
				System.out.println(ld+" power is: "+expo);
				num2=num2/10;
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		each_power(num);
	}
}
