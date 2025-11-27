/*
    1
   121
  12321
 1234321
123454321
*/



package Advanced_pattern_programs;

public class pattern6 {
	public static void main(String[] args) {
		int r=5;
		int n=1;
		int star=1;int space=r-1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<space;j++) {
				System.out.print("  ");
			}
			
			for(int j=0;j<star;j++) {
				if(n%2==0)
					System.out.print("1 ");
				else
					System.out.print("A ");
				n++;
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}
}
