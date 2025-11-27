package Number_programs;

import java.util.Scanner;

public class Square_of_number {
	public int Square(int a) {
		int square=a*a;
		return square;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to chect its Square: ");
		int a=sc.nextInt();
		Square_of_number s =  new Square_of_number();
		System.out.println("Sauare of "+a+" is: "+s.Square(a)+".");;
	}
}
