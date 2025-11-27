package Medium_number_programs;

import java.util.Scanner;

public class decimal_number {
	public static void Decimal_number(int num) {
		int power=0;
		int decimal=0;
		int temp=num;
		while(num>0) {
			int ld=num%10;
			if(ld==1) {
				int expo=1;
				for(int i=1;i<=power;i++) {
					expo=expo*2;
				}
				decimal=decimal+expo;
			}
			power++;
			num=num/10;
		}
		System.out.println(temp+" decimal number is: "+decimal);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =sc.nextInt();
		Decimal_number(num);
	}
}
