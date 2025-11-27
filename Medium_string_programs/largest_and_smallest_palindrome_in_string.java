
package Medium_string_programs;

import java.util.Scanner;

public class largest_and_smallest_palindrome_in_string {
	static String largest="",smallest="";
	static int max=0,min=Integer.MAX_VALUE;
	public static void longest_palindrome(String s) {
		
		String s1="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!=' ')
				s1=s1+s.charAt(i);
			else {
				palindrome(s1);
				s1="";
			}
		}
	}
	
	public static void palindrome(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		if(str.equals(str1)) 
			largest_smallest(str1);	
	}
	
	public static void largest_smallest(String str1) {
		if(str1.length()>max) {
			largest=str1;
			max=str1.length();
		}if(str1.length()<min) {
			smallest=str1;
			min=str1.length();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine()+" ";
		
		longest_palindrome(s);
		System.out.println(largest);
		System.out.println(smallest);
	}
}