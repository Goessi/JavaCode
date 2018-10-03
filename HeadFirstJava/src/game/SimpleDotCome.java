package game;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotCome {
	private ArrayList<String> myLocations;
	int numOfHits;
	
	public void setLocationCells(ArrayList<String> aIntList) {
		myLocations = aIntList;
	}
	
	public void checkYourself(String aString) {
		String aGuess = aString;
		String yesOrNo = "miss";
		
		for(String loc:myLocations) {
			if (aGuess.equals(loc)) {
				numOfHits++;
				yesOrNo = "hit";
				System.out.println(yesOrNo);
				myLocations.remove(myLocations.indexOf(loc));
				break;
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		SimpleDotCome sdc = new SimpleDotCome();
		int hits = sdc.numOfHits;
//		int[] locs = new int[3];
		int GUESS = 0;
		
//		locs[0] = 2;
//		locs[1] = 3;
//		locs[2] = 4;
		
		int location = (int)Math.random()*5;
		System.out.println(location);
		ArrayList<String> locs = new ArrayList<String>();
		locs.add(""+location);
		locs.add(""+(location+1));
		locs.add(""+(location+2));
		int size = locs.size();
		sdc.setLocationCells(locs);
		
		while (hits<3) {
			System.out.println("Please input your guess :");
			Scanner sc = new Scanner(System.in);
			String st = sc.nextLine();
			GUESS++;
			sdc.checkYourself(st);
			hits = sdc.numOfHits;
			
			if (hits == size) {
				System.out.println("Kill by using "+GUESS+" guesses.");
			}
		}
		

	}

}
