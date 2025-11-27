/*
     1
    2 3
   4 5 6
  7 8 9 10
11 12 13 14 15
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern13 {
	
	public static void number_pyramid(int r,int c) {
		int star=1;int space=r-1;int n=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(n++ +" ");
			}
			space--;
			star++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		number_pyramid(r,c);
	}
}
