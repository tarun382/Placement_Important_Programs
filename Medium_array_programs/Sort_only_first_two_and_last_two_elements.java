package Medium_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_only_first_two_and_last_two_elements {
	
	public static int[] first_and_lost(int []a) {
		int b[]=new int[4];
		for(int i=0;i<2;i++) {
			b[i]=a[i];
		}
		int lost=a.length-2;
		int index=2;
		for(int i=lost;i<a.length;i++) {
			b[index++]=a[i];
		}
		return b;
	}
	
	public static void sort(int a[]) {
		int[] b=first_and_lost(a);
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sort(a);
		sc.close();
	}
}
