package Medium_number_programs;

import java.util.Scanner;

public class Multiplication_table_number {
	public static void multiplication(int num,int end) {
		System.out.println("Multiplication table for "+num+":");
		for(int i=1;i<=end;i++) {
			int m = num*i;
			System.out.println(num+" X "+i+" = "+m);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for multiplication table");
		int i = sc.nextInt();
		System.out.println("Enter the end of a table");
		int end = sc.nextInt();
		multiplication(i,end);
	}
}
