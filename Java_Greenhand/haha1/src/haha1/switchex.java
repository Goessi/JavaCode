package haha1;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch(type) {
		case 1:
		case 2:
			System.out.println("Hallo...");
			break;
		case 3:
			System.out.println("Good evening....");
		case 4:
			System.out.println("Was????");
			break;
		default:
			System.out.println("hahahhahahahah");
			break;
		}
		

	}

}
