package Medium_number_programs;

import java.util.Scanner;

public class Max_digit_of_number {
	public static void Max_digit(int num) {
		int largest=0;
		while(num>0) {
			int ld = num%10;
			if(ld>largest) {
				largest=ld;
			}
			num=num/10;
		}
		System.out.println("Largest digit of number: "+largest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Max_digit(num);
	}
}
