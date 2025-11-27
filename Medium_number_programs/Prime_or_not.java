package Medium_number_programs;

import java.util.Scanner;

public class Prime_or_not {
	public static void prime (int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count!=2)
			System.out.println("Not a prime");
		else
			System.out.println("Prime number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		prime(num);
	}
}
