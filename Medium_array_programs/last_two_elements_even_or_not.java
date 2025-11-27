package Medium_array_programs;

import java.util.Scanner;

public class last_two_elements_even_or_not {
	
	public static void last_elements(int[]a)
	{
		int last=a[a.length-1];
		int s_last=a[a.length-2];
		int mul=last * s_last;
		if(mul%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
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
