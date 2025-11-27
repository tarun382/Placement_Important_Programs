/*
     1
    3 5
   7 9 11
 13 15 17 19
21 23 25 27 29
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern14 {
	
	public static void reverse_number_pyramid(int r,int c) {
		int star=1;int space=r-1;int n=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(n + " ");
				n=n+2;
			}
			star++;
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
		reverse_number_pyramid(r,c);
	}
}
