//Steven Yan
//115780161

public class Song implements Comparable {
	
	private String songName;
	private String artistName;
	private String duration;
	
	Song(String songName, String artistName, String duration){
		this.songName = songName;
		this.artistName = artistName;
		this.duration = duration;
	}
	
	public String getSongName() {
		return this.songName;
	}
	
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public String getArtistName() {
		return this.artistName;
	}
	
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	public String getDuration() {
		return this.duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return songName + " by " + artistName + " (" + duration + ")";
	}
	
	public static void main(String[] args) {
		Song s = new Song("ASD", "Artist", "3:30");
		System.out.println(s);
	}

	public int compareTo(Object o) {
	    Song O = (Song) o;

	    int songNameComparison = this.getSongName().compareTo(O.getSongName());

	    if (songNameComparison == 0) {
	        return this.getArtistName().compareTo(O.getArtistName());
	    }

	    return songNameComparison;
	}

}
