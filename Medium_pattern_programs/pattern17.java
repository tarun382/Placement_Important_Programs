/*
  1
 123
12345
 123
  1
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern17 {
	
	public static void number_diamond(int r,int c) {
		int star=1,space=r-1;
		for(int i=1;i<=r;i++) {
			int n=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(n++);
			}
			if(i<=r/2) {
				
				star=star+2;
				space--;
			}else {
				
				star=star-2;
				space++;
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
		number_diamond(r,c);
	}
}
