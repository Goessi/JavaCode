package haha;

import java.util.Scanner;

public class haha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int meter;
		int foot;
		int inch;
		System.out.println("Please input yout foot: ");
		foot = in.nextInt();
		System.out.println("Please input your inch: ");
		inch = in.nextInt();
		System.out.println("your height in meter is: " + (foot + inch/12.0)*0.3048);
		
	}

}
