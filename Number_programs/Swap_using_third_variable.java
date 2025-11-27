package Number_programs;

import java.util.Scanner;

public class Swap_using_third_variable {
	public void Swap(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping: ");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		Swap_using_third_variable s = new Swap_using_third_variable();
		s.Swap(a, b);
	}
}
