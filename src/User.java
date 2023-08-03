import java.util.List;

public class User {
    private String name;
    private int age;
    private String[] genres;
    private List<Movie> recommendedMovies;
    private String password;
    private String username;

    public User(String name, int age, String[] genres, String username, String password) {
        this.name = name;
        this.age = age;
        this.genres = genres;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getGenres() {
        return genres;
    }

    public List<Movie> getRecommendedMovies() {
        return recommendedMovies;
    }
    public void addMovie(Movie movie){
        this.recommendedMovies.add(movie);
    }
}
