package Medium_array_programs;

import java.util.Scanner;

public class Even_number {
	
	public static void Even(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
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
		
		Even(a);
		sc.close();
	}
}
