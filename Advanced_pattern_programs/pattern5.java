/*
    1
   212
  32123
 4321234
543212345
*/



package Advanced_pattern_programs;

public class pattern5 {
	public static void main(String[] args) {
		int r=5;
		int n=1;
		int star=1;int space=r-1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<star;j++) {
				if(j<star/2)
					System.out.print(n--);
				else
					System.out.print(n++);
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}
}
