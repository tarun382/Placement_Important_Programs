package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Print_all_elements {
	public void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		Print_all_elements p = new Print_all_elements();
		p.print(a);
	}
}
