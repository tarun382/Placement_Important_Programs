package String_programs;

public class Print_only_alphabets {
	public void alphabets(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				System.out.print(ch+" ");
			}
		}
	}
	public static void main(String[] args) {
		String str ="Tarun123";
		Print_only_alphabets s = new Print_only_alphabets();
		s.alphabets(str);
	}
}
