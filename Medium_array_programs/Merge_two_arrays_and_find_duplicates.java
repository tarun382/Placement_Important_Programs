package Medium_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_two_arrays_and_find_duplicates {
	
	public static void merge(int[]a,int []b) {
		int []c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<=a.length-1;i++) {
			c[index++]=a[i];
			
		}
		index=a.length;
		for(int j=0;j<b.length;j++) {
			c[index++]=b[j];
		}
		
		
		System.out.println(Arrays.toString(c));
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of second array: ");
		int size1=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int b[]=new int[size1];
		for(int j=0;j<b.length;j++) {
			b[j]=sc.nextInt();
		}
		merge(a,b);
		sc.close();
	}
}
