package Advanced_numbered_program;

import java.util.Scanner;

public class Mega_prime {
	
	public static void megaPrime(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
		if(count==1) {
			int temp=n;
			int n1=0;
			int count2=0;
			while(temp>0) {
				int count1=0;
				int ld=temp%10;
				n1++;
				for(int i=1;i<=ld/2;i++) {
					if(ld%i==0)
						count1++;
				}
				
				if(count1==1)
					count2++;
				temp=temp/10;
			}
			if(count2==n1)
				System.out.println("Mega prime");
			else
				System.out.println("Not a mega prime");
			
		}else {
			System.out.println("Not a prime....");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		megaPrime(n);
	}
}
