package pay;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int grades = 60;
		int g;
		System.out.println("Please input your grades : ");
		Scanner in = new Scanner(System.in);
		g = in.nextInt();
		if (g> grades)
			System.out.println("Passed!!!!");
		else
			System.out.println("Failed...");
		

	}

}
