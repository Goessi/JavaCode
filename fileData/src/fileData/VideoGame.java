package fileData;

public class VideoGame extends Item {
	private int numofPlayers;
	
	

	public VideoGame(String title, String artist, int playingTime, boolean gotIt, String comment,int number) {
		super(title, artist, playingTime, gotIt, comment);
		this.numofPlayers = number;
	}



	@Override
	public void print() {
		System.out.println("VideoGame");
		super.print();
	}



}
