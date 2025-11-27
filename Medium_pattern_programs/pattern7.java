/*
12345
1234
123
12
1
*/



package Medium_pattern_programs;

import java.util.Scanner;

public class pattern7 {
	
	public static void triangle(int r,int c) {
		for(int i=r;i>=1;i--) {
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
