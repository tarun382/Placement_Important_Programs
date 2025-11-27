package Medium_array_programs;

import java.util.Scanner;

public class sum_of_last_two_elements {
	
	public static void last_elements(int[]a)
	{
		int last=a[a.length-1];
		int s_last=a[a.length-2];
		int sum=last+s_last;
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
		
		last_elements(a);
		sc.close();
	}
}
