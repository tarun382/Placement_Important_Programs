package Number_programs;

import java.util.Scanner;

public class Cube_of_number {
	public int Cube(int a) {
		int cube=a*a*a;
		return cube;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to chect its Square: ");
		int a=sc.nextInt();
		Cube_of_number s =  new Cube_of_number();
		System.out.println("Sauare of "+a+" is: "+s.Cube(a)+".");;
	}
}
