package datafiles;

public class CD extends items{
	private String title;
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void print() {
		System.out.println(title+":"+artist);
		
	}

}
