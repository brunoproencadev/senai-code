package Classes;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private List<Movie> movies;

    public User(String name, String email) {
        super(name, email);
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public boolean removeMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            movies.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Usuário: " + getName() + " | Email: " + getEmail());
    }
}
