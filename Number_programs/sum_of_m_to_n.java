package Number_programs;

import java.util.Scanner;

public class sum_of_m_to_n {
	public int sum(int m, int n) {
		int sum =0;
		for(int i=m;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting m value");
		int m = sc.nextInt();
		System.out.println("Enter the ending n value");
		int n = sc.nextInt();
		
		sum_of_m_to_n s = new sum_of_m_to_n();
		System.out.println("Sum of numbers from "+m+" to "+n+" range is: "+s.sum(m,n));
	}
}
