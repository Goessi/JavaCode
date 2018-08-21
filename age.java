package age;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int min = 10;
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your age: ");
		age = in.nextInt();
		if (age > min) {
			System.out.println("Good");
		}
		System.out.println("better!");
	}

}
