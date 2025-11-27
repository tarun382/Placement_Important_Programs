package Pattern_programs;

import java.util.Scanner;

public class Pyramid {
	public static void pyramid(int r) {
		int star=1;
		int space=r;
		for(int i=1;i<=r;i++) {
			for(int i1=1;i1<=space;i1++) {
				System.out.print("  ");
			}
			for(int i1=1;i1<=star;i1++) {
				System.out.print("* ");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		pyramid(r);
	}
}
