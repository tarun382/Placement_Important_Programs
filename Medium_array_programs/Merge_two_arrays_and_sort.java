package Medium_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_two_arrays_and_sort {
	
	public static int[] merge(int []a,int []b) {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int index=a.length;
		for(int j=0;j<b.length;j++) {
			c[index++]=b[j];
		}
		return c;
	}
	
	public static void sort(int []a,int []b) {
		int c[]=merge(a,b);
		for(int i=0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					c[i]=c[i]+c[j];
					c[j]=c[i]-c[j];
					c[i]=c[i]-c[j];
				}
			}
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
		System.out.println(Arrays.toString(merge(a, b)));
		sort(a,b);
		sc.close();
	}
}
