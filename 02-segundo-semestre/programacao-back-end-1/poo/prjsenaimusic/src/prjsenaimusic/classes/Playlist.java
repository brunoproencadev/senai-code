package prjsenaimusic.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String title;
    private LocalDate creationDate;
    private List<AudioMedia> items;

    public Playlist(String title) {
        this.title = title;
        this.creationDate = LocalDate.now();
        this.items = new ArrayList<>();
    }

    public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setItems(List<AudioMedia> items) {
		this.items = items;
	}
	public String getTitle() { 
    	return title; 
	}
    public List<AudioMedia> getItems() { 
    	return items; 
	}
    
    public void addMedia(AudioMedia media) {
        this.items.add(media);
    }
}
