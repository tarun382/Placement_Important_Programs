/*
     a
    aba
   abcba
  abcdcba
 abcdedcba
 */

package Medium_pattern_programs;

import java.util.Scanner;

public class patttern11 {
	
	public static void alphabet_pyramid(int r, int c) {
		int star=1;int space=r-1;
		for(int i=1;i<=r;i++) {
			char ch='a';
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j<=star/2)
					System.out.print(ch++);
				else
					System.out.print(ch--);
			}
			ch++;
			star=star+2;
			space--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		alphabet_pyramid(r,c);
	}
}
