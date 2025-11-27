package Array_programs;

import java.util.Arrays;

public class print_elements_in_reverse_order {
	public int[] reverse(int[] a) {
		int[] b = new int[a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			b[index++]=a[i];
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		print_elements_in_reverse_order r = new print_elements_in_reverse_order();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(r.reverse(a)));;
	}
}
