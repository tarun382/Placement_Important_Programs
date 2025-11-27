package Medium_string_programs;

import java.util.Scanner;

public class count_frequency_every_character {
	
	public static void frequency(String s) {
		String str =s;
		boolean []b = new boolean[str.length()];
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
			if(count>=1)
				System.out.println(str.charAt(i)+"--->"+count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		frequency(s);
	}
}
