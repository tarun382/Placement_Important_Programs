package Array_programs;

public class print_duplicates_in_array {
	public void duplicate_elements(int[] a) {
		int count=0;
		boolean[] visited=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(!visited[i]) {
				for(int j=i;j<a.length;j++) {
					if(a[i]==a[j]) {
						visited[j]=true;
						count++;
					}
				}
				if(count>=1) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,2,4,2,4,5,3,3,4,5};
		print_duplicates_in_array de = new print_duplicates_in_array();
		de.duplicate_elements(a);
	}
}
