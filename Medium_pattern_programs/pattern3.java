/*
 12345
 1   5
 1   5
 1   5
 12345*/



package Medium_pattern_programs;

import java.util.Scanner;

public class pattern3 {
	
	public static void hallow_square(int r,int c) {
		
		for(int i=1;i<=r;i++) {
			int num=1;
			for(int j=1;j<=c;j++) {
				
				if(i==1 || i==r || j==1 || j==c)
					System.out.print(num +" ");
				else
					System.out.print("  ");
				num++;
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
		hallow_square(r,c);
	}
}
