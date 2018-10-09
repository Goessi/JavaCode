import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int signal;
		int R;
		int S;
		String a="haha";
		String b="haha";
		Scanner in = new Scanner(System.in);
		signal = in.nextInt();
		R = signal/10;
		S = signal - R*10;
		switch(R) {
		case 1:
			a = "unreadable.";
			break;
		case 2:
			a = "barely readable, occasinal words distinguishable.";
			break;
		case 3:
			a = "readable with considerable difficulty.";
			break;
		case 4:
			a = "readable with practically no difficulty.";
			break;
		case 5:
			a = "perfectly readable.";
		}
		
		switch(S) {
		case 1:
			b = "Faint signals, barely perceptible, ";
			break;
		case 2:
			b = "Very weak signals, ";
			break;
		case 3:
			b = "Weak signals, ";
			break;
		case 4:
			b = "Fair signals, ";
			break;
		case 5:
			b = "Fairly good signals, ";
			break;
		case 6:
			b = "Good signals, ";
			break;
		case 7:
			b = "Moderately strong signals, ";
			break;
		case 8:
			b = "Strong signals, ";
			break;
		case 9:
			b = "Extremely strong signals, ";
			break;
		}
		System.out.println(b+a);

	}

}
