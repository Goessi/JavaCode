package cityDistances;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class cityDistances{
	private HashMap<String, Integer> cd = new HashMap<String, Integer>();
//	private HashSet<String> s = new HashSet<String>();
	private int[][] distances;
	private int i=0;
		
	public void inputName(String name) {
		if (!name.equals("###")) {
			cd.put(name, i);
			i++;			
		}		
	}
	
	public int[][] getMap() {
		int s = cd.keySet().size();
		distances = new int[s][s];
		return distances;
	}
	
	public void inputDistances(int m,int n,int v) {
		distances[m][n] = v;
	}
	
	public int getDis(String name1, String name2) {
		int m = cd.get(name1);
		int n = cd.get(name2);
		return distances[m][n];
	}	
}


public class CityD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		cityDistances cd = new cityDistances();
		String s;
		int[][] map;
		
		do {
			s = in.next();
			cd.inputName(s);			
		}while(!s.equals("###"));
		
		map = cd.getMap();
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++) {
				cd.inputDistances(i, j, in.nextInt());
			}
		}

		System.out.println(cd.getDis(in.next(), in.next()));		

	}

}
