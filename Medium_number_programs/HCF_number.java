package Medium_number_programs;

import java.util.Scanner;

public class HCF_number {
	
	public static void hcf(int num1,int num2) {
		int rem=0;
		while(num2>0) {
			rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		System.out.println(num1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		hcf(num1,num2);
	}
}
