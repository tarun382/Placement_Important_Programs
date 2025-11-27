package Number_programs;

import java.util.Scanner;

public class Productofdigits_in_Givennumber {
	public static void product(int n) {
		int product=1;
		while(n>0) {
			int ld = n%10;
			product=product*ld;
			n=n/10;
		}
		System.out.print("product of the digits in given number: "+product);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		product(n);
	}
}
