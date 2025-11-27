package String_programs;

public class reverse_string {
	public void reverse(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res =res+str.charAt(i);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String str ="Tarun";
		reverse_string rs = new reverse_string();
		rs.reverse(str);
	}
}
