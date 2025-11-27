package Medium_number_programs;

import java.util.Scanner;

public class nth_largest {
	public static void nth_largest(int num,int nth) {
		int count=0;
		for(int i=9;i>=0;i--) 
		{
			int temp=num;
			while(temp>0) 
			{
				int ld = temp%10;
					if(ld==i) 
					{
						count++;
						break;
					}
					temp=temp/10;
			}
				if(count==nth) {
					System.out.println("nth largest number is: "+i);
					break;
				}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the nth number: ");
		int nth=sc.nextInt();
		nth_largest(num,nth);
	}
}