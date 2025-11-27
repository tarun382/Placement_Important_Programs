package Array_programs;

import java.util.Arrays;

public class sum_of_elements_in_array {
	public int sum_elements(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		sum_of_elements_in_array se = new sum_of_elements_in_array();
		System.out.println(Arrays.toString(a));
		System.out.println("Sum of an array: "+se.sum_elements(a));;
	}
}
