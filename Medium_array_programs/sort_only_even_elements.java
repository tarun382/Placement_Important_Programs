package Medium_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class sort_only_even_elements {
	
	public static int[] even_elements(int []a) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		int[] b=new int[count];
		int j=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					b[j++]=a[i];
				}
			
		}
		return b;
	}
	
	public static void sort_even(int []a) {
		int b[]=even_elements(a);
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					b[i]=b[i]+b[j];
					b[j]=b[i]-b[j];
					b[i]=b[i]-b[j];
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sort_even(a);
		sc.close();
	}
}
