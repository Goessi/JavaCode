package loop;

import java.util.Scanner;

public class addSUM {

	public static void main(String[] args) {
		// user gives a number, to add 1/number together
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double sum=0.0;
//		for(int i = 1;i<=num;i++) {
//			sum = sum + 1.0/i;
//		}
//		System.out.println(sum);
		
		//to add 1/number when number is even and -1/number when number is odd
		double sign = 1.0;
		for(int i=1;i<=num;i++,sign=-sign) {
			sum = sum+sign/i;
		}
		System.out.println(sum);
	}

}
