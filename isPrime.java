package loop;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int isPrime=1;
		int n;
		n = in.nextInt();
		for (int i=2; i<n;i++) {
			if(n%i == 0) {
				isPrime = 0;
				System.out.println(i);
				break;
			}
		}
		if (isPrime == 0) {
			System.out.println("不是素数");
		}
		else {
			System.out.println("是素数");
		}

	}

}
