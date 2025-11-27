package Medium_number_programs;

import java.util.Scanner;

public class Product_prime_from_m_to_n {
	public static void product_prime(int m,int n) {
		int product=1;
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==0)
				product=product*i;
		}
		System.out.println("Sum of the primes in the range of m and n is: "+product);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring number...");
		int m = sc.nextInt();
		System.out.println("Enter the ending number...");
		int n=sc.nextInt();
		product_prime(m,n);
	}
}
