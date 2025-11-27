package Medium_array_programs;

import java.util.Scanner;

public class sum_of_all_primes {
	
	public static void sum_of_prime(int []a) {
		int n=0;
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int count=0;
			for(int j=1;j<=num/2;j++) {
				if(num%j==0)
					count++;
				
			}
			if(count==1)
				n=n+a[i];
		}
		System.out.println(n);;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements with size "+size+": ");
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		sum_of_prime(a);
		sc.close();
	}
}
