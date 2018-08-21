package loop;

import java.util.Scanner;

public class calAverage {

	public static void main(String[] args) {
		// calculate average of numbers
		Scanner in = new Scanner(System.in);
		int amount = 0;
		int count = 0;
		int num = 0;
//		num = in.nextInt();
//		while (num != -1) {			
//			amount = amount + num;
//			count += 1;	
//			System.out.println("please input a num: ");
//			num = in.nextInt();	
//		}
		do {
			amount += num;
			count += 1;
			num = in.nextInt();
		}while(num != -1);
		if (count-1 != 0) {
			System.out.println("the average number is " + (double)amount/(count-1));
		}
		
		

	}

}
