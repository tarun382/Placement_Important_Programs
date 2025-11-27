package Medium_number_programs;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci(int nth) {
		int count=0;
		int a=0;
		int b=1;
		for(int i=1;i<=nth;i++) {
			count++;
			if(count==nth) {
				System.out.println(a);
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int nth=sc.nextInt();
		fibonacci(nth);
	}
}
