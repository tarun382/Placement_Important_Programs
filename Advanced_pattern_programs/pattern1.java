/*
 1 2 3 4
 8 7 6 5
 9 10 11 12
 16 15 14 13
 */



package Advanced_pattern_programs;

public class pattern1 {
	public static void main(String[] args) {
		int r=4;
		int c=4;
		int n=1;
		for(int i=1;i<=r;i++) {
			int rev=1;
			if(i%2==1) {
				for(int j=1;j<=c;j++) {
					System.out.print(n++ +" ");
				}
			}
			else {
				rev=n+r-1;
				for(int j=1;j<=c;j++) {
					System.out.print(rev-- + " ");
				}
				n=n+r;
			}
			System.out.println();
		}
	}
}
