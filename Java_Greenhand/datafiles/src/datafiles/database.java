package datafiles;

import java.util.ArrayList;

public class database {
	private ArrayList<items> itemList = new ArrayList<items>();
	
	public void add(items it) {
		itemList.add(it);
	}
	
	public void list() {
		for(items it:itemList) {
			it.print();
		}
	}

	public static void main(String[] args) {
		database db = new database();
		db.add(new CD("haha", "QIN", 100, 222, "yoyoyoyoy"));
		db.add(new CD("xixi","qin",40,222,"iiiiiiiiiii"));
		db.add(new DVD("ooo","qin",1,"ooooooooo"));
		db.list();

	}

}
