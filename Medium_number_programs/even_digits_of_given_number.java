package Medium_number_programs;

import java.util.Scanner;

public class even_digits_of_given_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		System.out.println("Even digits of number: ");
		while(num>0) {
			int ld=num%10;
			
			if(ld%2==0)
				System.out.print(ld+" ");
			num=num/10;
		}
		
	}
}
