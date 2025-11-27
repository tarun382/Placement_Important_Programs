/*
 01234
 12345
 23456
 34567
 45678
 */

package Medium_pattern_programs;

import java.util.Scanner;

public class pattern5 {
	
	public static void square(int r,int c) {
		int num=0;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(num++);
			}
			num=i;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		square(r,c);
	}
}
