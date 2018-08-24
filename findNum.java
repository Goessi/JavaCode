import java.util.Scanner;

public class findNum {

	public static void main(String[] args) {
		// find location of a number in an array
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int loc = -1;
		boolean isThere = false;
		int[] haha = {1,2,3,4,5,6,23,9};
		for(int i=0;i<haha.length;i++) {
			if (x == haha[i]) {
				loc = i;
				System.out.println(x+" is the "+(loc+1)+" of the array");
			}
		}
		
		for(int k:haha) {
			if (x == k) {
				isThere = true;
				break;
			}
		}
		System.out.println(x+" is there: " + isThere);
		

	}

}
