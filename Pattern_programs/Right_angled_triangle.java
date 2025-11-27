package Pattern_programs;

import java.util.Scanner;

public class Right_angled_triangle {
	public static void right_angled(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		right_angled(r,c);
	}
}
