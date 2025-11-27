/*
 1
 12
 123
 1234
 12345
 */


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern6 {
	
	public static void triangle(int r,int c) {
		for(int i=1;i<=r;i++) {
			int num=1;
			for(int j=1;j<=i;j++) {
				System.out.print(num++);
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
		triangle(r,c);
	}
}
