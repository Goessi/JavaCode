package loop;

import java.util.Scanner;

public class disINT {

	public static void main(String[] args) {
		// input a number, then get its transfer number
		int digit;
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int haha=0;
		do
		{
			digit = number%10;
			haha = haha*10+digit;
			number = number/10;
		}while(number != 0);
		System.out.println(haha);

	}

}
