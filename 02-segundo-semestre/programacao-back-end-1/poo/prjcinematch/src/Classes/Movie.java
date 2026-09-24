package Classes;

public class Movie extends Media {
    private int duration;

    public Movie(String title, int releaseYear, int duration, Genre genre) {
        super(title, releaseYear, genre);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails(int index) {
        System.out.println((index + 1) + ". " + getTitle() + 
                           " (" + getReleaseYear() + ") - " + 
                           this.duration + " min | Gênero: " + 
                           getGenre().getName());
    }
}