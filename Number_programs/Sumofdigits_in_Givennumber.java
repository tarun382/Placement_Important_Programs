package Number_programs;

import java.util.Scanner;

public class Sumofdigits_in_Givennumber {
	public static void sum(int n) {
		int sum=0;
		while(n>0) {
			int ld = n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.print("sum of the digits  in given number: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sum(n);
	}
}
