package loop;

public class Prime100 {

	public static void main(String[] args) {
		// generate primes that less than 100
		
		int n = 100;
		for (int i=2;i<n;i++) {
			int isPrime = 1;
			for (int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime==1) {
				System.out.print(i+" ");
			}
		}

	}

}
