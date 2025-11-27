package Array_programs;

import java.util.Arrays;

public class sort_without_predefined_methhods {
	public void sort(int[] a) {

		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>=a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] a = {2,3,5,4,6,9,8,7,1};
		sort_without_predefined_methhods se = new sort_without_predefined_methhods();
		se.sort(a);
	}
}
