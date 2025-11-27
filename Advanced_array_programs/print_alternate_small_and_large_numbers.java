package Advanced_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class print_alternate_small_and_large_numbers {
	
	public static void print(int[] a) {
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<=a.length-1;j++) {
				if(a[i]>=a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int b []=new int[a.length];
		int index=a.length-1;
		int index1=0;
		for(int i=0;i<=a.length-1;i++) {
			if(i%2==0)
				b[i]=a[index1++];
			else
				b[i]=a[index--];
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		print(a);
	}
}
