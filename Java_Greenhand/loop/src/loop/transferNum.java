package loop;

import java.util.Scanner;

public class transferNum {

	public static void main(String[] args) {
		// reverse the number
		Scanner in = new Scanner(System.in);
		int digit = 0;
		int re = 0;
		int num = in.nextInt();
		int[] number = new int[6];
		int idx = 0;
		boolean isLess = false;
		if (num < 0) {
			isLess = true;
			num = Math.abs(num);
			System.out.print("fu ");
		}
		
		do{
			digit = num%10;
			number[idx] = digit;
			idx = idx + 1;
			num = num/10;
		}while(num != 0);
		
		
		for(int i=idx-1;i>=0;i=i-1) {
			switch(number[i]) {
			case 0:
				System.out.print("ling");
				break;
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			}
			if (i != 0) {
				System.out.print(" ");
			}
			
			
		}
		
		


	}

}
