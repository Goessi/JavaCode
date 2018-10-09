package loop;

import java.util.Scanner;

public class guessNum {

	public static void main(String[] args) {
		// computer gives a number that less than 100
		// user inputs a number to guess it, computer tells user if its less or more than original number
		// until user get it right
		
		int number = (int)(Math.random()*100+1);
		System.out.println("Please input a number.");
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		int count=0;
		while (num != number) {
			if(num<number) {
				System.out.println("the input is less than number.");
			}
			else {
				System.out.println("the input is more than number.");
			}
			System.out.println("Please input a number.");
			num = in.nextInt();
			count = count + 1;
		}
		System.out.println("the number is "+num+" the count is "+ count);

	}

}
