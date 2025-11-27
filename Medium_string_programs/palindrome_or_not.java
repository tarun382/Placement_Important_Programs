package Medium_string_programs;

import java.util.Scanner;

public class palindrome_or_not {
	
	public static void palindrome(String str) {
		String str1 = str;
		String s ="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			s=s+ch;
		}
		if(str1.equals(s))
			System.out.println(str1+" is a palindrome");
		else
			System.out.println(str1+" is not a palinfrome");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		palindrome(s);
	}
}
