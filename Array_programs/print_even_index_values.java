package Array_programs;

public class print_even_index_values {
	public void even_index(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7};
		print_even_index_values ei = new print_even_index_values();
		ei.even_index(a);
	}
}
