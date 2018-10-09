import java.util.Scanner;

public class Automachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		System.out.println("Please input your amount: ");
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
		System.out.println("********************");
		System.out.println("ticket to my hometown: ");
		System.out.println("ticket price : 10");
		System.out.println("********************");
		System.out.println("money to return: " + (amount - 10));
		System.out.println(3>=5);
		System.out.println(3==3);
		System.out.println(3<=4);
		double a;
		double b;
		a = 1.0;
		b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(Math.abs(a-b)<=1e-6);

	}

}
