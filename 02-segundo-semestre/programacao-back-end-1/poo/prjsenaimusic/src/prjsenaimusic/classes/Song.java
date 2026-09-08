package prjsenaimusic.classes;

import prjsenaimusic.enums.MusicGenre;

public class Song extends AudioMedia {
    private String artistName;
    private String album;
    private MusicGenre genre;

    public Song(String title, int durationInSeconds, int releaseYear, 
                String artistName, String album, MusicGenre genre) {
        super(title, durationInSeconds, releaseYear);
        this.artistName = artistName;
        this.album = album;
        this.genre = genre;
    }

	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public MusicGenre getGenre() {
		return genre;
	}
	public void setGenre(MusicGenre genre) {
		this.genre = genre;
	}
	
	@Override
    public String getType() {
        return "Música"; // Retorna para exibição no console
    }
}
