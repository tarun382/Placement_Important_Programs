package Medium_string_programs;

import java.util.Scanner;

public class remove_specific_char {
	
	public static void remove_char(String s,char ch) {
		String res="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!=ch) {
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("Enter specific character to remove: ");
		char ch=sc.next().charAt(0);
		remove_char(s,ch);
	}
}
