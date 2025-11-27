package Medium_string_programs;

import java.util.Scanner;

public class first_repeated_character {
	
	public static char first_repeated_char(String s) {
		char res=' ';
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return res=s.charAt(i);
				}
			}
		}
		return '0';
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s =sc.nextLine();
		if(first_repeated_char(s)!='0')
		{
			System.out.println(first_repeated_char(s)+" is a repeated element..");
		}
		else
			System.out.println("no repeated elements");;
		sc.close();
	}
}
