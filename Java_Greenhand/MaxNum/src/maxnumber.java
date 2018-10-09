import java.util.Scanner;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		int max = 0;
		if (x>y) {
			if(x>z) {
				max=x;
			}
			else {
				max=z;
			}
		}
		else {
			if(y>z) {
				max = y;
			}
			else {
				max = z;
			}
		}
		System.out.println("the max number is: " + max);

	}

}
