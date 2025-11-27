package Medium_number_programs;

import java.util.Scanner;

public class LCM_number {
	
	public static int hcf(int num1,int num2) {
		int rem=0;
		while(num2>0) {
			rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		return num1;
	}
	public static int lcm(int num1,int num2) {
		return (num1*num2)/hcf(num1,num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("The lcm of "+num1+" and "+num2+" is:"+lcm(num1,num2));
	}
}
