package Medium_number_programs;

import java.util.Scanner;

public class binary_number {
	public static void binary_number(int num) {
		int place=1;
		int binary=0;
		int temp=num;
		while(num>0 ) {
			int rem=num%2;
			binary=binary+(rem*place);
			place=place*10;
			num=num/2;
		}
		System.out.println(temp+" binary representation is: "+binary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		binary_number(num);
	}
}
