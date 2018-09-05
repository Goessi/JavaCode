package notebook;

import java.util.ArrayList;

public class haha {
	private ArrayList<String> haha = new ArrayList<String>();
	
	public void add(String s) {
		haha.add(s);
	}
	
	public String[] getList() {
		String[] a = new String[haha.size()];
		haha.toArray(a);
		return a;
	}

	public static void main(String[] args) {
		String s1 = "yoyo";
		String s2 = "xixi";
		String s3 = "haha";
		haha a = new haha();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		for(String s:a.getList()) {
			System.out.println(s);
		}
		
		s1 = "wowowowowo";
		for(String s:a.getList()) {
			System.out.println(s);
		}
		

	}

}
