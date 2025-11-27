package Medium_array_programs;

import java.util.Scanner;

public class Calculate_sum_first_and_last {
	
	public static void first_and_last(int[] a) {
		int first=a[0];
		int last=a[a.length-1];
		int sum=first+last;
		System.out.println(sum);
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
		
		first_and_last(a);
		sc.close();
	}
}
