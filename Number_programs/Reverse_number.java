package Number_programs;

import java.util.Scanner;

public class Reverse_number {
	public static void reverse(int n) {
		int num=0;
		while(n>0) {
			int ld = n%10;
			num=(num*10)+ld;
			n=n/10;
		}
		System.out.print("Reverse of a given number: "+num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		reverse(n);
	}
}
