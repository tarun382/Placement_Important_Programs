package Number_programs;

import java.util.Scanner;

public class product_of_m_to_n {
	public int product(int m, int n) {
		int product =1;
		for(int i=m;i<=n;i++) {
			product=product*i;
		}
		return product;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting m value");
		int m = sc.nextInt();
		System.out.println("Enter the ending n value");
		int n = sc.nextInt();
		
		product_of_m_to_n s = new product_of_m_to_n();
		System.out.println("Sum of numbers from "+m+" to "+n+" range is: "+s.product(m,n));
	}
}
