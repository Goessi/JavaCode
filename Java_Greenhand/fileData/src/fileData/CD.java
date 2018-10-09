package fileData;

public class CD extends Item {
//	private String title;
//	private String artist;
	private int numofTracks;
//	private int playingTime;
//	private boolean gotIt;
//	private String comment;
	private String haha;

	public CD(String title, String artist, int numofTracks, int playingTime, boolean gotIt, String comment,String haha) {
		super(title,artist,playingTime,gotIt,comment);
//		this.title = title;
//		this.artist = artist;
		this.numofTracks = numofTracks;
		this.haha = haha;
//		this.playingTime = playingTime;
//		this.gotIt = gotIt;
//		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CD [numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}


	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return haha.equals(cc.haha);
	}

	public static void main(String[] args) {
		CD cd = new CD("a","b",1,2,false,"C","haha");
		CD cd1 = new CD("a","b",1,2,false,"C","haha");
		System.out.println(cd.toString());
		System.out.println(cd.equals(cd1));

	}

//	public void print() {
//
//		System.out.println(title+":"+artist);
//	}

}
