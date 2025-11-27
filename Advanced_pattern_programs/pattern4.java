/*
    a
   aba
  abcba
 abcdcba
abcdedcba
*/



package Advanced_pattern_programs;

public class pattern4 {
	public static void main(String[] args) {
		int r=5;
		int star=1;int space=r-1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			char ch='a';
			for(int j=0;j<star;j++) {
				if(j<star/2)
					System.out.print(ch++);
				else
					System.out.print(ch--);
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}
}
