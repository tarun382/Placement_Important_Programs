package Medium_string_programs;

import java.util.Scanner;

public class reverse_only_digits_in_string {
	
	public static String reverse_digits(String s) {
		String digit="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				digit=digit+s.charAt(i);
			}		
		}
		int j=0;
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				res=res+digit.charAt(j++);
			else
				res=res+s.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println(reverse_digits(s));
		sc.close();
	}
}
