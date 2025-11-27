package Medium_string_programs;

import java.util.Scanner;

public class Replace_duplicates_with_star {
	
	public static String replace_star(String s) {
		String res="";
		for(int i=0;i<=s.length()-1;i++) {
			boolean b=false;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					b=true;
					break;
				}
			}
			if(b)
				res=res+'*';
			else
				res=res+s.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println(replace_star(s));;
		sc.close();
	}
}
