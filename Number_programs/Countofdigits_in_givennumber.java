package Number_programs;

import java.util.Scanner;

public class Countofdigits_in_givennumber {
	public static void count(int n) {
		int count=0;
		while(n>0) {
			int ld = n%10;
			count++;;
			n=n/10;
		}
		System.out.print("count of the digits in given number: "+count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		count(n);
	}
}
