package Medium_array_programs;

import java.util.Scanner;

public class sum_of_duplicate_elements {
	
	public static void sum_of_duplicates(int[] a) {
		boolean b[]=new boolean[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!b[i]) {
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						b[j]=true;
						count++;
					}
				}
			}
			if(count>1) {
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of duplicate elements are: "+sum);
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
		sum_of_duplicates(a);
		sc.close();
	}
}
