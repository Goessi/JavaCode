package loop;

import java.util.Scanner;

public class countNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 0;
		num = in.nextInt();
		do
		{
			num = num/10;
			i = i+1;
		} while(num > 0);
		System.out.println(i);

	}

}
