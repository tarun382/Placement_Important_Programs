/*
    2 
   4 6 
  8 10 12 
 14 16 18 20 
22 24 26 28 30
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern15 {
	
	public static void reverse_number_pyramid(int r,int c) {
		int star=1;int space=r-1;int n=2;
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
