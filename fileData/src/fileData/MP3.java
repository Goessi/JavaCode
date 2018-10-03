package fileData;

public class MP3 extends Item {
	private int numofStars;

	@Override
	public void print() {
		System.out.println("This is a MP3");
		super.print();
	}

	public MP3(String title, String artist, int playingTime, boolean gotIt, String comment,int num) {
		super(title, artist, playingTime, gotIt, comment);
		this.numofStars = num;
	}


}
