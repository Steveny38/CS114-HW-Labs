//Steven Yan
//115780161


import java.util.ArrayList;
public class User {
	
	private String userName;
	private ArrayList<Playlist> playlists = new ArrayList<>();
	
	User(String userName){
		this.userName = userName;
	}
	
	public String getName() {
		return this.userName;
	}
	
	public String getUsername() {
		return this.userName;
	}

	public void addPlaylist(Playlist pl) {
		this.playlists.add(pl);
	}
	
	public void removePlaylist(String title) {
		for(int i = 0; i < playlists.size(); i++) {
			if(playlists.get(i).getPlaylistTitle().equals(title)) {
				playlists.remove(i);
				break;
			}
		}
	}
	
	public ArrayList<Playlist> getAllPlaylists(){
		return this.playlists;
	}
	
	public Playlist getPlaylist(String playlistName) {
		for(Playlist el: playlists) {
			if(el.getPlaylistTitle().equals(playlistName)) {
				return el;
			}
		}
		return null;
	}
	
	void makeCollaborativePlaylist(String playlistTitle, User friend) {
		for(Playlist el: playlists) {
			if(el.getPlaylistTitle().equals(playlistTitle)) {
				friend.addPlaylist(el);
			}
		}
	}
	
	public String toString() {
		StringBuilder playlist = new StringBuilder();
		
		for(Playlist el: playlists) {
			playlist.append(el.getPlaylistTitle() + " - " + el.getTime() + "\n");
		}
		
		return userName + "\n" + playlist;
	}
		
	
	
	public static void main(String[] args) {
	
		Song s1 = new Song("TEST", "ABC", "1:10");
		Song s2 = new Song("TEST2", "ABC", "1:10");
		
		Playlist pl1 = new Playlist("ASDF");
		Playlist pl2 = new Playlist("jkl;");
		
		pl2.addSong(s1);
		
		User Steven = new User("Steven");
		User Friend = new User("Friend");
		
		Steven.addPlaylist(pl2);
		
		Steven.makeCollaborativePlaylist("jkl;", Friend);
		
		System.out.println(Steven.getAllPlaylists());
		
		System.out.println(Friend.getAllPlaylists());
		
		Friend.getPlaylist("jkl;").addSong(s2);

		System.out.println(Steven.getAllPlaylists());
		System.out.println(Friend.getAllPlaylists());
		
		System.out.println(Steven);
		
	}

}
