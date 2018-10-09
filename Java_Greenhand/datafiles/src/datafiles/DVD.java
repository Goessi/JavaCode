package datafiles;

public class DVD extends items{
	private String title;
	private String director;
	

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,comment);
		this.director = director;
	}
	
//	public void print() {
//		System.out.println(title+":"+director);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
