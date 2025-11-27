/*
 abcdedcba
 abcdcba
  abcba
   aba
    a
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern12 {
	
	public static void reverse_pyramid(int r,int c) {
		int star=r*2-1;int space=0;
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
			star=star-2;
			space++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		reverse_pyramid(r,c);
	}
}
