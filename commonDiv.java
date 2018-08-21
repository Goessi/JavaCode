package loop;

import java.util.Scanner;

public class commonDiv {

	public static void main(String[] args) {
		// to calculate gcd
//		int gcd = 1;
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		for (int i=1;i<=a&&i<=b;i++) {
//			if(a%i==0&&b%i==0) {
//				gcd=i;
//			}
//		}
//		System.out.println(gcd);
		// Õ·×ªÏà³ý·¨
		int r = 0;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		while(b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		System.out.println("the greatest common number is "+ a);

	}

}
