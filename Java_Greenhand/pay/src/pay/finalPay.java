package pay;

import java.util.Scanner;

public class finalPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double rate = 8.5;
		final int time = 40;
		double pay = 0.0;
		System.out.println("Please input your working time: ");
		Scanner in = new Scanner(System.in);
		int hours = in.nextInt();
		if (hours <= time)
			pay = hours*rate;
		else
			pay = (hours-time)*rate*1.5 + time*rate;
		
		System.out.println("the pay is :" + pay);

	}

}
