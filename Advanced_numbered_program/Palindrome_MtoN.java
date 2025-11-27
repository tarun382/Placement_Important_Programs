package Advanced_numbered_program;

import java.util.Scanner;

public class Palindrome_MtoN {
	
	public static void prime(int m,int n) {
		for(int i=m;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0)
					count++;
			}
			if(count==1)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring range: ");
		int m=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int n=sc.nextInt();
		prime(m,n);
	}
}
