/*
        1 
      2   2 
    3       3 
  4           4 
5 5 5 5 5 5 5 5 5 
*/



package Advanced_pattern_programs;

public class pattern7 {
	public static void main(String[] args) {
		int r=5;
		int star=1;int space=r-1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1 || j==star || i==r)
					System.out.print(i+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}
}
