package Number_programs;
import java.util.Scanner;

public class Factors_of_number {
	public void Factors(int fact) {
		for(int i=1;i<=fact;i++) {
			if(fact%i==0)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factors: ");
		int fact=sc.nextInt();
		Factors_of_number f = new Factors_of_number();
		f.Factors(fact);
	}
}
