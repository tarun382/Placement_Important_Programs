/*
10101
01010
10101
01010
10101
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern4 {
	
	public static void chessboard_square(int r,int c) {
		int num=-1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
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
		chessboard_square(r,c);
	}
}
