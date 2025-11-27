package Advanced_numbered_program;

import java.util.Scanner;

public class perfect_number_MtoN {
	
	public static void perfect_num(int m,int n) {
		for(int i=m;i<=n;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting range: ");
		int m=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int n=sc.nextInt();
		perfect_num(m,n);
	}
}
