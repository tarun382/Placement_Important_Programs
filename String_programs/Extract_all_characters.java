package String_programs;

import java.util.Arrays;

public class Extract_all_characters {
	public void Character(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.print(ch+"  ");
		}
	}
	public static void main(String[] args) {
		String s = "Tarun";
		Extract_all_characters ce = new Extract_all_characters();
		ce.Character(s);
	}
}
