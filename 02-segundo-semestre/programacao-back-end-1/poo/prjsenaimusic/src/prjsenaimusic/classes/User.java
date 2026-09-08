package prjsenaimusic.classes;

public class User {
	private String username;
    private String email;
    private Playlist myPlaylist;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() { 
    	return username; 
	}
	public void setMyPlaylist(Playlist myPlaylist) {
        this.myPlaylist = myPlaylist;
    }
    public Playlist getMyPlaylist() { 
    	return myPlaylist; 
	}
}
