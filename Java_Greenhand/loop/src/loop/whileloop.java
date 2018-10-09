package loop;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("ÇëÍ¶±Ò£º ");
			int amount = in.nextInt();
			balance = balance + amount;
			if(balance>=10) {
				System.out.println("*************************");
				System.out.println("*Java train Line");
				System.out.println("no registered seat");
				System.out.println("10 dollars");
				System.out.println("*************************");
				System.out.println("returned change: " + (balance - 10));
				balance = 0;
			}
		}

	}

}
