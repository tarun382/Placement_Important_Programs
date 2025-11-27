/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern8 {
	
	public static void triangle(int r,int c) {
		int num=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num++ +" ");
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
