package Medium_array_programs;

import java.util.Scanner;

public class Multiplication_of_all_even_elements {
	
	public static void Multiplication(int []a) {
		int num=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				num =num * a[i];
		}
		System.out.println(num);
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
		
		Multiplication(a);
		sc.close();
	}
}
