package fileData;

public class DVD extends Item {
//	private String title;
//	private String artist;
//	private int playingTime;
//	private boolean gotIt;
//	private String comment;

	public DVD(String title, String artist, int playingTime, boolean gotIt, String comment) {
		super(title, artist, playingTime, gotIt, comment);
//		this.title = title;
//		this.artist = artist;
//		this.playingTime = playingTime;
//		this.gotIt = gotIt;
//		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd =  new DVD("a","b",1,false,"haha");
		dvd.print();

	}
	public void print() {
		// TODO Auto-generated method stub
		
//		System.out.println(title+":"+artist);
		System.out.print("DVD ");
		super.print();
		
	}


}
