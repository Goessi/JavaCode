package loop;

public class Prime50 {

	public static void main(String[] args) {
		// generate first 50 primes in a line
		int num = 2;
		int isPrime = 1;
		int count = 0;
		while(count<=50) {			
			for(int i=2;i<num;i++) {
				if(num%i == 0) {
					isPrime = 0;
					break;
				}
			}
			
			if(isPrime == 1) {
				count += 1;
				System.out.println(num);
			}
			num += 1;
		}

	}

}
