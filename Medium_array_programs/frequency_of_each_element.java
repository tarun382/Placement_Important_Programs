package Medium_array_programs;

import java.util.Scanner;

public class frequency_of_each_element {
	
	public static void frequency(int []a) {
		boolean []b = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(!b[i]) {
				int count=0;
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						b[j]=true;
						count++;
					}	
				}
				if(count>=1) {
					System.out.println(a[i]+"--->"+count);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		frequency(a);
		sc.close();
	}
}
