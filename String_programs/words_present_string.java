package String_programs;

import java.util.Arrays;

public class words_present_string {
//	public static void words(String str) {
//		String arr[] = str.split(" ");
//		System.out.println(Arrays.toString(arr));
//	}
	
	
	
//	public static void words(String str) {
//
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch==' ') {
//				System.out.println();
//			}
//			else {
//				System.out.print(ch);
//			}
//		}
//	}
	
	public static void words(String str) {
		
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		String[] arr = new String[count];
		int index =0;
		String res ="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ')
			{
				arr[index++]=res;
				res="";
			}
			else
				res = res + ch;
		}
		arr[index]=res;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		String str = "kanithi Tarun krishna sai durga lashmi ganesh";
		words(str);
	}
}
