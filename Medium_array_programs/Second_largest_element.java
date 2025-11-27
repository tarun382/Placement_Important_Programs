package Medium_array_programs;

import java.util.Scanner;

public class Second_largest_element {
	
	public static void Second_largest(int[] a) {
		int first_e=0;
		for(int i=0;i<a.length;i++) {
			if(first_e<a[i]) {
				first_e=a[i];
			}
		}
		int second_e=0;
		for(int i=0;i<a.length;i++) {
			if(first_e!=a[i] && a[i]<first_e) {
				if(second_e<a[i]) {
				second_e=a[i];
				}
			}
		}
		System.out.println(second_e+" is the second largest element.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int []a = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		Second_largest(a);
	}
}
