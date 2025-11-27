package Array_programs;

import java.util.Arrays;

public class Merge_two_arrays {
	public void merge(int[] a,int[] b) {
		int c[]=new int[a.length+b.length];
		
			for(int i=0;i<a.length;i++) {
				c[i]=a[i];
			}
			int index=a.length;
			for(int i=0;i<b.length;i++) {
				c[index++]=b[i];
			}
		System.out.println(Arrays.toString(c));
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		Merge_two_arrays ma = new Merge_two_arrays();
		ma.merge(a,b);
	}
}
