package Number_programs;

import java.util.Scanner;

public class Expo_for_base_and_power {
	public static void Exponential(int base,int power) {
		int expo=1;
		for(int i=1;i<=power;i++) {
			expo=expo*base;
		}
		System.out.println(expo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		int base=sc.nextInt();
		System.out.println("Enter the power value");
		int power=sc.nextInt();
		Exponential(base,power);
	}
}
