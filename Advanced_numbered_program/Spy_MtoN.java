package Advanced_numbered_program;

import java.util.Scanner;

public class Spy_MtoN {
	
	public static void spy(int m,int n) {
		for(int i=m;i<=n;i++) {
			int sum=0;
			int p=1;
			int temp=i;
			while(temp>0) {
				int ld = temp%10;
				sum=sum+ld;
				p=p*ld;
				temp=temp/10;
			}
			if(sum==p)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		int m=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int n=sc.nextInt();
		spy(m,n);
	}
}
