package kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class KCB {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new KCBdata());
		JScrollPane pane = new JScrollPane(table);
		frame.add(table);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
