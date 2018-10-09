package fileData;

public class Item {
	private String title;
	private String artist;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
	public Item() {
		
	}

	
	public Item(String title, String artist, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void print() {
		System.out.println(title);		
	}

}
