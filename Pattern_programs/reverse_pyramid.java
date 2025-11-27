package Pattern_programs;

import java.util.Scanner;

public class reverse_pyramid {
	public static void reverse_pyramid(int r) {
		int star=r*2-1;
		int space=0;
		for(int i=r;i>=1;i--) {
			for(int i1=1;i1<=space;i1++) {
				System.out.print("  ");
			}
			for(int i2=1;i2<=star;i2++) {
				System.out.print("* ");
			}
			star=star-2;
			space++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		reverse_pyramid(r);
	}
}
