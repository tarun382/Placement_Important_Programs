package Number_programs;

import java.util.Scanner;

public class Fibonacci {
	public static void Fibonacci(int end) {
		int a=0,b=1;
		for(int i=0;i<=end;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end of series");
		int end=sc.nextInt();
		Fibonacci(end);
	}
}
