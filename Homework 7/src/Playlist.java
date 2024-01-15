//Steven Yan
//115780161


import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
	
	private String playlistTitle;
	private ArrayList<Song> songs = new ArrayList<>();
	
	Playlist(String playlistTitle){
		this.playlistTitle = playlistTitle;
	}
	
	public String getPlaylistTitle() {
		return this.playlistTitle;
	}
	
	public void setTitle(String playlistTitle) {
		this.playlistTitle = playlistTitle;
	}
	
	public void addSong(Song s) {
		songs.add(s);

	}
	
	public void sortSongs() {
		Song[] songArray = songs.toArray(new Song[0]);
		Arrays.sort(songArray);
		songs = new ArrayList<Song>(Arrays.asList(songArray));
		
	}
	
	
	
	public void removeSong(String songTitle){
		for(int i = 0; i < songs.size(); i++) {
			if(songs.get(i).getSongName().equals(songTitle)) {
				songs.remove(i);
				break;
			}
		}
	}
	
	public void swapSongs(Song song1, Song song2) {
		if(songs.contains(song1) && songs.contains(song2)) {
			int index1 = songs.indexOf(song1);
			int index2 = songs.indexOf(song2);
			
			songs.set(index2, song1);
			songs.set(index1, song2);
			
		}
	}
	
	public String getTime() {
		
		int time = 0;
		
		for(Song el: songs) {
			String songTime = el.getDuration();
			String[] timePart = songTime.split(":");
			time += (Integer.parseInt(timePart[0]) * 60  + Integer.parseInt(timePart[1]));
		}
		int mins = time / 60;
		int sec = time%60;
		
		return mins + " min, " + sec + " sec";
		
	}
	

	public String toString() {
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < songs.size(); i++) {
			s.append(i+1 +". " + songs.get(i) + "\n");
		}
		
		return this.playlistTitle + " - "+  this.getTime() + "\n" + s;
		
	}
	
	
	
	public static void main(String[] args) {
		Playlist p = new Playlist("Test");
		
		Song s1 = new Song("Song1", "Post", "3:10");
		Song s2 = new Song("SongLast", "M", "2:45");
		
		p.addSong(s1);
		p.addSong(new Song("ABC", "Artist101", "3:10"));
		p.addSong(new Song("ABC", "Artist103", "3:10"));
		p.addSong(new Song("ABC", "Artist102", "3:10"));
		p.addSong(s2);
		p.swapSongs(s1, s2);
		
		System.out.println(p);
		p.sortSongs();
		System.out.println(p);
		
		
	}
	
	
}
