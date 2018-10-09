package loop;

import java.util.Scanner;

public class twoPrimeSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int n_num = 0;
		int count = 1;
		int number = 2;
		int sum = 0;
		while(count<n) {
			int isPrime = 1;		
			number = number + 1;
			for(int i=2;i<number;i++) {
				if(number%i == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				count = count + 1;
			}
		}
		n_num = number;
		sum = n_num;
		while(count < m) {
			int isPrime = 1;
			n_num = n_num + 1;
			for(int i=2;i<n_num;i++) {
				if(n_num%i == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				count = count + 1;
				sum = sum + n_num;
			}
		}
		System.out.println(sum);

}
}
