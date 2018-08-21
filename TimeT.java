import java.util.Scanner;

public class TimeT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int time;
		int hour;
		int minute;
		int utc;
		time = in.nextInt();
		hour = time/100;
		minute = (time - hour*100);
		if (hour >= 8) {
			utc=(hour-8)*100 + minute;
		}
		else {
			utc = (hour+24-8)*100 + minute;
		}
		System.out.println(utc);

	}

}
