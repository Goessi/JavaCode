import java.util.Scanner;

public class findPrime {

	public static void main(String[] args) {
//		// loop n times
		Scanner in = new Scanner(System.in);
//		int x = in.nextInt();
//		boolean isPrime = true;
//		if (x == 1||x==2) {
//			isPrime = false;
//		}
//		for(int i=2;i<x;i++) {
//			if(x%i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime) {
//			System.out.println(x+" is a Prime");
//		}
//		else {
//			System.out.println(x+" is not a Prime");
//		}
//		
//		// loop for n/2
//		if(x == 1||x%2 == 0&&x!=2) {
//			isPrime = false;
//		}
//		else {
//			for(int j=3;j<x;j=j+2) {
//				if(x%j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//		if (isPrime) {
//			System.out.println(x+" is a Prime");
//		}
//		else {
//			System.out.println(x+" is not a Prime");
//		}
//		
//		//loop for sqrt(n)
//		if(x == 1||x%2 == 0&&x!=2) {
//			isPrime = false;
//		}
//		else {
//			for(int j=3;j<Math.sqrt(x);j=j+2) {
//				if(x%j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//		if (isPrime) {
//			System.out.println(x+" is a Prime");
//		}
//		else {
//			System.out.println(x+" is not a Prime");
//		}
		
		// another way is to build a 50 Primes Array
		// to find if the x%Primenum == 0
		
//		int[] Primes = new int[50];
//		Primes[0] = 2;
//		int count = 1;
//		Main_loop:
//		for(int x=3;count<50;x++) {
//			for(int i=0;i<count;i++) {
//				if(x%Primes[i] == 0) {
//					continue Main_loop;
//				}
//			}
//			// Primes[count] = x;
//			// count = count + 1;
//			Primes[count++] = x;
//		}
//		for(int m:Primes) {
//			System.out.print(m+ " ");
//		}
//		System.out.println(Primes.length);	
		
		boolean[] haha = new boolean[100];
		for(int i=0;i<haha.length;i++) {
			haha[i] = true;
		}
		
		haha[0] = false;
		haha[1] = false;
		for(int j=2;j<haha.length;j++) 
		{
			if(haha[j]) 
			{
				for(int m=2;m*j<haha.length;m++) 
				{
					haha[m*j] = false;
				}
			}
		}
		for(int n=2;n<haha.length;n++) 
		{
			if(haha[n]) 
			{
				System.out.print(n+" ");
			}
			
		}
	}
}
