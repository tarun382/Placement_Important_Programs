package Number_programs;

import java.util.Scanner;

public class Reverse_order_print_digits {
	public static void Reverse(int n) {
		while(n>0) {
			int ld = n%10;
			n=n/10;
			System.out.print(ld+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Reverse(n);
	}
}
