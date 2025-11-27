package String_programs;

public class print_only_digits {
	public void alphabets(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9') {
				System.out.print(ch+" ");
			}
		}
	}
	public static void main(String[] args) {
		String str ="Tarun123";
		print_only_digits s = new print_only_digits();
		s.alphabets(str);
	}
}
