/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */


package Advanced_pattern_programs;

public class pattern2 {
	public static void main(String[] args) {
		int r=5;
		int c=5;
		int star=1;
		int space=r-1;
		
		for(int i=0;i<r;i++) {
			for(int i1=1;i1<=space;i1++) {
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<star;j++) {
				System.out.print(num + " ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
			space--;
			star++;
		}
		
	}
}
