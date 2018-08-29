package objectEx;

import java.util.Scanner;

public class wordsLong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String haha = in.nextLine();
		int count = 0;
		for(int i=0;i<haha.length();i++)
		{
			char w = haha.charAt(i);
			if(w=='.') {
				System.out.print(count);
				break;
			}
			else if(w==' ') {
				if(haha.charAt(i-1)==' ') {
					continue;
				}
				else {
					System.out.print(count);
					System.out.print(" ");
					count = 0;
				}
			}
			else
			{
				count = count + 1;
			}			
		}
	}
}
