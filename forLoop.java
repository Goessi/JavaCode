package loop;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int haha = in.nextInt();
		int factor = 1;
//		int i = 1;
//		while (i<=haha) {
//			factor = factor*i;
//			i = i + 1;
//		}
		for (int i=1;i<=haha;i++) {
			factor = factor*i;
		}
		System.out.println(factor);
	}

}
