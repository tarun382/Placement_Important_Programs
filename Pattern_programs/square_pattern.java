package Pattern_programs;

import java.util.Scanner;

public class square_pattern {
	public static void square_pattern(int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int r = sc.nextInt();
		System.out.println("Enter the no.of columns:");
		int c = sc.nextInt();
		square_pattern(r,c);
	}
}
