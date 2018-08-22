package loop;

import java.util.Scanner;

public class numEO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int haha = 0;
		do {
		    haha = in.nextInt();
			if (haha != -1) 
			{
				if (haha%2 == 0) 
				{
					even+=1;
				}
				else 
				{
					odd+=1;
				}
			}
		}while(haha != -1);
		System.out.println(odd + " " + even);

	}

}
