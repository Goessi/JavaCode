package loop;

import java.util.Scanner;

public class numIdx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int num = 0;
		int idx = 0;
		int sum = 0;
		while(number != 0) {
			num = number%10;
			idx = idx + 1;
			number = number/10;
			if(num%2==idx%2) {
				sum = sum + (int)Math.pow(2, idx-1);
			}
			else {
				sum = sum;
			}
		}
		System.out.println(sum);

	}

}
