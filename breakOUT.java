package loop;

import java.util.Scanner;

public class breakOUT {

	public static void main(String[] args) {
		// try to use break-out
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		OUT:
		for (int one=0;one<=amount;++one) {
			for (int two=0;two<=amount/2;++two) {
				for(int five=0;five<=amount/5;++five) {
					for (int ten=0;ten<=amount/10;++ten) {
						if(ten*10+five*5+two*2+one == amount) {
							System.out.println("the amount is " + ten + " times of ten yuan " + five + " times of five yuan "+ two +" times of two yuan " + one + " times of one yuan.");
							break OUT;
						}
						
					}
				}
			}
		}

	}

}
