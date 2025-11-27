package Medium_string_programs;

import java.util.Scanner;

public class Frequency_each_string {
	
	public static String[] frequency(String s) {
		String s1="";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ')
				count++;
		}
		String a[]=new String[count];
		int index=0;
		boolean b = false;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!=' ') {
				s1=s1+s.charAt(i);
			}else {
				a[index++]=s1;
				
			}
		}
		return a;
	}
	
	public static void check_frequency(String str) {
		String s[]=frequency(str);
		boolean b[]=new boolean[s.length];
		int count=0;
		for(int i=0;i<=s.length-1;i++) {
			if(!b[i]) {
				for(int j=1;j<=s.length-1;j++) {
					if(b[i]==b[j]) {
						b[j]=true;
						count++;
					}
				}	
			}
			if(count>=1)
				System.out.println(s[i]+"  "+count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine()+" ";
		check_frequency(s);
	}
}
