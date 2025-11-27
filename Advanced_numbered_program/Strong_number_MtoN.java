package Advanced_numbered_program;

import java.util.Scanner;

public class Strong_number_MtoN {
	
	public static void string_num(int m,int n) {
		for(int i=m;i<=n;i++) {	
			int sum=0;
			int temp=i;
			while(temp>0) {
			int ld = temp%10;
			int expo=1;
			for(int j=1;j<=ld;j++) {
				expo=expo*j;
			}
			sum=sum+expo;
			temp=temp/10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the staring range: ");
		int m=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int n = sc.nextInt();
		string_num(m,n);
	}
}
