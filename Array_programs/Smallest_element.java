package Array_programs;

public class Smallest_element {
	public void largest(int[] a) {
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=small) {
				small=a[i];
			}
		}
		System.out.println("Largest element: "+small);
	}
	public static void main(String[] args) {
		int[] a = {9,3,4,56,1};
		Smallest_element le = new Smallest_element();
		le.largest(a);
	}
}
