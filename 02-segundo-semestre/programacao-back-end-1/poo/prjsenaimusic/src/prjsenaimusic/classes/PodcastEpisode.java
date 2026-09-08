package prjsenaimusic.classes;

public class PodcastEpisode extends AudioMedia {
	private String showName;
    private String guestName;

    public PodcastEpisode(String title, int durationInSeconds, int releaseYear, 
                          String showName, String guestName) {
        super(title, durationInSeconds, releaseYear);
        this.showName = showName;
        this.guestName = guestName;
    }

    public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	@Override
    public String getType() {
        return "Podcast";
    }
}
