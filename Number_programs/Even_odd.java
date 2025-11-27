package Number_programs;

import java.util.Scanner;

public class Even_odd {
	public void Even_odd(int a) {
		if(a%2==0) {
			System.out.println(a+" Even number");
		}else {
			System.out.println(a+" Odd number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is even or odd");
		int a = sc.nextInt();
		Even_odd o = new Even_odd();
		o.Even_odd(a);
	}
}
