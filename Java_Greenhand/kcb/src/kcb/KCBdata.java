package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBdata implements TableModel {
	private String[] titles = {
			"Mon","Tue","Wen","Thu","Fri","Sat","Sun"
	};
	private String[][] data = new String[8][7];
	
	

	public KCBdata() {
		for (int i=0;i<data.length;i++) {
			for (int j=0;j<data[i].length;j++) {
				data[i][j] = "";
			}
		}
	}

	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return titles[arg0];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return data[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		data[arg1][arg2] = (String)arg0;
	}

}
