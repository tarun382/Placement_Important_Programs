package Medium_number_programs;

import java.util.Scanner;

public class prime_from_m_to_n {
	public static void m_to_n_prime(int m,int n) {
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==0)
				System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring number...");
		int m = sc.nextInt();
		System.out.println("Enter the ending number...");
		int n=sc.nextInt();
		m_to_n_prime(m,n);
	}
}
