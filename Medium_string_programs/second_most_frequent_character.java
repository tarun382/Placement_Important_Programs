package Medium_string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class second_most_frequent_character {
	
	public static void second_most_frequent(String str){
		boolean []b = new boolean[str.length()];
		int a[]=new int[str.length()];
		int max=0;
		int smax=0;
		char ch=' ';
		for(int i=0;i<=str.length()-1;i++) {
			int count=0;
			if(!b[i]) {
				for(int j=i;j<=str.length()-1;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						b[j]=true;
						count++;
					}
				}
			}
			if(count>=1) {
				a[i]=count;
			}
			if(count>max) {
				smax=max;
				max=count;
			}
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==smax)
				System.out.println(str.charAt(i)+"--->"+smax);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		second_most_frequent(s);
	}
}
