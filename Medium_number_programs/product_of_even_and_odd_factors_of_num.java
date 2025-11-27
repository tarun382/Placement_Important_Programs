package Medium_number_programs;

import java.util.Scanner;

public class product_of_even_and_odd_factors_of_num {
	public static void product_of_even_odd_factors(int num) {
		int sume=1;
		int sumo=1;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				if(i%2==0)
					sume=sume*i;
				else
					sumo=sumo*i;
		}
		System.out.println("Sum of even factors: "+sume);
		System.out.println("Sum of odd factors: "+sumo);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		product_of_even_odd_factors(num);
	}
}
