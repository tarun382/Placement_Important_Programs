package Medium_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class sort_only_prime_elements {
	
	public static int[] prime_elements(int []a) {
		int count1=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2)
				count1++;
		}
		int[] b=new int[count1];
		int z=0;
		for(int i=0;i<a.length;i++) {
			int count2=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count2++;
				}
			}
		if(count2==2) {
			b[z++]=a[i];
		}
	}
		return b;
	}
	
	public static void sort(int []a) {
		int b[]=prime_elements(a);
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
		sort(a);
		sc.close();
	}
}
