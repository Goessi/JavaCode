import java.util.Scanner;

public class voteMachine {

	public static void main(String[] args) {
		// user input unknown number of numbers between 0-9
		// using -1 indicates EOI
		// print how much each number shows
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] numbers = new int[10];
		while(x != -1) {
			
			if(x>=0 && x<=9) {
				numbers[x] += 1;
			}
			x = sc.nextInt();
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(i+ " : "+ numbers[i]);
		}

	}

}
