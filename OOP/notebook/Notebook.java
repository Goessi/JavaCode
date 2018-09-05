package notebook;

import java.util.ArrayList;

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();
	private int size;
	
	public void add(String s) {
		notes.add(s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i=0;i<notes.size();i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public void add(int location,String s) {
		notes.add(location, s);
	}

	public static void main(String[] args) {
		Notebook nb = new Notebook();
		nb.add("hahhahahahaha");
		nb.add("xixiixixxi");
		nb.add(1, "yoyoyoyoyyo");
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
		String[] b = nb.list();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
