package Medium_number_programs;

import java.util.Scanner;

public class nth_sum_of_smallest_largest_digit_of_number {
	
	public static int smallest_digit(int temp,int snth) {
		int small=0;
		int count=0;
		for(int i=0;i<=9;i++) {
			int num=temp;
			while(num>0) {
				int ld=num%10;
				if(ld==i) {
					count++;
					break;
				}
				num=num/10;
			}
			if(count==snth) {
				small=i;
				break;
			}
		}
		return small;
	}
	public static int largest_digit(int temp,int lnth) {
		int count=0;
		int large=0;
		for(int i=9;i>=0;i--) {
			int num =temp;
			while(num>0) {
				int ld=num%10;
				if(ld==i) {
					count++;
					break;
				}
				num=num/10;
			}
			if(count==lnth) {
				large=i;
				break;
			}
		}
		return large;
	}
	
	public static void sum_smallest_largest(int num,int snth,int lnth) {
		int largest=largest_digit(num,lnth);
		int smallest=smallest_digit(num,snth);
		int sum=largest+smallest;
		System.out.println("Sum of the both largest and smallest digits: "+sum);
		System.out.println("smallest "+smallest);
		System.out.println("largest "+largest);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the smallest nth: ");
		int snth=sc.nextInt();
		System.out.println("Enter the largest nth: ");
		int lnth=sc.nextInt();
		sum_smallest_largest(num,snth,lnth);
	}
}
