package Medium_string_programs;

import java.util.Scanner;

public class reverse_of_string {
	
	public static void reverse(String str) {
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			str1=str1+ch;
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		reverse(str);
	}
}
