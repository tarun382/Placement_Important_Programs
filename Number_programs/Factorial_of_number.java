package Number_programs;

import java.util.Scanner;

public class Factorial_of_number {
	public int Factorial(int a) {
		int factorial=1;
		for(int i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check factorial or not: ");
		int fact=sc.nextInt();
		Factorial_of_number f = new Factorial_of_number();
		System.out.println("Factorial of "+fact+" is: "+f.Factorial(fact)+".");
		
	}
}
