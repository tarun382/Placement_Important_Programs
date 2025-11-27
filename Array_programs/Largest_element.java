package Array_programs;

public class Largest_element {
	public void largest(int[] a) {
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=large) {
				large=a[i];
			}
		}
		System.out.println("Largest element: "+large);
	}
	public static void main(String[] args) {
		int[] a = {9,3,4,56,1};
		Largest_element le = new Largest_element();
		le.largest(a);
	}
}
