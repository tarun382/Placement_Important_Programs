package Array_programs;

import java.util.Arrays;

public class copy_array {
	public void largest(int[] a) {
		int large=a[0];
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));;
	}
	public static void main(String[] args) {
		int[] a = {9,3,4,56,1};
		copy_array le = new copy_array();
		le.largest(a);
	}
}
