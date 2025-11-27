package Medium_number_programs;

import java.util.Scanner;

public class Sum_of_prime_digits_in_num {
	public static void digit_prime(int num) {
		int sum=0;
		while(num>0) {
			int count=0;
			int ld=num%10;
			for(int i=1;i<=ld/2;i++) {
				if(ld%i==0)
					count++;
			}
			if(count==1)
				sum=sum+ld;
			num=num/10;
		}
		System.out.println("sum_of_prime_digits: "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		digit_prime(num);
	}
}
