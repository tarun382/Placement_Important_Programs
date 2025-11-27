package Pattern_programs;

import java.util.Scanner;

public class Hallow_diamond {
	public static void hallow_diamond(int s) {
		int space=s-1;
		int star=1;		
		for(int i=1;i<=s*2-1;i++) {
			for(int i1=1;i1<=space;i1++) {
				System.out.print(" ");
			}
			for(int i1=1;i1<=star;i1++) {
				if(i1==1 || i1==star)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i<s) {
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
		System.out.println("Enter the no.of size: ");
		int s=sc.nextInt();
		hallow_diamond(s);
	}
}
