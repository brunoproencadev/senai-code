package prjsenaimusic.classes;

public abstract class AudioMedia {
	private String title;
    private int durationInSeconds;
    private int releaseYear;

    public AudioMedia(String title, int durationInSeconds, int releaseYear) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
        this.releaseYear = releaseYear;
    }

    public abstract String getType();
    public String getTitle() { 
    	return title; 
	}
    public int getDurationInSeconds() { 
    	return durationInSeconds; 
	}
    public int getReleaseYear() { 
    	return releaseYear; 
	}
}