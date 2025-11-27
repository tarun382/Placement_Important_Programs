package Advanced_numbered_program;
import java.util.Scanner;
public class twisted_prime {
	public static void twisted_prime(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
		int temp=n;
		if(count==1) {
			int rev=0;
			int count1=0;
			while(temp>0) {
				int ld=temp%10;
				rev=(rev*10)+ld;
				temp=temp/10;
			}
			for (int j=1;j<=rev/2;j++ )
			{
				if (rev%j==0)
					count1++;
			}
			if(count1==1)
				System.out.println(n+" is a twisted pair number "+rev);
			else
				System.out.println(n+" is not a twisted pair number "+rev);
		}
		else
			System.out.println("Not a prime.");		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n =sc.nextInt();
		twisted_prime(n);
	}
}
