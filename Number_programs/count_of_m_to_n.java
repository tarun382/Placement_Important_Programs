package Number_programs;

import java.util.Scanner;

public class count_of_m_to_n {
	public int count(int m, int n) {
		int count =0;
		for(int i=m;i<=n;i++) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting m value");
		int m = sc.nextInt();
		System.out.println("Enter the ending n value");
		int n = sc.nextInt();
		
		count_of_m_to_n s = new count_of_m_to_n();
		System.out.println("Sum of numbers from "+m+" to "+n+" range is: "+s.count(m,n));
	}
}
