package Medium_string_programs;

import java.util.Scanner;

public class String_unique_or_not {
	
	public static boolean unique_or_not(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s =sc.nextLine();
		if(unique_or_not(s))
			System.out.println(s+" is a unique string");
		else
			System.out.println(s+" is not a unique string");
		sc.close();
	}
}
