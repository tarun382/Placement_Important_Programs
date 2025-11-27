package Array_programs;

public class Frequency_of_number {
	public void frequency(int[] a) {
		boolean[] b = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!b[i]) {
				for(int j=i;j<a.length;j++) {
					if(a[i]==a[j]) {
						b[j] = true;
						count++;
					}
				}
			}
			if(count>=1)
			System.out.println("Count of "+a[i]+" ---> "+count);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,2,3,4,3,5,6,4,5,6};
		Frequency_of_number f = new Frequency_of_number();
		f.frequency(a);
	}
}
