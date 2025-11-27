package String_programs;

public class Extract_duplicate_char {
	public static void duplicate(String str) {
		boolean visited[]=new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			if(!visited[i]) {
				for(int j=i;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)) {
						visited[j]=true;
						count++;
					}
				}
			}
			if(count>1) {
				System.out.println(str.charAt(i)+" ---> "+count);
			}
		}
		
	}
	public static void main(String[] args) {
		String str ="rtarrunn";
		duplicate(str);
	}
}
