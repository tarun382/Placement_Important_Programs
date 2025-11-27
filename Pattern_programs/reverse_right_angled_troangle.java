package Pattern_programs;

import java.util.Scanner;

public class reverse_right_angled_troangle {
	public static void reverse_right_angled(int r,int c) {
		for(int i=r;i>=1;i--) {
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
		System.out.println("Enter the no.of columns: ");
		int c = sc.nextInt();
		reverse_right_angled(r,c);
	}
}
