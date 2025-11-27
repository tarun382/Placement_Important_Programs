package Medium_number_programs;

import java.util.Scanner;

public class nth_prime_number {
	public static void nth_prime(int nth) {
		int count=0;
		for(int i=1;;i++) {
			int count1=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0)
					count1++;
			}
			if(count1==1) {
				count++;
				if(count==nth) {
					System.out.println(nth+" prime number is: "+i);
					break;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int nth=sc.nextInt();
		nth_prime(nth);
	}
}
