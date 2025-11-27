package Medium_number_programs;

import java.util.Scanner;

public class sum_of_prime_from_m_to_n {
	public static void sum_prime(int m,int n) {
		int sum=0;
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==1)
				sum=sum+i;
		}
		System.out.println("Sum of the primes in the range of m and n is: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring number...");
		int m = sc.nextInt();
		System.out.println("Enter the ending number...");
		int n=sc.nextInt();
		sum_prime(m,n);
	}
}
