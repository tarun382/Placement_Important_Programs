/*
 1111
 2222
 3333
 4444*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern1 {
	
	public static void square(int r,int c) {
		int num=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++){
				System.out.print(num);
			}
			num++;
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
