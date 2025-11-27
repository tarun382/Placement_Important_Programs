/*
    A
   ABC
  ABCDE
   ABC
    A
*/


package Medium_pattern_programs;

import java.util.Scanner;

public class pattern18 {
	
	public static void alphabet_diamond(int r,int c) {
		int star=1,space=r-1;
		for(int i=1;i<=r;i++) {
			char ch = 'A';
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(ch++);
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
		alphabet_diamond(r,c);
	}
}
