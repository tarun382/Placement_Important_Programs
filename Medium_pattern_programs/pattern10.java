/*
 123454321
  1234321
   12321
    121
     1
*/


package Medium_pattern_programs;

import java.util.Scanner;


public class pattern10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of coloumns: ");
		int c = sc.nextInt();
		reverse_pyramid(r,c);
	}

	private static void reverse_pyramid(int r, int c) {
		int star=r*2-1;
		int space=0;
		for(int i=0;i<r;i++) {
			int n=1;
			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j<=star/2)
					System.out.print(n++);
				else
					System.out.print(n--);
			}
			star=star-2;
			space++;
			System.out.println();
		}
			
	}
}
