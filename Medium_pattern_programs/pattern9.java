/*
    1
   121
  12321
 1234321
123454321

*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern9 {
	
	public static void palindrome_pyramid(int r,int c) {
		int star=1;
		int space=r-1;
		for(int i=1;i<=r;i++) {
			int num=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j<=star/2)
					System.out.print(num++);
				else
					System.out.print(num--);
			}
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
		palindrome_pyramid(r,c);
	}
}
