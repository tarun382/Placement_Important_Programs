package Medium_array_programs;

import java.util.Scanner;

public class avg_of_all_elements {
	
	public static void avg(int []a) {
		int num=1;

		for(int i=0;i<a.length;i++) {
				num =num + a[i];
		}
		System.out.println(num/a.length);
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
		
		avg(a);
		sc.close();
	}
}
