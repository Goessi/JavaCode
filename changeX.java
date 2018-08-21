import java.util.Scanner;

public class changeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x;
//		Scanner in = new Scanner(System.in);
//		x = in.nextInt();
//		if (x < 0) {
//			System.out.println(-1);
//		}
//		else if (x == 0) {
//			System.out.println(0);
//		}
//		else {
//			System.out.println(2*x);
//		}
// 单一出口
		int x;
		int f;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if (x<0) {
			f = -1;
		}
		else if (x == 0) {
			f = 0;
		}
		else {
			f = 2*x;
		}
		System.out.println(f);
	}

}
