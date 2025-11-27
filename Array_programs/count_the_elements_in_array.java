package Array_programs;

public class count_the_elements_in_array {
	public int count(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int [] a= {3,5,3,6,3,2,4};
		count_the_elements_in_array c = new count_the_elements_in_array();
		System.out.println("Count of a give array is: "+c.count(a));;
	}
}
