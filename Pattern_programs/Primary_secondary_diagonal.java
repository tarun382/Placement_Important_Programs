package Pattern_programs;

import java.util.Scanner;

public class Primary_secondary_diagonal {
	public static void primary_secondary(int r, int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j || i+j==r-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
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
		primary_secondary(r,c);
	}
}
